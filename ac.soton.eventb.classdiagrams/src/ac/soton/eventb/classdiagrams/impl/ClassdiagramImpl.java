/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ac.soton.eventb.classdiagrams.impl;


import ac.soton.eventb.classdiagrams.Association;
import ac.soton.eventb.classdiagrams.Classdiagram;
import ac.soton.eventb.classdiagrams.ClassdiagramsPackage;
import ac.soton.eventb.emf.diagrams.Diagram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.CorePackage;

import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classdiagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.classdiagrams.impl.ClassdiagramImpl#getExtensionId <em>Extension Id</em>}</li>
 *   <li>{@link ac.soton.eventb.classdiagrams.impl.ClassdiagramImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link ac.soton.eventb.classdiagrams.impl.ClassdiagramImpl#getClassAssociations <em>Class Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassdiagramImpl extends EventBNamedCommentedElementImpl implements Classdiagram {

	/**
	 * The default value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String EXTENSION_ID_EDEFAULT = ClassdiagramsPackage.CLASSDIAGRAMS_EXTENSION_ID;

	/**
	 * The cached value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated NOT
	 * @ordered
	 */
	protected String extensionId = EXTENSION_ID_EDEFAULT+"."+EcoreUtil.generateUUID();

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ac.soton.eventb.classdiagrams.Class> classes;

	/**
	 * The cached value of the '{@link #getClassAssociations() <em>Class Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> classAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassdiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassdiagramsPackage.Literals.CLASSDIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionId() {
		return extensionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionId(String newExtensionId) {
		String oldExtensionId = extensionId;
		extensionId = newExtensionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassdiagramsPackage.CLASSDIAGRAM__EXTENSION_ID, oldExtensionId, extensionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ac.soton.eventb.classdiagrams.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList.Resolving<ac.soton.eventb.classdiagrams.Class>(ac.soton.eventb.classdiagrams.Class.class, this, ClassdiagramsPackage.CLASSDIAGRAM__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getClassAssociations() {
		if (classAssociations == null) {
			classAssociations = new EObjectContainmentEList.Resolving<Association>(Association.class, this, ClassdiagramsPackage.CLASSDIAGRAM__CLASS_ASSOCIATIONS);
		}
		return classAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassdiagramsPackage.CLASSDIAGRAM__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case ClassdiagramsPackage.CLASSDIAGRAM__CLASS_ASSOCIATIONS:
				return ((InternalEList<?>)getClassAssociations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassdiagramsPackage.CLASSDIAGRAM__EXTENSION_ID:
				return getExtensionId();
			case ClassdiagramsPackage.CLASSDIAGRAM__CLASSES:
				return getClasses();
			case ClassdiagramsPackage.CLASSDIAGRAM__CLASS_ASSOCIATIONS:
				return getClassAssociations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassdiagramsPackage.CLASSDIAGRAM__EXTENSION_ID:
				setExtensionId((String)newValue);
				return;
			case ClassdiagramsPackage.CLASSDIAGRAM__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ac.soton.eventb.classdiagrams.Class>)newValue);
				return;
			case ClassdiagramsPackage.CLASSDIAGRAM__CLASS_ASSOCIATIONS:
				getClassAssociations().clear();
				getClassAssociations().addAll((Collection<? extends Association>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassdiagramsPackage.CLASSDIAGRAM__EXTENSION_ID:
				setExtensionId(EXTENSION_ID_EDEFAULT);
				return;
			case ClassdiagramsPackage.CLASSDIAGRAM__CLASSES:
				getClasses().clear();
				return;
			case ClassdiagramsPackage.CLASSDIAGRAM__CLASS_ASSOCIATIONS:
				getClassAssociations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassdiagramsPackage.CLASSDIAGRAM__EXTENSION_ID:
				return EXTENSION_ID_EDEFAULT == null ? extensionId != null : !EXTENSION_ID_EDEFAULT.equals(extensionId);
			case ClassdiagramsPackage.CLASSDIAGRAM__CLASSES:
				return classes != null && !classes.isEmpty();
			case ClassdiagramsPackage.CLASSDIAGRAM__CLASS_ASSOCIATIONS:
				return classAssociations != null && !classAssociations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractExtension.class) {
			switch (derivedFeatureID) {
				case ClassdiagramsPackage.CLASSDIAGRAM__EXTENSION_ID: return CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID;
				default: return -1;
			}
		}
		if (baseClass == Diagram.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractExtension.class) {
			switch (baseFeatureID) {
				case CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID: return ClassdiagramsPackage.CLASSDIAGRAM__EXTENSION_ID;
				default: return -1;
			}
		}
		if (baseClass == Diagram.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extensionId: ");
		result.append(extensionId);
		result.append(')');
		return result.toString();
	}

} //ClassdiagramImpl