/**
 */
package org.vgu.se.ocl.exp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.vgu.se.ocl.exp.EOclExpression;
import org.vgu.se.ocl.exp.EOperationCallExp;
import org.vgu.se.ocl.exp.EOperator;
import org.vgu.se.ocl.exp.EXPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOperation Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EOperationCallExpImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EOperationCallExpImpl#getReferredOperation <em>Referred Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOperationCallExpImpl extends EFeatureCallExpImpl
    implements EOperationCallExp {
    /**
     * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArgument()
     * @generated
     * @ordered
     */
    protected EList<EOclExpression> argument;

    /**
     * The default value of the '{@link #getReferredOperation() <em>Referred Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredOperation()
     * @generated
     * @ordered
     */
    protected static final EOperator REFERRED_OPERATION_EDEFAULT = EOperator.EQUAL_LITERAL;

    /**
     * The cached value of the '{@link #getReferredOperation() <em>Referred Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredOperation()
     * @generated
     * @ordered
     */
    protected EOperator referredOperation = REFERRED_OPERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EOperationCallExpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EXPPackage.Literals.EOPERATION_CALL_EXP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EOclExpression> getArgument() {
        if (argument == null) {
            argument = new EObjectContainmentWithInverseEList<EOclExpression>(
                EOclExpression.class, this,
                EXPPackage.EOPERATION_CALL_EXP__ARGUMENT,
                EXPPackage.EOCL_EXPRESSION__PARENT_CALL);
        }
        return argument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperator getReferredOperation() {
        return referredOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferredOperation(EOperator newReferredOperation) {
        EOperator oldReferredOperation = referredOperation;
        referredOperation = newReferredOperation == null
            ? REFERRED_OPERATION_EDEFAULT
            : newReferredOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.EOPERATION_CALL_EXP__REFERRED_OPERATION,
                oldReferredOperation, referredOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd,
        int featureID, NotificationChain msgs) {
        switch (featureID) {
        case EXPPackage.EOPERATION_CALL_EXP__ARGUMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getArgument())
                .basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
        int featureID, NotificationChain msgs) {
        switch (featureID) {
        case EXPPackage.EOPERATION_CALL_EXP__ARGUMENT:
            return ((InternalEList<?>) getArgument()).basicRemove(otherEnd,
                msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case EXPPackage.EOPERATION_CALL_EXP__ARGUMENT:
            return getArgument();
        case EXPPackage.EOPERATION_CALL_EXP__REFERRED_OPERATION:
            return getReferredOperation();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case EXPPackage.EOPERATION_CALL_EXP__ARGUMENT:
            getArgument().clear();
            getArgument()
                .addAll((Collection<? extends EOclExpression>) newValue);
            return;
        case EXPPackage.EOPERATION_CALL_EXP__REFERRED_OPERATION:
            setReferredOperation((EOperator) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case EXPPackage.EOPERATION_CALL_EXP__ARGUMENT:
            getArgument().clear();
            return;
        case EXPPackage.EOPERATION_CALL_EXP__REFERRED_OPERATION:
            setReferredOperation(REFERRED_OPERATION_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case EXPPackage.EOPERATION_CALL_EXP__ARGUMENT:
            return argument != null && !argument.isEmpty();
        case EXPPackage.EOPERATION_CALL_EXP__REFERRED_OPERATION:
            return referredOperation != REFERRED_OPERATION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (referredOperation: ");
        result.append(referredOperation);
        result.append(')');
        return result.toString();
    }

} //EOperationCallExpImpl
