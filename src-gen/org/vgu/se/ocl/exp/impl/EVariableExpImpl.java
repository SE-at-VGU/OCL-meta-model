/**
 */
package org.vgu.se.ocl.exp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.vgu.se.ocl.exp.EVariable;
import org.vgu.se.ocl.exp.EVariableExp;
import org.vgu.se.ocl.exp.EXPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EVariable Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EVariableExpImpl#getReferredVariable <em>Referred Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EVariableExpImpl extends EOclExpressionImpl
    implements EVariableExp {
    /**
     * The cached value of the '{@link #getReferredVariable() <em>Referred Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredVariable()
     * @generated
     * @ordered
     */
    protected EVariable referredVariable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EVariableExpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EXPPackage.Literals.EVARIABLE_EXP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EVariable getReferredVariable() {
        if (referredVariable != null && referredVariable.eIsProxy()) {
            InternalEObject oldReferredVariable = (InternalEObject) referredVariable;
            referredVariable = (EVariable) eResolveProxy(oldReferredVariable);
            if (referredVariable != oldReferredVariable) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        EXPPackage.EVARIABLE_EXP__REFERRED_VARIABLE,
                        oldReferredVariable, referredVariable));
            }
        }
        return referredVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EVariable basicGetReferredVariable() {
        return referredVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferredVariable(EVariable newReferredVariable) {
        EVariable oldReferredVariable = referredVariable;
        referredVariable = newReferredVariable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.EVARIABLE_EXP__REFERRED_VARIABLE,
                oldReferredVariable, referredVariable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case EXPPackage.EVARIABLE_EXP__REFERRED_VARIABLE:
            if (resolve)
                return getReferredVariable();
            return basicGetReferredVariable();
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
        case EXPPackage.EVARIABLE_EXP__REFERRED_VARIABLE:
            setReferredVariable((EVariable) newValue);
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
        case EXPPackage.EVARIABLE_EXP__REFERRED_VARIABLE:
            setReferredVariable((EVariable) null);
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
        case EXPPackage.EVARIABLE_EXP__REFERRED_VARIABLE:
            return referredVariable != null;
        }
        return super.eIsSet(featureID);
    }

} //EVariableExpImpl
