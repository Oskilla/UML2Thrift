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
	 * The feature id for the '<em><b>Structure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL__STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Typedef</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL__TYPEDEF = 3;

	/**
	 * The number of structural features of the '<em>IDL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IDL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL_OPERATION_COUNT = 0;

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
	int STRUCTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fieldstruct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__FIELDSTRUCT = 1;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FunctionImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fieldfunction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FIELDFUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.Field <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.Field
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = 1;

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
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FieldBoolImpl <em>Field Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FieldBoolImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldBool()
	 * @generated
	 */
	int FIELD_BOOL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BOOL__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BOOL__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BOOL__VALUE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BOOL_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BOOL_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FieldByteImpl <em>Field Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FieldByteImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldByte()
	 * @generated
	 */
	int FIELD_BYTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BYTE__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BYTE__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BYTE__VALUE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BYTE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BYTE_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FieldByteArrayImpl <em>Field Byte Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FieldByteArrayImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldByteArray()
	 * @generated
	 */
	int FIELD_BYTE_ARRAY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BYTE_ARRAY__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BYTE_ARRAY__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BYTE_ARRAY__VALUES = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Byte Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BYTE_ARRAY_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Byte Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BYTE_ARRAY_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FieldDoubleImpl <em>Field Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FieldDoubleImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldDouble()
	 * @generated
	 */
	int FIELD_DOUBLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DOUBLE__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DOUBLE__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DOUBLE__VALUE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DOUBLE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DOUBLE_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FieldI16Impl <em>Field I16</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FieldI16Impl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldI16()
	 * @generated
	 */
	int FIELD_I16 = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I16__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I16__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I16__VALUE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field I16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I16_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field I16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I16_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FieldI32Impl <em>Field I32</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FieldI32Impl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldI32()
	 * @generated
	 */
	int FIELD_I32 = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I32__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I32__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I32__VALUE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field I32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I32_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field I32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I32_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FieldLongImpl <em>Field Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FieldLongImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldLong()
	 * @generated
	 */
	int FIELD_LONG = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LONG__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LONG__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LONG__VALUE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LONG_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LONG_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FieldStringImpl <em>Field String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FieldStringImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldString()
	 * @generated
	 */
	int FIELD_STRING = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_STRING__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_STRING__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_STRING__VALUE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_STRING_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_STRING_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FieldStructImpl <em>Field Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FieldStructImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldStruct()
	 * @generated
	 */
	int FIELD_STRUCT = 13;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_STRUCT__FIELD = 0;

	/**
	 * The number of structural features of the '<em>Field Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_STRUCT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_STRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.FieldFunctionImpl <em>Field Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.FieldFunctionImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldFunction()
	 * @generated
	 */
	int FIELD_FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FUNCTION__FIELD = 0;

	/**
	 * The number of structural features of the '<em>Field Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.TypeDefImpl <em>Type Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.TypeDefImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getTypeDef()
	 * @generated
	 */
	int TYPE_DEF = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.AcceptedType <em>Accepted Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.AcceptedType
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getAcceptedType()
	 * @generated
	 */
	int ACCEPTED_TYPE = 16;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.NewEnum2 <em>New Enum2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.NewEnum2
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getNewEnum2()
	 * @generated
	 */
	int NEW_ENUM2 = 17;

	/**
	 * The meta object id for the '<em>bool</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getbool()
	 * @generated
	 */
	int BOOL = 18;

	/**
	 * The meta object id for the '<em>byte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Byte
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getbyte()
	 * @generated
	 */
	int BYTE = 19;

	/**
	 * The meta object id for the '<em>i16</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#geti16()
	 * @generated
	 */
	int I16 = 20;

	/**
	 * The meta object id for the '<em>i32</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#geti32()
	 * @generated
	 */
	int I32 = 21;

	/**
	 * The meta object id for the '<em>long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getlong()
	 * @generated
	 */
	int LONG = 22;

	/**
	 * The meta object id for the '<em>double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getdouble()
	 * @generated
	 */
	int DOUBLE = 23;

	/**
	 * The meta object id for the '<em>string</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getstring()
	 * @generated
	 */
	int STRING = 24;

	/**
	 * The meta object id for the '<em>byte Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oracle.dss.util.xdo.common.io.ByteArray
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getbyteArray()
	 * @generated
	 */
	int BYTE_ARRAY = 25;

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
	 * Returns the meta object for the containment reference list '{@link uml2idl.metamodel.idl.IDLModel#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure</em>'.
	 * @see uml2idl.metamodel.idl.IDLModel#getStructure()
	 * @see #getIDLModel()
	 * @generated
	 */
	EReference getIDLModel_Structure();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2idl.metamodel.idl.IDLModel#getTypedef <em>Typedef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typedef</em>'.
	 * @see uml2idl.metamodel.idl.IDLModel#getTypedef()
	 * @see #getIDLModel()
	 * @generated
	 */
	EReference getIDLModel_Typedef();

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
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.Structure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml2idl.metamodel.idl.Structure#getName()
	 * @see #getStructure()
	 * @generated
	 */
	EAttribute getStructure_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2idl.metamodel.idl.Structure#getFieldstruct <em>Fieldstruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fieldstruct</em>'.
	 * @see uml2idl.metamodel.idl.Structure#getFieldstruct()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Fieldstruct();

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
	 * Returns the meta object for the containment reference list '{@link uml2idl.metamodel.idl.Function#getFieldfunction <em>Fieldfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fieldfunction</em>'.
	 * @see uml2idl.metamodel.idl.Function#getFieldfunction()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Fieldfunction();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.FieldBool <em>Field Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Bool</em>'.
	 * @see uml2idl.metamodel.idl.FieldBool
	 * @generated
	 */
	EClass getFieldBool();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.FieldBool#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml2idl.metamodel.idl.FieldBool#getValue()
	 * @see #getFieldBool()
	 * @generated
	 */
	EAttribute getFieldBool_Value();

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
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.Field#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see uml2idl.metamodel.idl.Field#getId()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Id();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.FieldByte <em>Field Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Byte</em>'.
	 * @see uml2idl.metamodel.idl.FieldByte
	 * @generated
	 */
	EClass getFieldByte();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.FieldByte#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml2idl.metamodel.idl.FieldByte#getValue()
	 * @see #getFieldByte()
	 * @generated
	 */
	EAttribute getFieldByte_Value();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.FieldByteArray <em>Field Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Byte Array</em>'.
	 * @see uml2idl.metamodel.idl.FieldByteArray
	 * @generated
	 */
	EClass getFieldByteArray();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.FieldByteArray#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see uml2idl.metamodel.idl.FieldByteArray#getValues()
	 * @see #getFieldByteArray()
	 * @generated
	 */
	EAttribute getFieldByteArray_Values();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.FieldDouble <em>Field Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Double</em>'.
	 * @see uml2idl.metamodel.idl.FieldDouble
	 * @generated
	 */
	EClass getFieldDouble();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.FieldDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml2idl.metamodel.idl.FieldDouble#getValue()
	 * @see #getFieldDouble()
	 * @generated
	 */
	EAttribute getFieldDouble_Value();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.FieldI16 <em>Field I16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field I16</em>'.
	 * @see uml2idl.metamodel.idl.FieldI16
	 * @generated
	 */
	EClass getFieldI16();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.FieldI16#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml2idl.metamodel.idl.FieldI16#getValue()
	 * @see #getFieldI16()
	 * @generated
	 */
	EAttribute getFieldI16_Value();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.FieldI32 <em>Field I32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field I32</em>'.
	 * @see uml2idl.metamodel.idl.FieldI32
	 * @generated
	 */
	EClass getFieldI32();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.FieldI32#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml2idl.metamodel.idl.FieldI32#getValue()
	 * @see #getFieldI32()
	 * @generated
	 */
	EAttribute getFieldI32_Value();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.FieldLong <em>Field Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Long</em>'.
	 * @see uml2idl.metamodel.idl.FieldLong
	 * @generated
	 */
	EClass getFieldLong();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.FieldLong#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml2idl.metamodel.idl.FieldLong#getValue()
	 * @see #getFieldLong()
	 * @generated
	 */
	EAttribute getFieldLong_Value();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.FieldString <em>Field String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field String</em>'.
	 * @see uml2idl.metamodel.idl.FieldString
	 * @generated
	 */
	EClass getFieldString();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.FieldString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml2idl.metamodel.idl.FieldString#getValue()
	 * @see #getFieldString()
	 * @generated
	 */
	EAttribute getFieldString_Value();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.FieldStruct <em>Field Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Struct</em>'.
	 * @see uml2idl.metamodel.idl.FieldStruct
	 * @generated
	 */
	EClass getFieldStruct();

	/**
	 * Returns the meta object for the reference '{@link uml2idl.metamodel.idl.FieldStruct#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see uml2idl.metamodel.idl.FieldStruct#getField()
	 * @see #getFieldStruct()
	 * @generated
	 */
	EReference getFieldStruct_Field();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.FieldFunction <em>Field Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Function</em>'.
	 * @see uml2idl.metamodel.idl.FieldFunction
	 * @generated
	 */
	EClass getFieldFunction();

	/**
	 * Returns the meta object for the reference '{@link uml2idl.metamodel.idl.FieldFunction#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see uml2idl.metamodel.idl.FieldFunction#getField()
	 * @see #getFieldFunction()
	 * @generated
	 */
	EReference getFieldFunction_Field();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Def</em>'.
	 * @see uml2idl.metamodel.idl.TypeDef
	 * @generated
	 */
	EClass getTypeDef();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.TypeDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml2idl.metamodel.idl.TypeDef#getName()
	 * @see #getTypeDef()
	 * @generated
	 */
	EAttribute getTypeDef_Name();

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
	 * Returns the meta object for data type '{@link oracle.dss.util.xdo.common.io.ByteArray <em>byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>byte Array</em>'.
	 * @see oracle.dss.util.xdo.common.io.ByteArray
	 * @model instanceClass="oracle.dss.util.xdo.common.io.ByteArray"
	 * @generated
	 */
	EDataType getbyteArray();

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
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_MODEL__STRUCTURE = eINSTANCE.getIDLModel_Structure();

		/**
		 * The meta object literal for the '<em><b>Typedef</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_MODEL__TYPEDEF = eINSTANCE.getIDLModel_Typedef();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE__NAME = eINSTANCE.getStructure_Name();

		/**
		 * The meta object literal for the '<em><b>Fieldstruct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__FIELDSTRUCT = eINSTANCE.getStructure_Fieldstruct();

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
		 * The meta object literal for the '<em><b>Fieldfunction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FIELDFUNCTION = eINSTANCE.getFunction_Fieldfunction();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FieldBoolImpl <em>Field Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FieldBoolImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldBool()
		 * @generated
		 */
		EClass FIELD_BOOL = eINSTANCE.getFieldBool();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_BOOL__VALUE = eINSTANCE.getFieldBool_Value();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.Field <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.Field
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__ID = eINSTANCE.getField_Id();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FieldByteImpl <em>Field Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FieldByteImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldByte()
		 * @generated
		 */
		EClass FIELD_BYTE = eINSTANCE.getFieldByte();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_BYTE__VALUE = eINSTANCE.getFieldByte_Value();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FieldByteArrayImpl <em>Field Byte Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FieldByteArrayImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldByteArray()
		 * @generated
		 */
		EClass FIELD_BYTE_ARRAY = eINSTANCE.getFieldByteArray();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_BYTE_ARRAY__VALUES = eINSTANCE.getFieldByteArray_Values();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FieldDoubleImpl <em>Field Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FieldDoubleImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldDouble()
		 * @generated
		 */
		EClass FIELD_DOUBLE = eINSTANCE.getFieldDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DOUBLE__VALUE = eINSTANCE.getFieldDouble_Value();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FieldI16Impl <em>Field I16</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FieldI16Impl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldI16()
		 * @generated
		 */
		EClass FIELD_I16 = eINSTANCE.getFieldI16();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_I16__VALUE = eINSTANCE.getFieldI16_Value();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FieldI32Impl <em>Field I32</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FieldI32Impl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldI32()
		 * @generated
		 */
		EClass FIELD_I32 = eINSTANCE.getFieldI32();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_I32__VALUE = eINSTANCE.getFieldI32_Value();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FieldLongImpl <em>Field Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FieldLongImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldLong()
		 * @generated
		 */
		EClass FIELD_LONG = eINSTANCE.getFieldLong();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_LONG__VALUE = eINSTANCE.getFieldLong_Value();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FieldStringImpl <em>Field String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FieldStringImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldString()
		 * @generated
		 */
		EClass FIELD_STRING = eINSTANCE.getFieldString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_STRING__VALUE = eINSTANCE.getFieldString_Value();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FieldStructImpl <em>Field Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FieldStructImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldStruct()
		 * @generated
		 */
		EClass FIELD_STRUCT = eINSTANCE.getFieldStruct();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_STRUCT__FIELD = eINSTANCE.getFieldStruct_Field();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.FieldFunctionImpl <em>Field Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.FieldFunctionImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getFieldFunction()
		 * @generated
		 */
		EClass FIELD_FUNCTION = eINSTANCE.getFieldFunction();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_FUNCTION__FIELD = eINSTANCE.getFieldFunction_Field();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.TypeDefImpl <em>Type Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.TypeDefImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getTypeDef()
		 * @generated
		 */
		EClass TYPE_DEF = eINSTANCE.getTypeDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEF__NAME = eINSTANCE.getTypeDef_Name();

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

		/**
		 * The meta object literal for the '<em>byte Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oracle.dss.util.xdo.common.io.ByteArray
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getbyteArray()
		 * @generated
		 */
		EDataType BYTE_ARRAY = eINSTANCE.getbyteArray();

	}

} //IdlPackage
