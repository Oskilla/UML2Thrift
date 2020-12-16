/**
 */
package uml2idl.metamodel.idl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uml2idl.metamodel.idl.BoundedField;
import uml2idl.metamodel.idl.IdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounded Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.impl.BoundedFieldImpl#getId <em>Id</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.impl.BoundedFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.impl.BoundedFieldImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.impl.BoundedFieldImpl#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BoundedFieldImpl extends MinimalEObjectImpl.Container implements BoundedField {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getLowerValue() <em>Lower Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerValue = LOWER_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperValue() <em>Upper Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected Integer upperValue = UPPER_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundedFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlPackage.Literals.BOUNDED_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.BOUNDED_FIELD__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.BOUNDED_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(Integer newLowerValue) {
		Integer oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.BOUNDED_FIELD__LOWER_VALUE, oldLowerValue,
					lowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(Integer newUpperValue) {
		Integer oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.BOUNDED_FIELD__UPPER_VALUE, oldUpperValue,
					upperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IdlPackage.BOUNDED_FIELD__ID:
			return getId();
		case IdlPackage.BOUNDED_FIELD__NAME:
			return getName();
		case IdlPackage.BOUNDED_FIELD__LOWER_VALUE:
			return getLowerValue();
		case IdlPackage.BOUNDED_FIELD__UPPER_VALUE:
			return getUpperValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IdlPackage.BOUNDED_FIELD__ID:
			setId((Integer) newValue);
			return;
		case IdlPackage.BOUNDED_FIELD__NAME:
			setName((String) newValue);
			return;
		case IdlPackage.BOUNDED_FIELD__LOWER_VALUE:
			setLowerValue((Integer) newValue);
			return;
		case IdlPackage.BOUNDED_FIELD__UPPER_VALUE:
			setUpperValue((Integer) newValue);
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
		case IdlPackage.BOUNDED_FIELD__ID:
			setId(ID_EDEFAULT);
			return;
		case IdlPackage.BOUNDED_FIELD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case IdlPackage.BOUNDED_FIELD__LOWER_VALUE:
			setLowerValue(LOWER_VALUE_EDEFAULT);
			return;
		case IdlPackage.BOUNDED_FIELD__UPPER_VALUE:
			setUpperValue(UPPER_VALUE_EDEFAULT);
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
		case IdlPackage.BOUNDED_FIELD__ID:
			return id != ID_EDEFAULT;
		case IdlPackage.BOUNDED_FIELD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case IdlPackage.BOUNDED_FIELD__LOWER_VALUE:
			return LOWER_VALUE_EDEFAULT == null ? lowerValue != null : !LOWER_VALUE_EDEFAULT.equals(lowerValue);
		case IdlPackage.BOUNDED_FIELD__UPPER_VALUE:
			return UPPER_VALUE_EDEFAULT == null ? upperValue != null : !UPPER_VALUE_EDEFAULT.equals(upperValue);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", lowerValue: ");
		result.append(lowerValue);
		result.append(", upperValue: ");
		result.append(upperValue);
		result.append(')');
		return result.toString();
	}

} //BoundedFieldImpl
