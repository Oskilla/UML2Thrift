/**
 */
package uml2idl.metamodel.idl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Byte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.FieldByte#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getFieldByte()
 * @model
 * @generated
 */
public interface FieldByte extends Field {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Byte)
	 * @see uml2idl.metamodel.idl.IdlPackage#getFieldByte_Value()
	 * @model dataType="uml2idl.metamodel.idl.byte"
	 * @generated
	 */
	Byte getValue();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.FieldByte#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Byte value);

} // FieldByte
