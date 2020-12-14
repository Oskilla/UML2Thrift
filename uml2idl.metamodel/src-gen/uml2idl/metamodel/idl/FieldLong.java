/**
 */
package uml2idl.metamodel.idl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Long</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.FieldLong#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getFieldLong()
 * @model
 * @generated
 */
public interface FieldLong extends BoundedField {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Long)
	 * @see uml2idl.metamodel.idl.IdlPackage#getFieldLong_Value()
	 * @model dataType="uml2idl.metamodel.idl.long"
	 * @generated
	 */
	Long getValue();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.FieldLong#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Long value);

} // FieldLong
