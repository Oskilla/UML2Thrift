/**
 */
package uml2idl.metamodel.idl.impl;

import oracle.dss.util.xdo.common.io.ByteArray;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml2idl.metamodel.idl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdlFactoryImpl extends EFactoryImpl implements IdlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdlFactory init() {
		try {
			IdlFactory theIdlFactory = (IdlFactory) EPackage.Registry.INSTANCE.getEFactory(IdlPackage.eNS_URI);
			if (theIdlFactory != null) {
				return theIdlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case IdlPackage.SERVICE:
			return createService();
		case IdlPackage.IDL_MODEL:
			return createIDLModel();
		case IdlPackage.STRUCTURE:
			return createStructure();
		case IdlPackage.FUNCTION:
			return createFunction();
		case IdlPackage.FIELD_BOOL:
			return createFieldBool();
		case IdlPackage.FIELD_BYTE:
			return createFieldByte();
		case IdlPackage.FIELD_BYTE_ARRAY:
			return createFieldByteArray();
		case IdlPackage.FIELD_DOUBLE:
			return createFieldDouble();
		case IdlPackage.FIELD_I16:
			return createFieldI16();
		case IdlPackage.FIELD_I32:
			return createFieldI32();
		case IdlPackage.FIELD_LONG:
			return createFieldLong();
		case IdlPackage.FIELD_STRING:
			return createFieldString();
		case IdlPackage.FIELD_STRUCT:
			return createFieldStruct();
		case IdlPackage.FIELD_FUNCTION:
			return createFieldFunction();
		case IdlPackage.TYPE_DEF:
			return createTypeDef();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case IdlPackage.ACCEPTED_TYPE:
			return createAcceptedTypeFromString(eDataType, initialValue);
		case IdlPackage.NEW_ENUM2:
			return createNewEnum2FromString(eDataType, initialValue);
		case IdlPackage.BOOL:
			return createboolFromString(eDataType, initialValue);
		case IdlPackage.BYTE:
			return createbyteFromString(eDataType, initialValue);
		case IdlPackage.I16:
			return createi16FromString(eDataType, initialValue);
		case IdlPackage.I32:
			return createi32FromString(eDataType, initialValue);
		case IdlPackage.LONG:
			return createlongFromString(eDataType, initialValue);
		case IdlPackage.DOUBLE:
			return createdoubleFromString(eDataType, initialValue);
		case IdlPackage.STRING:
			return createstringFromString(eDataType, initialValue);
		case IdlPackage.BYTE_ARRAY:
			return createbyteArrayFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case IdlPackage.ACCEPTED_TYPE:
			return convertAcceptedTypeToString(eDataType, instanceValue);
		case IdlPackage.NEW_ENUM2:
			return convertNewEnum2ToString(eDataType, instanceValue);
		case IdlPackage.BOOL:
			return convertboolToString(eDataType, instanceValue);
		case IdlPackage.BYTE:
			return convertbyteToString(eDataType, instanceValue);
		case IdlPackage.I16:
			return converti16ToString(eDataType, instanceValue);
		case IdlPackage.I32:
			return converti32ToString(eDataType, instanceValue);
		case IdlPackage.LONG:
			return convertlongToString(eDataType, instanceValue);
		case IdlPackage.DOUBLE:
			return convertdoubleToString(eDataType, instanceValue);
		case IdlPackage.STRING:
			return convertstringToString(eDataType, instanceValue);
		case IdlPackage.BYTE_ARRAY:
			return convertbyteArrayToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDLModel createIDLModel() {
		IDLModelImpl idlModel = new IDLModelImpl();
		return idlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldBool createFieldBool() {
		FieldBoolImpl fieldBool = new FieldBoolImpl();
		return fieldBool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldByte createFieldByte() {
		FieldByteImpl fieldByte = new FieldByteImpl();
		return fieldByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldByteArray createFieldByteArray() {
		FieldByteArrayImpl fieldByteArray = new FieldByteArrayImpl();
		return fieldByteArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDouble createFieldDouble() {
		FieldDoubleImpl fieldDouble = new FieldDoubleImpl();
		return fieldDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldI16 createFieldI16() {
		FieldI16Impl fieldI16 = new FieldI16Impl();
		return fieldI16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldI32 createFieldI32() {
		FieldI32Impl fieldI32 = new FieldI32Impl();
		return fieldI32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldLong createFieldLong() {
		FieldLongImpl fieldLong = new FieldLongImpl();
		return fieldLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldString createFieldString() {
		FieldStringImpl fieldString = new FieldStringImpl();
		return fieldString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldStruct createFieldStruct() {
		FieldStructImpl fieldStruct = new FieldStructImpl();
		return fieldStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldFunction createFieldFunction() {
		FieldFunctionImpl fieldFunction = new FieldFunctionImpl();
		return fieldFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef createTypeDef() {
		TypeDefImpl typeDef = new TypeDefImpl();
		return typeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptedType createAcceptedTypeFromString(EDataType eDataType, String initialValue) {
		AcceptedType result = AcceptedType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcceptedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewEnum2 createNewEnum2FromString(EDataType eDataType, String initialValue) {
		NewEnum2 result = NewEnum2.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNewEnum2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createboolFromString(EDataType eDataType, String initialValue) {
		return (Boolean) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertboolToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createbyteFromString(EDataType eDataType, String initialValue) {
		return (Byte) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertbyteToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createi16FromString(EDataType eDataType, String initialValue) {
		return (Short) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converti16ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createi32FromString(EDataType eDataType, String initialValue) {
		return (Integer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converti32ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createlongFromString(EDataType eDataType, String initialValue) {
		return (Long) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertlongToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createdoubleFromString(EDataType eDataType, String initialValue) {
		return (Double) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertdoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createstringFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertstringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByteArray createbyteArrayFromString(EDataType eDataType, String initialValue) {
		return (ByteArray) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertbyteArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlPackage getIdlPackage() {
		return (IdlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IdlPackage getPackage() {
		return IdlPackage.eINSTANCE;
	}

} //IdlFactoryImpl
