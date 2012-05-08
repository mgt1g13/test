/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ac.soton.eventb.classdiagrams;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamedCommentedElement;

import org.eventb.emf.core.machine.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.classdiagrams.Class#getSupertypes <em>Supertypes</em>}</li>
 *   <li>{@link ac.soton.eventb.classdiagrams.Class#getClassAttributes <em>Class Attributes</em>}</li>
 *   <li>{@link ac.soton.eventb.classdiagrams.Class#getExtends <em>Extends</em>}</li>
 *   <li>{@link ac.soton.eventb.classdiagrams.Class#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ac.soton.eventb.classdiagrams.Class#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ac.soton.eventb.classdiagrams.Class#getRefines <em>Refines</em>}</li>
 *   <li>{@link ac.soton.eventb.classdiagrams.Class#getClassType <em>Class Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.classdiagrams.ClassdiagramsPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EventBNamedCommentedElement, ElaborativeElement {
	/**
	 * Returns the value of the '<em><b>Supertypes</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.eventb.classdiagrams.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertypes</em>' reference list.
	 * @see ac.soton.eventb.classdiagrams.ClassdiagramsPackage#getClass_Supertypes()
	 * @model
	 * @generated
	 */
	EList<Class> getSupertypes();

	/**
	 * Returns the value of the '<em><b>Class Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.classdiagrams.ClassAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Attributes</em>' containment reference list.
	 * @see ac.soton.eventb.classdiagrams.ClassdiagramsPackage#getClass_ClassAttributes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ClassAttribute> getClassAttributes();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Class)
	 * @see ac.soton.eventb.classdiagrams.ClassdiagramsPackage#getClass_Extends()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='parentIsConstant\n'"
	 * @generated
	 */
	Class getExtends();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.classdiagrams.Class#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Class value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.eventb.classdiagrams.Association}.
	 * It is bidirectional and its opposite is '{@link ac.soton.eventb.classdiagrams.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ac.soton.eventb.classdiagrams.ClassdiagramsPackage#getClass_Incoming()
	 * @see ac.soton.eventb.classdiagrams.Association#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Association> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.eventb.classdiagrams.Association}.
	 * It is bidirectional and its opposite is '{@link ac.soton.eventb.classdiagrams.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ac.soton.eventb.classdiagrams.ClassdiagramsPackage#getClass_Outgoing()
	 * @see ac.soton.eventb.classdiagrams.Association#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Association> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(Class)
	 * @see ac.soton.eventb.classdiagrams.ClassdiagramsPackage#getClass_Refines()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='parentIsNotConstant'"
	 * @generated
	 */
	Class getRefines();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.classdiagrams.Class#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(Class value);

	/**
	 * Returns the value of the '<em><b>Class Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ac.soton.eventb.classdiagrams.ClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Type</em>' attribute.
	 * @see ac.soton.eventb.classdiagrams.ClassType
	 * @see #setClassType(ClassType)
	 * @see ac.soton.eventb.classdiagrams.ClassdiagramsPackage#getClass_ClassType()
	 * @model
	 * @generated
	 */
	ClassType getClassType();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.classdiagrams.Class#getClassType <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type</em>' attribute.
	 * @see ac.soton.eventb.classdiagrams.ClassType
	 * @see #getClassType()
	 * @generated
	 */
	void setClassType(ClassType value);

} // Class