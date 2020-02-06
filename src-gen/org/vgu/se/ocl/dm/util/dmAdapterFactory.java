/**
 */
package org.vgu.se.ocl.dm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.vgu.se.ocl.dm.*;

import org.vgu.se.ocl.type.EClassifier;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.dm.dmPackage
 * @generated
 */
public class dmAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static dmPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public dmAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = dmPackage.eINSTANCE;
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
    protected dmSwitch<Adapter> modelSwitch = new dmSwitch<Adapter>() {
        @Override
        public Adapter caseEEntity(EEntity object) {
            return createEEntityAdapter();
        }

        @Override
        public Adapter caseEAssociation(EAssociation object) {
            return createEAssociationAdapter();
        }

        @Override
        public Adapter caseEDataModel(EDataModel object) {
            return createEDataModelAdapter();
        }

        @Override
        public Adapter caseEAttribute(EAttribute object) {
            return createEAttributeAdapter();
        }

        @Override
        public Adapter caseEClassifier(EClassifier object) {
            return createEClassifierAdapter();
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
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.dm.EEntity <em>EEntity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.dm.EEntity
     * @generated
     */
    public Adapter createEEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.dm.EAssociation <em>EAssociation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.dm.EAssociation
     * @generated
     */
    public Adapter createEAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.dm.EDataModel <em>EData Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.dm.EDataModel
     * @generated
     */
    public Adapter createEDataModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.dm.EAttribute <em>EAttribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.dm.EAttribute
     * @generated
     */
    public Adapter createEAttributeAdapter() {
        return null;
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

} //dmAdapterFactory
