/**
 */
package org.vgu.se.ocl.exp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.vgu.se.ocl.exp.EIterateExp;
import org.vgu.se.ocl.exp.EVariable;
import org.vgu.se.ocl.exp.expPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EIterate Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EIterateExpImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EIterateExpImpl extends ELoopExpImpl implements EIterateExp {
    /**
     * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResult()
     * @generated
     * @ordered
     */
    protected EVariable result;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EIterateExpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return expPackage.Literals.EITERATE_EXP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EVariable getResult() {
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResult(EVariable newResult,
        NotificationChain msgs) {
        EVariable oldResult = result;
        result = newResult;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, expPackage.EITERATE_EXP__RESULT, oldResult,
                newResult);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResult(EVariable newResult) {
        if (newResult != result) {
            NotificationChain msgs = null;
            if (result != null)
                msgs = ((InternalEObject) result).eInverseRemove(this,
                    expPackage.EVARIABLE__BASE_EXP, EVariable.class, msgs);
            if (newResult != null)
                msgs = ((InternalEObject) newResult).eInverseAdd(this,
                    expPackage.EVARIABLE__BASE_EXP, EVariable.class, msgs);
            msgs = basicSetResult(newResult, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                expPackage.EITERATE_EXP__RESULT, newResult, newResult));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd,
        int featureID, NotificationChain msgs) {
        switch (featureID) {
        case expPackage.EITERATE_EXP__RESULT:
            if (result != null)
                msgs = ((InternalEObject) result).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE - expPackage.EITERATE_EXP__RESULT,
                    null, msgs);
            return basicSetResult((EVariable) otherEnd, msgs);
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
        case expPackage.EITERATE_EXP__RESULT:
            return basicSetResult(null, msgs);
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
        case expPackage.EITERATE_EXP__RESULT:
            return getResult();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case expPackage.EITERATE_EXP__RESULT:
            setResult((EVariable) newValue);
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
        case expPackage.EITERATE_EXP__RESULT:
            setResult((EVariable) null);
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
        case expPackage.EITERATE_EXP__RESULT:
            return result != null;
        }
        return super.eIsSet(featureID);
    }

} //EIterateExpImpl
