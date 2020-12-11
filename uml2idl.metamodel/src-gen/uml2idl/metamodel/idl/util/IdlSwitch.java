/**
 */
package uml2idl.metamodel.idl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uml2idl.metamodel.idl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uml2idl.metamodel.idl.IdlPackage
 * @generated
 */
public class IdlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlSwitch() {
		if (modelPackage == null) {
			modelPackage = IdlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case IdlPackage.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.IDL_MODEL: {
			IDLModel idlModel = (IDLModel) theEObject;
			T result = caseIDLModel(idlModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.STRUCTURE: {
			Structure structure = (Structure) theEObject;
			T result = caseStructure(structure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FIELD_BOOL: {
			FieldBool fieldBool = (FieldBool) theEObject;
			T result = caseFieldBool(fieldBool);
			if (result == null)
				result = caseField(fieldBool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FIELD: {
			Field field = (Field) theEObject;
			T result = caseField(field);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FIELD_BYTE: {
			FieldByte fieldByte = (FieldByte) theEObject;
			T result = caseFieldByte(fieldByte);
			if (result == null)
				result = caseField(fieldByte);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FIELD_BYTE_ARRAY: {
			FieldByteArray fieldByteArray = (FieldByteArray) theEObject;
			T result = caseFieldByteArray(fieldByteArray);
			if (result == null)
				result = caseField(fieldByteArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FIELD_DOUBLE: {
			FieldDouble fieldDouble = (FieldDouble) theEObject;
			T result = caseFieldDouble(fieldDouble);
			if (result == null)
				result = caseField(fieldDouble);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FIELD_I16: {
			FieldI16 fieldI16 = (FieldI16) theEObject;
			T result = caseFieldI16(fieldI16);
			if (result == null)
				result = caseField(fieldI16);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FIELD_I32: {
			FieldI32 fieldI32 = (FieldI32) theEObject;
			T result = caseFieldI32(fieldI32);
			if (result == null)
				result = caseField(fieldI32);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FIELD_LONG: {
			FieldLong fieldLong = (FieldLong) theEObject;
			T result = caseFieldLong(fieldLong);
			if (result == null)
				result = caseField(fieldLong);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FIELD_STRING: {
			FieldString fieldString = (FieldString) theEObject;
			T result = caseFieldString(fieldString);
			if (result == null)
				result = caseField(fieldString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FIELD_STRUCT: {
			FieldStruct fieldStruct = (FieldStruct) theEObject;
			T result = caseFieldStruct(fieldStruct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.FIELD_FUNCTION: {
			FieldFunction fieldFunction = (FieldFunction) theEObject;
			T result = caseFieldFunction(fieldFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IdlPackage.TYPE_DEF: {
			TypeDef typeDef = (TypeDef) theEObject;
			T result = caseTypeDef(typeDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLModel(IDLModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Bool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Bool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldBool(FieldBool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldByte(FieldByte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Byte Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Byte Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldByteArray(FieldByteArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDouble(FieldDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field I16</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field I16</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldI16(FieldI16 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field I32</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field I32</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldI32(FieldI32 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldLong(FieldLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldString(FieldString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldStruct(FieldStruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldFunction(FieldFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDef(TypeDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IdlSwitch
