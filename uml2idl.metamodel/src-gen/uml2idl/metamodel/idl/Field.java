/**
 */
package uml2idl.metamodel.idl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.Field#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getField()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see uml2idl.metamodel.idl.IdlPackage#getField_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.Field#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Field
