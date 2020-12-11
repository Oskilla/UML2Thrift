/**
 */
package uml2idl.metamodel.idl;

import oracle.dss.util.xdo.common.io.ByteArray;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Byte Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.FieldByteArray#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getFieldByteArray()
 * @model
 * @generated
 */
public interface FieldByteArray extends Field {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(ByteArray)
	 * @see uml2idl.metamodel.idl.IdlPackage#getFieldByteArray_Values()
	 * @model dataType="uml2idl.metamodel.idl.byteArray"
	 * @generated
	 */
	ByteArray getValues();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.FieldByteArray#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(ByteArray value);

} // FieldByteArray
