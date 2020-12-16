/**
 */
package uml2idl.metamodel.idl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.Structure#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends Type {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link uml2idl.metamodel.idl.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see uml2idl.metamodel.idl.IdlPackage#getStructure_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getField();

} // Structure
