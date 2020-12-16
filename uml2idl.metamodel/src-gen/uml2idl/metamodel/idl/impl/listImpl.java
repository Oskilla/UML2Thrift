/**
 */
package uml2idl.metamodel.idl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uml2idl.metamodel.idl.Containers;
import uml2idl.metamodel.idl.IdlPackage;
import uml2idl.metamodel.idl.list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.impl.listImpl#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class listImpl extends MinimalEObjectImpl.Container implements list {
	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<Containers> containers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected listImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Containers> getContainers() {
		if (containers == null) {
			containers = new EObjectResolvingEList<Containers>(Containers.class, this, IdlPackage.LIST__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IdlPackage.LIST__CONTAINERS:
			return getContainers();
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
		case IdlPackage.LIST__CONTAINERS:
			getContainers().clear();
			getContainers().addAll((Collection<? extends Containers>) newValue);
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
		case IdlPackage.LIST__CONTAINERS:
			getContainers().clear();
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
		case IdlPackage.LIST__CONTAINERS:
			return containers != null && !containers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //listImpl
