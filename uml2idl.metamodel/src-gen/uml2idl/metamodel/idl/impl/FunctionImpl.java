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

import uml2idl.metamodel.idl.Field;
import uml2idl.metamodel.idl.Function;
import uml2idl.metamodel.idl.IdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.impl.FunctionImpl#getField <em>Field</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.impl.FunctionImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
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
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> field;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Field returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlPackage.Literals.FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<Field>(Field.class, this, IdlPackage.FUNCTION__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(Field newReturnType, NotificationChain msgs) {
		Field oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					IdlPackage.FUNCTION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Field newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject) returnType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - IdlPackage.FUNCTION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject) newReturnType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - IdlPackage.FUNCTION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.FUNCTION__RETURN_TYPE, newReturnType,
					newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IdlPackage.FUNCTION__FIELD:
			return ((InternalEList<?>) getField()).basicRemove(otherEnd, msgs);
		case IdlPackage.FUNCTION__RETURN_TYPE:
			return basicSetReturnType(null, msgs);
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
		case IdlPackage.FUNCTION__NAME:
			return getName();
		case IdlPackage.FUNCTION__FIELD:
			return getField();
		case IdlPackage.FUNCTION__RETURN_TYPE:
			return getReturnType();
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
		case IdlPackage.FUNCTION__NAME:
			setName((String) newValue);
			return;
		case IdlPackage.FUNCTION__FIELD:
			getField().clear();
			getField().addAll((Collection<? extends Field>) newValue);
			return;
		case IdlPackage.FUNCTION__RETURN_TYPE:
			setReturnType((Field) newValue);
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
		case IdlPackage.FUNCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case IdlPackage.FUNCTION__FIELD:
			getField().clear();
			return;
		case IdlPackage.FUNCTION__RETURN_TYPE:
			setReturnType((Field) null);
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
		case IdlPackage.FUNCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case IdlPackage.FUNCTION__FIELD:
			return field != null && !field.isEmpty();
		case IdlPackage.FUNCTION__RETURN_TYPE:
			return returnType != null;
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

} //FunctionImpl
