/**
 * Copyright (c) 2012 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package ac.soton.eventb.emf.diagrams.generator.utils;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.Project;

import ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;

/**
 * Convenience methods for finding things needed in Generator Rules
 * 
 * @author cfs
 *
 */
public class Find {
	
/**
 * Find by name, an element in a list of EventBNamed elements
 * @param collection
 * @param name
 * @return
 */
	public static EventBNamed named(EList<? extends EventBNamed> collection, String name){
		for (EventBNamed element : collection){
			if (name.equals(element.getName())) return element;
		}
		return null;
	}
	
/**
 * Find, by name or label and matching parent and feature, a generation descriptor from the given collection
 * (parent and/or feature may be null if not required to be matched)
 * 
 * @param generatedElements
 * @param parent (or null)
 * @param feature (or null)
 * @param identifier
 * @return
 */
	public static Object generatedElement(List<GenerationDescriptor> generatedElements, EventBElement parent, EStructuralFeature feature, String identifier) {
		for (GenerationDescriptor generatedElement : generatedElements){
			if ((parent == null || generatedElement.parent == parent) && 
				(feature == null || generatedElement.feature== feature)){
				if ((generatedElement.value instanceof EventBNamed && ((EventBNamed)generatedElement.value).getName().equals(identifier))
				|| (generatedElement.value instanceof EventBLabeled && ((EventBLabeled)generatedElement.value).getLabel().equals(identifier))) 
					return generatedElement.value;
			}
		}
		return null;
	}

	/**
	 * find the containing Project for this element
	 * 
	 * CURRENTLY RETURNS NULL
	 * 
	 * @param machine
	 * @return
	 * @throws IOException
	 */
	public static Project project(EventBElement eventBelement) throws IOException {
//		URI eventBelementUri = eventBelement.getURI();
//		URI projectUri = eventBelementUri.trimFragment().trimSegments(1);
//		ProjectResource projectResource = new ProjectResource();
//		projectResource.setURI(eventBelement.getURI());
//		projectResource.load(null);
//		for (EObject eObject : projectResource.getContents()){
//			if (eObject instanceof Project){
//				return (Project)eObject;
//			}
//		}
		return null;
	}

}
