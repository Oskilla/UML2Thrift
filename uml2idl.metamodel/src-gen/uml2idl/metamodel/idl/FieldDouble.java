/**
 */
package uml2idl.metamodel.idl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.FieldDouble#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getFieldDouble()
 * @model
 * @generated
 */
public interface FieldDouble extends BoundedField {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see uml2idl.metamodel.idl.IdlPackage#getFieldDouble_Value()
	 * @model dataType="uml2idl.metamodel.idl.double"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.FieldDouble#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

} // FieldDouble
