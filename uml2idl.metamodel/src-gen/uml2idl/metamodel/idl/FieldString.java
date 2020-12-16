/**
 */
package uml2idl.metamodel.idl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.FieldString#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getFieldString()
 * @model
 * @generated
 */
public interface FieldString extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see uml2idl.metamodel.idl.IdlPackage#getFieldString_Value()
	 * @model dataType="uml2idl.metamodel.idl.string"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.FieldString#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // FieldString
