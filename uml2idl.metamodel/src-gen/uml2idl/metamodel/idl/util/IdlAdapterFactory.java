/**
 */
package uml2idl.metamodel.idl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uml2idl.metamodel.idl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uml2idl.metamodel.idl.IdlPackage
 * @generated
 */
public class IdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IdlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdlSwitch<Adapter> modelSwitch = new IdlSwitch<Adapter>() {
		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseIDLModel(IDLModel object) {
			return createIDLModelAdapter();
		}

		@Override
		public Adapter caseStructure(Structure object) {
			return createStructureAdapter();
		}

		@Override
		public Adapter caseFunction(Function object) {
			return createFunctionAdapter();
		}

		@Override
		public Adapter caseFieldBool(FieldBool object) {
			return createFieldBoolAdapter();
		}

		@Override
		public Adapter caseField(Field object) {
			return createFieldAdapter();
		}

		@Override
		public Adapter caseFieldByte(FieldByte object) {
			return createFieldByteAdapter();
		}

		@Override
		public Adapter caseFieldByteArray(FieldByteArray object) {
			return createFieldByteArrayAdapter();
		}

		@Override
		public Adapter caseFieldDouble(FieldDouble object) {
			return createFieldDoubleAdapter();
		}

		@Override
		public Adapter caseFieldI16(FieldI16 object) {
			return createFieldI16Adapter();
		}

		@Override
		public Adapter caseFieldI32(FieldI32 object) {
			return createFieldI32Adapter();
		}

		@Override
		public Adapter caseFieldLong(FieldLong object) {
			return createFieldLongAdapter();
		}

		@Override
		public Adapter caseFieldString(FieldString object) {
			return createFieldStringAdapter();
		}

		@Override
		public Adapter caseFieldStruct(FieldStruct object) {
			return createFieldStructAdapter();
		}

		@Override
		public Adapter caseFieldFunction(FieldFunction object) {
			return createFieldFunctionAdapter();
		}

		@Override
		public Adapter caseTypeDef(TypeDef object) {
			return createTypeDefAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.IDLModel <em>IDL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.IDLModel
	 * @generated
	 */
	public Adapter createIDLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.FieldBool <em>Field Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.FieldBool
	 * @generated
	 */
	public Adapter createFieldBoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.FieldByte <em>Field Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.FieldByte
	 * @generated
	 */
	public Adapter createFieldByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.FieldByteArray <em>Field Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.FieldByteArray
	 * @generated
	 */
	public Adapter createFieldByteArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.FieldDouble <em>Field Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.FieldDouble
	 * @generated
	 */
	public Adapter createFieldDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.FieldI16 <em>Field I16</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.FieldI16
	 * @generated
	 */
	public Adapter createFieldI16Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.FieldI32 <em>Field I32</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.FieldI32
	 * @generated
	 */
	public Adapter createFieldI32Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.FieldLong <em>Field Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.FieldLong
	 * @generated
	 */
	public Adapter createFieldLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.FieldString <em>Field String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.FieldString
	 * @generated
	 */
	public Adapter createFieldStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.FieldStruct <em>Field Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.FieldStruct
	 * @generated
	 */
	public Adapter createFieldStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.FieldFunction <em>Field Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.FieldFunction
	 * @generated
	 */
	public Adapter createFieldFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml2idl.metamodel.idl.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml2idl.metamodel.idl.TypeDef
	 * @generated
	 */
	public Adapter createTypeDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IdlAdapterFactory
