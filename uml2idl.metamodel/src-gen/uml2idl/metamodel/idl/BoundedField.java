/**
 */
package uml2idl.metamodel.idl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.BoundedField#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.BoundedField#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getBoundedField()
 * @model abstract="true"
 * @generated
 */
public interface BoundedField extends Field {
	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Value</em>' attribute.
	 * @see #setLowerValue(Integer)
	 * @see uml2idl.metamodel.idl.IdlPackage#getBoundedField_LowerValue()
	 * @model dataType="uml2idl.metamodel.idl.i32"
	 * @generated
	 */
	Integer getLowerValue();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.BoundedField#getLowerValue <em>Lower Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' attribute.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Value</em>' attribute.
	 * @see #setUpperValue(Integer)
	 * @see uml2idl.metamodel.idl.IdlPackage#getBoundedField_UpperValue()
	 * @model dataType="uml2idl.metamodel.idl.i32"
	 * @generated
	 */
	Integer getUpperValue();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.BoundedField#getUpperValue <em>Upper Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' attribute.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(Integer value);

} // BoundedField
