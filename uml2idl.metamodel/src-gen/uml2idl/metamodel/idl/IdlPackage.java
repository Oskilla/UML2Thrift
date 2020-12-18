/**
 */
package uml2idl.metamodel.idl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uml2idl.metamodel.idl.IdlFactory
 * @model kind="package"
 * @generated
 */
public interface IdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "idl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "idl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdlPackage eINSTANCE = uml2idl.metamodel.idl.impl.IdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.ServiceImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__FUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.IDLModelImpl <em>IDL Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.IDLModelImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getIDLModel()
	 * @generated
	 */
	int IDL_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL__SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL__STRUCTURES = 2;

	/**
	 * The number of structural features of the '<em>IDL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>IDL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.TypeImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.StructureImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>EType</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__ETYPE = TYPE__ETYPE;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__FIELD = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FieldImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FunctionImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FIELD = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.AcceptedType <em>Accepted Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.AcceptedType
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getAcceptedType()
	 * @generated
	 */
	int ACCEPTED_TYPE = 6;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.NewEnum2 <em>New Enum2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.NewEnum2
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getNewEnum2()
	 * @generated
	 */
	int NEW_ENUM2 = 7;

	/**
	 * The meta object id for the '<em>bool</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getbool()
	 * @generated
	 */
	int BOOL = 8;

	/**
	 * The meta object id for the '<em>byte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Byte
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getbyte()
	 * @generated
	 */
	int BYTE = 9;

	/**
	 * The meta object id for the '<em>i16</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#geti16()
	 * @generated
	 */
	int I16 = 10;

	/**
	 * The meta object id for the '<em>i32</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#geti32()
	 * @generated
	 */
	int I32 = 11;

	/**
	 * The meta object id for the '<em>long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getlong()
	 * @generated
	 */
	int LONG = 12;

	/**
	 * The meta object id for the '<em>double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getdouble()
	 * @generated
	 */
	int DOUBLE = 13;

	/**
	 * The meta object id for the '<em>string</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getstring()
	 * @generated
	 */
	int STRING = 14;

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see uml2idl.metamodel.idl.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml2idl.metamodel.idl.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2idl.metamodel.idl.Service#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see uml2idl.metamodel.idl.Service#getFunction()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Function();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.IDLModel <em>IDL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Model</em>'.
	 * @see uml2idl.metamodel.idl.IDLModel
	 * @generated
	 */
	EClass getIDLModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2idl.metamodel.idl.IDLModel#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see uml2idl.metamodel.idl.IDLModel#getServices()
	 * @see #getIDLModel()
	 * @generated
	 */
	EReference getIDLModel_Services();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.IDLModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml2idl.metamodel.idl.IDLModel#getName()
	 * @see #getIDLModel()
	 * @generated
	 */
	EAttribute getIDLModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2idl.metamodel.idl.IDLModel#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structures</em>'.
	 * @see uml2idl.metamodel.idl.IDLModel#getStructures()
	 * @see #getIDLModel()
	 * @generated
	 */
	EReference getIDLModel_Structures();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see uml2idl.metamodel.idl.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2idl.metamodel.idl.Structure#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see uml2idl.metamodel.idl.Structure#getField()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Field();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see uml2idl.metamodel.idl.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml2idl.metamodel.idl.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the containment reference '{@link uml2idl.metamodel.idl.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see uml2idl.metamodel.idl.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see uml2idl.metamodel.idl.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml2idl.metamodel.idl.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2idl.metamodel.idl.Function#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see uml2idl.metamodel.idl.Function#getField()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Field();

	/**
	 * Returns the meta object for the containment reference '{@link uml2idl.metamodel.idl.Function#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see uml2idl.metamodel.idl.Function#getReturnType()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_ReturnType();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see uml2idl.metamodel.idl.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml2idl.metamodel.idl.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link uml2idl.metamodel.idl.Type#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EType</em>'.
	 * @see uml2idl.metamodel.idl.Type#getEType()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_EType();

	/**
	 * Returns the meta object for enum '{@link uml2idl.metamodel.idl.AcceptedType <em>Accepted Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accepted Type</em>'.
	 * @see uml2idl.metamodel.idl.AcceptedType
	 * @generated
	 */
	EEnum getAcceptedType();

	/**
	 * Returns the meta object for enum '{@link uml2idl.metamodel.idl.NewEnum2 <em>New Enum2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>New Enum2</em>'.
	 * @see uml2idl.metamodel.idl.NewEnum2
	 * @generated
	 */
	EEnum getNewEnum2();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>bool</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getbool();

	/**
	 * Returns the meta object for data type '{@link java.lang.Byte <em>byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>byte</em>'.
	 * @see java.lang.Byte
	 * @model instanceClass="java.lang.Byte"
	 * @generated
	 */
	EDataType getbyte();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>i16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>i16</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 * @generated
	 */
	EDataType geti16();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>i32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>i32</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType geti32();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>long</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getlong();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getdouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>string</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>string</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getstring();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdlFactory getIdlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.ServiceImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__FUNCTION = eINSTANCE.getService_Function();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.IDLModelImpl <em>IDL Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.IDLModelImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getIDLModel()
		 * @generated
		 */
		EClass IDL_MODEL = eINSTANCE.getIDLModel();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_MODEL__SERVICES = eINSTANCE.getIDLModel_Services();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_MODEL__NAME = eINSTANCE.getIDLModel_Name();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_MODEL__STRUCTURES = eINSTANCE.getIDLModel_Structures();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.StructureImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__FIELD = eINSTANCE.getStructure_Field();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FieldImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FunctionImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FIELD = eINSTANCE.getFunction_Field();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.TypeImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ETYPE = eINSTANCE.getType_EType();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.AcceptedType <em>Accepted Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.AcceptedType
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getAcceptedType()
		 * @generated
		 */
		EEnum ACCEPTED_TYPE = eINSTANCE.getAcceptedType();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.NewEnum2 <em>New Enum2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.NewEnum2
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getNewEnum2()
		 * @generated
		 */
		EEnum NEW_ENUM2 = eINSTANCE.getNewEnum2();

		/**
		 * The meta object literal for the '<em>bool</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getbool()
		 * @generated
		 */
		EDataType BOOL = eINSTANCE.getbool();

		/**
		 * The meta object literal for the '<em>byte</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Byte
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getbyte()
		 * @generated
		 */
		EDataType BYTE = eINSTANCE.getbyte();

		/**
		 * The meta object literal for the '<em>i16</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#geti16()
		 * @generated
		 */
		EDataType I16 = eINSTANCE.geti16();

		/**
		 * The meta object literal for the '<em>i32</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#geti32()
		 * @generated
		 */
		EDataType I32 = eINSTANCE.geti32();

		/**
		 * The meta object literal for the '<em>long</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getlong()
		 * @generated
		 */
		EDataType LONG = eINSTANCE.getlong();

		/**
		 * The meta object literal for the '<em>double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getdouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getdouble();

		/**
		 * The meta object literal for the '<em>string</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getstring()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getstring();

	}

} //IdlPackage
