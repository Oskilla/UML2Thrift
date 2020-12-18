/**
 */
package uml2idl.metamodel.idl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uml2idl.metamodel.idl.AcceptedType;
import uml2idl.metamodel.idl.Field;
import uml2idl.metamodel.idl.Function;
import uml2idl.metamodel.idl.IDLModel;
import uml2idl.metamodel.idl.IdlFactory;
import uml2idl.metamodel.idl.IdlPackage;
import uml2idl.metamodel.idl.NewEnum2;
import uml2idl.metamodel.idl.Service;
import uml2idl.metamodel.idl.Structure;
import uml2idl.metamodel.idl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdlPackageImpl extends EPackageImpl implements IdlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acceptedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum newEnum2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType boolEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType byteEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType i16EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType i32EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uml2idl.metamodel.idl.IdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdlPackageImpl() {
		super(eNS_URI, IdlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IdlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdlPackage init() {
		if (isInited)
			return (IdlPackage) EPackage.Registry.INSTANCE.getEPackage(IdlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIdlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IdlPackageImpl theIdlPackage = registeredIdlPackage instanceof IdlPackageImpl
				? (IdlPackageImpl) registeredIdlPackage
				: new IdlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theIdlPackage.createPackageContents();

		// Initialize created meta-data
		theIdlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIdlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdlPackage.eNS_URI, theIdlPackage);
		return theIdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Function() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDLModel() {
		return idlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIDLModel_Services() {
		return (EReference) idlModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDLModel_Name() {
		return (EAttribute) idlModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIDLModel_Structures() {
		return (EReference) idlModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Field() {
		return (EReference) structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Type() {
		return (EReference) fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Name() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Field() {
		return (EReference) functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_ReturnType() {
		return (EReference) functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute) typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_EType() {
		return (EReference) typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAcceptedType() {
		return acceptedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNewEnum2() {
		return newEnum2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getbool() {
		return boolEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getbyte() {
		return byteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType geti16() {
		return i16EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType geti32() {
		return i32EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getlong() {
		return longEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getdouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getstring() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlFactory getIdlFactory() {
		return (IdlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEReference(serviceEClass, SERVICE__FUNCTION);

		idlModelEClass = createEClass(IDL_MODEL);
		createEReference(idlModelEClass, IDL_MODEL__SERVICES);
		createEAttribute(idlModelEClass, IDL_MODEL__NAME);
		createEReference(idlModelEClass, IDL_MODEL__STRUCTURES);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__FIELD);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEReference(fieldEClass, FIELD__TYPE);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);
		createEReference(functionEClass, FUNCTION__FIELD);
		createEReference(functionEClass, FUNCTION__RETURN_TYPE);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);
		createEReference(typeEClass, TYPE__ETYPE);

		// Create enums
		acceptedTypeEEnum = createEEnum(ACCEPTED_TYPE);
		newEnum2EEnum = createEEnum(NEW_ENUM2);

		// Create data types
		boolEDataType = createEDataType(BOOL);
		byteEDataType = createEDataType(BYTE);
		i16EDataType = createEDataType(I16);
		i32EDataType = createEDataType(I32);
		longEDataType = createEDataType(LONG);
		doubleEDataType = createEDataType(DOUBLE);
		stringEDataType = createEDataType(STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		structureEClass.getESuperTypes().add(this.getType());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Function(), this.getFunction(), null, "function", null, 0, -1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idlModelEClass, IDLModel.class, "IDLModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIDLModel_Services(), this.getService(), null, "services", null, 0, -1, IDLModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDLModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, IDLModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIDLModel_Structures(), this.getStructure(), null, "structures", null, 0, -1, IDLModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructure_Field(), this.getField(), null, "field", null, 0, -1, Structure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Type(), this.getType(), null, "type", null, 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Field(), this.getField(), null, "field", null, 0, -1, Function.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFunction_ReturnType(), this.getField(), null, "returnType", null, 1, 1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_EType(), this.getType(), null, "eType", null, 0, 1, Type.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(acceptedTypeEEnum, AcceptedType.class, "AcceptedType");

		initEEnum(newEnum2EEnum, NewEnum2.class, "NewEnum2");

		// Initialize data types
		initEDataType(boolEDataType, Boolean.class, "bool", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(byteEDataType, Byte.class, "byte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(i16EDataType, Short.class, "i16", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(i32EDataType, Integer.class, "i32", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longEDataType, Long.class, "long", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleEDataType, Double.class, "double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "string", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IdlPackageImpl
