/**
 */
package org.vgu.se.ocl.type.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.vgu.se.ocl.type.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.type.TYPEPackage
 * @generated
 */
public class TYPEAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TYPEPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TYPEPackage.eINSTANCE;
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
    protected TYPESwitch<Adapter> modelSwitch = new TYPESwitch<Adapter>() {
        @Override
        public Adapter caseEClassifier(EClassifier object) {
            return createEClassifierAdapter();
        }

        @Override
        public Adapter caseEDataType(EDataType object) {
            return createEDataTypeAdapter();
        }

        @Override
        public Adapter caseEInvalidType(EInvalidType object) {
            return createEInvalidTypeAdapter();
        }

        @Override
        public Adapter caseEVoidType(EVoidType object) {
            return createEVoidTypeAdapter();
        }

        @Override
        public Adapter caseEAnyType(EAnyType object) {
            return createEAnyTypeAdapter();
        }

        @Override
        public Adapter caseEMessageType(EMessageType object) {
            return createEMessageTypeAdapter();
        }

        @Override
        public Adapter caseECollectionType(ECollectionType object) {
            return createECollectionTypeAdapter();
        }

        @Override
        public Adapter caseEPrimitiveType(EPrimitiveType object) {
            return createEPrimitiveTypeAdapter();
        }

        @Override
        public Adapter caseETupleType(ETupleType object) {
            return createETupleTypeAdapter();
        }

        @Override
        public Adapter caseEOrderedSetType(EOrderedSetType object) {
            return createEOrderedSetTypeAdapter();
        }

        @Override
        public Adapter caseESequenceType(ESequenceType object) {
            return createESequenceTypeAdapter();
        }

        @Override
        public Adapter caseEBagType(EBagType object) {
            return createEBagTypeAdapter();
        }

        @Override
        public Adapter caseESetType(ESetType object) {
            return createESetTypeAdapter();
        }

        @Override
        public Adapter caseESignal(ESignal object) {
            return createESignalAdapter();
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
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.EClassifier <em>EClassifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.EClassifier
     * @generated
     */
    public Adapter createEClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.EDataType <em>EData Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.EDataType
     * @generated
     */
    public Adapter createEDataTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.EInvalidType <em>EInvalid Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.EInvalidType
     * @generated
     */
    public Adapter createEInvalidTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.EVoidType <em>EVoid Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.EVoidType
     * @generated
     */
    public Adapter createEVoidTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.EAnyType <em>EAny Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.EAnyType
     * @generated
     */
    public Adapter createEAnyTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.EMessageType <em>EMessage Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.EMessageType
     * @generated
     */
    public Adapter createEMessageTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.ECollectionType <em>ECollection Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.ECollectionType
     * @generated
     */
    public Adapter createECollectionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.EPrimitiveType <em>EPrimitive Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.EPrimitiveType
     * @generated
     */
    public Adapter createEPrimitiveTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.ETupleType <em>ETuple Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.ETupleType
     * @generated
     */
    public Adapter createETupleTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.EOrderedSetType <em>EOrdered Set Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.EOrderedSetType
     * @generated
     */
    public Adapter createEOrderedSetTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.ESequenceType <em>ESequence Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.ESequenceType
     * @generated
     */
    public Adapter createESequenceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.EBagType <em>EBag Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.EBagType
     * @generated
     */
    public Adapter createEBagTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.ESetType <em>ESet Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.ESetType
     * @generated
     */
    public Adapter createESetTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.type.ESignal <em>ESignal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.type.ESignal
     * @generated
     */
    public Adapter createESignalAdapter() {
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

} //TYPEAdapterFactory
