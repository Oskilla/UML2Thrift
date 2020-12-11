/**
 */
package uml2idl.metamodel.idl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uml2idl.metamodel.idl.IdlPackage
 * @generated
 */
public interface IdlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdlFactory eINSTANCE = uml2idl.metamodel.idl.impl.IdlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>IDL Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IDL Model</em>'.
	 * @generated
	 */
	IDLModel createIDLModel();

	/**
	 * Returns a new object of class '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure</em>'.
	 * @generated
	 */
	Structure createStructure();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Field Bool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Bool</em>'.
	 * @generated
	 */
	FieldBool createFieldBool();

	/**
	 * Returns a new object of class '<em>Field Byte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Byte</em>'.
	 * @generated
	 */
	FieldByte createFieldByte();

	/**
	 * Returns a new object of class '<em>Field Byte Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Byte Array</em>'.
	 * @generated
	 */
	FieldByteArray createFieldByteArray();

	/**
	 * Returns a new object of class '<em>Field Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Double</em>'.
	 * @generated
	 */
	FieldDouble createFieldDouble();

	/**
	 * Returns a new object of class '<em>Field I16</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field I16</em>'.
	 * @generated
	 */
	FieldI16 createFieldI16();

	/**
	 * Returns a new object of class '<em>Field I32</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field I32</em>'.
	 * @generated
	 */
	FieldI32 createFieldI32();

	/**
	 * Returns a new object of class '<em>Field Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Long</em>'.
	 * @generated
	 */
	FieldLong createFieldLong();

	/**
	 * Returns a new object of class '<em>Field String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field String</em>'.
	 * @generated
	 */
	FieldString createFieldString();

	/**
	 * Returns a new object of class '<em>Field Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Struct</em>'.
	 * @generated
	 */
	FieldStruct createFieldStruct();

	/**
	 * Returns a new object of class '<em>Field Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Function</em>'.
	 * @generated
	 */
	FieldFunction createFieldFunction();

	/**
	 * Returns a new object of class '<em>Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Def</em>'.
	 * @generated
	 */
	TypeDef createTypeDef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdlPackage getIdlPackage();

} //IdlFactory
