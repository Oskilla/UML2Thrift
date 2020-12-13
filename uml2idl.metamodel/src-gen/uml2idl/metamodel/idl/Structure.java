/**
 */
package uml2idl.metamodel.idl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.Structure#getFieldstruct <em>Fieldstruct</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.Structure#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uml2idl.metamodel.idl.IdlPackage#getStructure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.Structure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fieldstruct</b></em>' containment reference list.
	 * The list contents are of type {@link uml2idl.metamodel.idl.FieldStruct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldstruct</em>' containment reference list.
	 * @see uml2idl.metamodel.idl.IdlPackage#getStructure_Fieldstruct()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldStruct> getFieldstruct();

} // Structure
