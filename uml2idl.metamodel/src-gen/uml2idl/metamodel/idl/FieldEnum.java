/**
 */
package uml2idl.metamodel.idl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.FieldEnum#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getFieldEnum()
 * @model
 * @generated
 */
public interface FieldEnum extends Field {
	/**
	 * Returns the value of the '<em><b>Enum</b></em>' reference list.
	 * The list contents are of type {@link uml2idl.metamodel.idl.Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' reference list.
	 * @see uml2idl.metamodel.idl.IdlPackage#getFieldEnum_Enum()
	 * @model
	 * @generated
	 */
	EList<uml2idl.metamodel.idl.Enum> getEnum();

} // FieldEnum
