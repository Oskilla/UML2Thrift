/**
 */
package uml2idl.metamodel.idl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field I32</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.FieldI32#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getFieldI32()
 * @model
 * @generated
 */
public interface FieldI32 extends Field {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see uml2idl.metamodel.idl.IdlPackage#getFieldI32_Value()
	 * @model dataType="uml2idl.metamodel.idl.i32"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.FieldI32#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // FieldI32
