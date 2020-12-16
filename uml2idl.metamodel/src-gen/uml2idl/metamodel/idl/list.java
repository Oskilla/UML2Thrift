/**
 */
package uml2idl.metamodel.idl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.list#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getlist()
 * @model
 * @generated
 */
public interface list extends EObject {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link uml2idl.metamodel.idl.Containers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see uml2idl.metamodel.idl.IdlPackage#getlist_Containers()
	 * @model
	 * @generated
	 */
	EList<Containers> getContainers();

} // list
