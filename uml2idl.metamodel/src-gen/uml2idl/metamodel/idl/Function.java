/**
 */
package uml2idl.metamodel.idl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml2idl.metamodel.idl.Function#getName <em>Name</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.Function#getField <em>Field</em>}</li>
 *   <li>{@link uml2idl.metamodel.idl.Function#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see uml2idl.metamodel.idl.IdlPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uml2idl.metamodel.idl.IdlPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link uml2idl.metamodel.idl.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see uml2idl.metamodel.idl.IdlPackage#getFunction_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getField();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(Field)
	 * @see uml2idl.metamodel.idl.IdlPackage#getFunction_ReturnType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Field getReturnType();

	/**
	 * Sets the value of the '{@link uml2idl.metamodel.idl.Function#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Field value);

} // Function
