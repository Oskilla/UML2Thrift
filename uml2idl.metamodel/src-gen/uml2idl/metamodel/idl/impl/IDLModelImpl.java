/**
 */
package uml2idl.metamodel.idl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uml2idl.metamodel.idl.IDLModel;
import uml2idl.metamodel.idl.IdlPackage;
import uml2idl.metamodel.idl.Service;
import uml2idl.metamodel.idl.Structure;
import uml2idl.metamodel.idl.TypeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDL Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.impl.IDLModelImpl#getServices <em>Services</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.impl.IDLModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.impl.IDLModelImpl#getStructures <em>Structures</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.impl.IDLModelImpl#getTypedef <em>Typedef</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDLModelImpl extends MinimalEObjectImpl.Container implements IDLModel {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructures() <em>Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<Structure> structures;

	/**
	 * The cached value of the '{@link #getTypedef() <em>Typedef</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedef()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDef> typedef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDLModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlPackage.Literals.IDL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, IdlPackage.IDL_MODEL__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.IDL_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Structure> getStructures() {
		if (structures == null) {
			structures = new EObjectContainmentEList<Structure>(Structure.class, this,
					IdlPackage.IDL_MODEL__STRUCTURES);
		}
		return structures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDef> getTypedef() {
		if (typedef == null) {
			typedef = new EObjectContainmentEList<TypeDef>(TypeDef.class, this, IdlPackage.IDL_MODEL__TYPEDEF);
		}
		return typedef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IdlPackage.IDL_MODEL__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		case IdlPackage.IDL_MODEL__STRUCTURES:
			return ((InternalEList<?>) getStructures()).basicRemove(otherEnd, msgs);
		case IdlPackage.IDL_MODEL__TYPEDEF:
			return ((InternalEList<?>) getTypedef()).basicRemove(otherEnd, msgs);
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
		case IdlPackage.IDL_MODEL__SERVICES:
			return getServices();
		case IdlPackage.IDL_MODEL__NAME:
			return getName();
		case IdlPackage.IDL_MODEL__STRUCTURES:
			return getStructures();
		case IdlPackage.IDL_MODEL__TYPEDEF:
			return getTypedef();
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
		case IdlPackage.IDL_MODEL__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>) newValue);
			return;
		case IdlPackage.IDL_MODEL__NAME:
			setName((String) newValue);
			return;
		case IdlPackage.IDL_MODEL__STRUCTURES:
			getStructures().clear();
			getStructures().addAll((Collection<? extends Structure>) newValue);
			return;
		case IdlPackage.IDL_MODEL__TYPEDEF:
			getTypedef().clear();
			getTypedef().addAll((Collection<? extends TypeDef>) newValue);
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
		case IdlPackage.IDL_MODEL__SERVICES:
			getServices().clear();
			return;
		case IdlPackage.IDL_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case IdlPackage.IDL_MODEL__STRUCTURES:
			getStructures().clear();
			return;
		case IdlPackage.IDL_MODEL__TYPEDEF:
			getTypedef().clear();
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
		case IdlPackage.IDL_MODEL__SERVICES:
			return services != null && !services.isEmpty();
		case IdlPackage.IDL_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case IdlPackage.IDL_MODEL__STRUCTURES:
			return structures != null && !structures.isEmpty();
		case IdlPackage.IDL_MODEL__TYPEDEF:
			return typedef != null && !typedef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IDLModelImpl
