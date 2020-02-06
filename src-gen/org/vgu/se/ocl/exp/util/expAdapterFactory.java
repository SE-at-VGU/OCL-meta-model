/**
 */
package org.vgu.se.ocl.exp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.vgu.se.ocl.exp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.exp.EXPPackage
 * @generated
 */
public class EXPAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EXPPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EXPAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = EXPPackage.eINSTANCE;
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
    protected EXPSwitch<Adapter> modelSwitch = new EXPSwitch<Adapter>() {
        @Override
        public Adapter caseEVariableExp(EVariableExp object) {
            return createEVariableExpAdapter();
        }

        @Override
        public Adapter caseETypeExp(ETypeExp object) {
            return createETypeExpAdapter();
        }

        @Override
        public Adapter caseELoopExp(ELoopExp object) {
            return createELoopExpAdapter();
        }

        @Override
        public Adapter caseEStateExp(EStateExp object) {
            return createEStateExpAdapter();
        }

        @Override
        public Adapter caseEFeatureCallExp(EFeatureCallExp object) {
            return createEFeatureCallExpAdapter();
        }

        @Override
        public Adapter caseEAssociationClassCallExp(
            EAssociationClassCallExp object) {
            return createEAssociationClassCallExpAdapter();
        }

        @Override
        public Adapter caseENumericLiteralExp(ENumericLiteralExp object) {
            return createENumericLiteralExpAdapter();
        }

        @Override
        public Adapter caseELiteralExp(ELiteralExp object) {
            return createELiteralExpAdapter();
        }

        @Override
        public Adapter caseEMessageExp(EMessageExp object) {
            return createEMessageExpAdapter();
        }

        @Override
        public Adapter caseEVariable(EVariable object) {
            return createEVariableAdapter();
        }

        @Override
        public Adapter caseEPropertyCallExp(EPropertyCallExp object) {
            return createEPropertyCallExpAdapter();
        }

        @Override
        public Adapter caseEIteratorExp(EIteratorExp object) {
            return createEIteratorExpAdapter();
        }

        @Override
        public Adapter caseEOclExpression(EOclExpression object) {
            return createEOclExpressionAdapter();
        }

        @Override
        public Adapter caseEIterateExp(EIterateExp object) {
            return createEIterateExpAdapter();
        }

        @Override
        public Adapter caseECallExp(ECallExp object) {
            return createECallExpAdapter();
        }

        @Override
        public Adapter caseEIntegerLiteralExp(EIntegerLiteralExp object) {
            return createEIntegerLiteralExpAdapter();
        }

        @Override
        public Adapter caseEPrimitiveType(EPrimitiveType object) {
            return createEPrimitiveTypeAdapter();
        }

        @Override
        public Adapter caseENavigationCallExp(ENavigationCallExp object) {
            return createENavigationCallExpAdapter();
        }

        @Override
        public Adapter caseEOperationCallExp(EOperationCallExp object) {
            return createEOperationCallExpAdapter();
        }

        @Override
        public Adapter caseEStringLiteralExp(EStringLiteralExp object) {
            return createEStringLiteralExpAdapter();
        }

        @Override
        public Adapter caseEIfExp(EIfExp object) {
            return createEIfExpAdapter();
        }

        @Override
        public Adapter caseEBooleanLiteralExp(EBooleanLiteralExp object) {
            return createEBooleanLiteralExpAdapter();
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
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EVariableExp <em>EVariable Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EVariableExp
     * @generated
     */
    public Adapter createEVariableExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.ETypeExp <em>EType Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.ETypeExp
     * @generated
     */
    public Adapter createETypeExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.ELoopExp <em>ELoop Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.ELoopExp
     * @generated
     */
    public Adapter createELoopExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EStateExp <em>EState Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EStateExp
     * @generated
     */
    public Adapter createEStateExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EFeatureCallExp <em>EFeature Call Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EFeatureCallExp
     * @generated
     */
    public Adapter createEFeatureCallExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EAssociationClassCallExp <em>EAssociation Class Call Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EAssociationClassCallExp
     * @generated
     */
    public Adapter createEAssociationClassCallExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.ENumericLiteralExp <em>ENumeric Literal Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.ENumericLiteralExp
     * @generated
     */
    public Adapter createENumericLiteralExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.ELiteralExp <em>ELiteral Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.ELiteralExp
     * @generated
     */
    public Adapter createELiteralExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EMessageExp <em>EMessage Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EMessageExp
     * @generated
     */
    public Adapter createEMessageExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EVariable <em>EVariable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EVariable
     * @generated
     */
    public Adapter createEVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EPropertyCallExp <em>EProperty Call Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EPropertyCallExp
     * @generated
     */
    public Adapter createEPropertyCallExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EIteratorExp <em>EIterator Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EIteratorExp
     * @generated
     */
    public Adapter createEIteratorExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EOclExpression <em>EOcl Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EOclExpression
     * @generated
     */
    public Adapter createEOclExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EIterateExp <em>EIterate Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EIterateExp
     * @generated
     */
    public Adapter createEIterateExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.ECallExp <em>ECall Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.ECallExp
     * @generated
     */
    public Adapter createECallExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EIntegerLiteralExp <em>EInteger Literal Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EIntegerLiteralExp
     * @generated
     */
    public Adapter createEIntegerLiteralExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EPrimitiveType <em>EPrimitive Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EPrimitiveType
     * @generated
     */
    public Adapter createEPrimitiveTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.ENavigationCallExp <em>ENavigation Call Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.ENavigationCallExp
     * @generated
     */
    public Adapter createENavigationCallExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EOperationCallExp <em>EOperation Call Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EOperationCallExp
     * @generated
     */
    public Adapter createEOperationCallExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EStringLiteralExp <em>EString Literal Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EStringLiteralExp
     * @generated
     */
    public Adapter createEStringLiteralExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EIfExp <em>EIf Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EIfExp
     * @generated
     */
    public Adapter createEIfExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.ocl.exp.EBooleanLiteralExp <em>EBoolean Literal Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.ocl.exp.EBooleanLiteralExp
     * @generated
     */
    public Adapter createEBooleanLiteralExpAdapter() {
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

} //EXPAdapterFactory
