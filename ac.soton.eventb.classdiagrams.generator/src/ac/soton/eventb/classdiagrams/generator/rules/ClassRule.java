package ac.soton.eventb.classdiagrams.generator.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.Attribute;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.Project;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.impl.InvariantImpl;


import ac.soton.eventb.classdiagrams.Class;
import ac.soton.eventb.classdiagrams.ClassAttribute;
import ac.soton.eventb.classdiagrams.Classdiagram;
import ac.soton.eventb.classdiagrams.generator.strings.Strings;
import ac.soton.eventb.classdiagrams.util.ClassdiagramUtil;
import ac.soton.eventb.classdiagrams.util.ClassdiagramsValidator;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Find;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;

public class ClassRule  extends AbstractRule  implements IRule {

	protected static final EReference components = CorePackage.Literals.PROJECT__COMPONENTS;
	protected static final EReference sees = MachinePackage.Literals.MACHINE__SEES;
	protected static final EReference sets = ContextPackage.Literals.CONTEXT__SETS;
	protected static final EReference constants = ContextPackage.Literals.CONTEXT__CONSTANTS;
	protected static final EReference axioms = ContextPackage.Literals.CONTEXT__AXIOMS;
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof Class);
//		return sourceElement == ClassdiagramUtil.getRootComponent(sourceElement);
		return true;
	}
	
	@Override
	public boolean dependenciesOK(EventBElement sourceElement, final List<GenerationDescriptor> generatedElements) throws Exception  {
		
//		Class c = (Class)sourceElement;
//		
//		if (c.getSupertypes().size() > 0){
//			for (Class superClass : c.getSupertypes()){
//				if (!supertypeDependenciesSatisfied(superClass, generatedElements)){
//					return false;
//				}
//			}
//		}
		
		return true; //cia
	}
	
	private boolean supertypeDependenciesSatisfied(Class c, List<GenerationDescriptor> generatedElements){
		for (GenerationDescriptor gd : generatedElements){
			if (gd.value instanceof InvariantImpl){
				InvariantImpl i = (InvariantImpl)gd.value;
				if (c.getName().concat(".inst") .equals(i.getName())){
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		
		System.out.println("generatedElements: " + generatedElements.size());
		
		assert(enabled(sourceElement));
		Class cp = (Class) sourceElement;
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		Event initialisation = (Event) Find.named(machine.getEvents(), "INITIALISATION");
		
		if (cp.isConstant()){
			Context context = null;
			
			//look for an already existing context
			for (GenerationDescriptor gd :  generatedElements){
				if (gd.value instanceof Context){
					if (((Context)gd.value).getName().equals(cp.getTargetContext())){
						context = (Context)gd.value;
					}
				}
			}
			
			//if nor found - create one
			if (context == null){
				context = (Context)Make.context(cp.getTargetContext(), "");
				ret.add(Make.descriptor(null, components, context,10));
				ret.add(Make.descriptor(machine, sees, context,10));
			}
			
			
			
			if (cp.getInstance() == null || cp.getInstance().isEmpty()){
				ret.add(Make.descriptor(context, sets, Make.set(cp.getName(), "wake up kinds"),10));
			} else {
				ret.add(Make.descriptor(context, constants, Make.constant(cp.getName(), "wake up kind: addEvent"),10));
				ret.add(Make.descriptor(context, axioms, Make.axiom(cp.getName(), cp.getInstance(), ""),10));			
			}
			
		} else {
			//add class variable
			ret.add(Make.descriptor(machine,variables,Make.variable(cp.getName(), cp.getComment()),10));
			
			//it's dynamic, so variable is defined in the machine
			if (cp.getSupertypes().size() > 0) {
				ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.CLASS_SUPERTYPE_NAME(cp), Strings.CLASS_SUPERTYPE_PRED(cp, cp.getSupertypes()), cp.getComment()),10));
			}
			
			//set instance
			//need instance field
			if (cp.getInstance() != null && !cp.getInstance().isEmpty()){
				ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.CLASS_INSTANCE_NAME(cp), Strings.CLASS_INSTANCE(cp), cp.getComment()),10));	
			}
			
			ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.CLASS_INITIALIZATION_NAME(cp), Strings.CLASS_INITIALIZATION_EXPR(cp), cp.getComment()),10));
		}
		
		//generate users component attributes 
//		for (ClassAttribute a : cp.getClassAttributes()){
//			ret.add(Make.descriptor(machine,variables,Make.variable("var1", "comment1"  ),10));				
//		}
		
		return ret;
	}

	private Context getContext(Class cp,
			List<GenerationDescriptor> generatedElements,
			Machine machine) {
		
		for (GenerationDescriptor gd :  generatedElements){
			if (gd.value instanceof Context){
				if (((Context)gd.value).getName().equals(cp.getTargetContext())){
					return (Context)gd.value;
				}
			}
		}
		
		Context context = (Context)Make.context(cp.getTargetContext(), "");
		
		return context;
	}	
	
}