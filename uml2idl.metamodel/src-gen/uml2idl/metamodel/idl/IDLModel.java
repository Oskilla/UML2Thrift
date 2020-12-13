/**
 */
package uml2idl.metamodel.idl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDL Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.IDLModel#getServices <em>Services</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.IDLModel#getName <em>Name</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.IDLModel#getStructures <em>Structures</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.IDLModel#getTypedef <em>Typedef</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getIDLModel()
 * @model
 * @generated
 */
public interface IDLModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link uml2idl.metamodel.idl.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see uml2idl.metamodel.idl.IdlPackage#getIDLModel_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uml2idl.metamodel.idl.IdlPackage#getIDLModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.IDLModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link uml2idl.metamodel.idl.Structure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see uml2idl.metamodel.idl.IdlPackage#getIDLModel_Structures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Structure> getStructures();

	/**
	 * Returns the value of the '<em><b>Typedef</b></em>' containment reference list.
	 * The list contents are of type {@link uml2idl.metamodel.idl.TypeDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typedef</em>' containment reference list.
	 * @see uml2idl.metamodel.idl.IdlPackage#getIDLModel_Typedef()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeDef> getTypedef();

} // IDLModel
