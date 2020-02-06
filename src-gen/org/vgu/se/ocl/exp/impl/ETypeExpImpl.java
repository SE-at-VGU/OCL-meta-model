/**
 */
package org.vgu.se.ocl.exp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.vgu.se.ocl.exp.ETypeExp;
import org.vgu.se.ocl.exp.EXPPackage;

import org.vgu.se.ocl.type.EClassifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EType Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.ETypeExpImpl#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETypeExpImpl extends EOclExpressionImpl implements ETypeExp {
    /**
     * The cached value of the '{@link #getReferredType() <em>Referred Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredType()
     * @generated
     * @ordered
     */
    protected EClassifier referredType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ETypeExpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EXPPackage.Literals.ETYPE_EXP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClassifier getReferredType() {
        if (referredType != null && referredType.eIsProxy()) {
            InternalEObject oldReferredType = (InternalEObject) referredType;
            referredType = (EClassifier) eResolveProxy(oldReferredType);
            if (referredType != oldReferredType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        EXPPackage.ETYPE_EXP__REFERRED_TYPE, oldReferredType,
                        referredType));
            }
        }
        return referredType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClassifier basicGetReferredType() {
        return referredType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferredType(EClassifier newReferredType) {
        EClassifier oldReferredType = referredType;
        referredType = newReferredType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.ETYPE_EXP__REFERRED_TYPE, oldReferredType,
                referredType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case EXPPackage.ETYPE_EXP__REFERRED_TYPE:
            if (resolve)
                return getReferredType();
            return basicGetReferredType();
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
        case EXPPackage.ETYPE_EXP__REFERRED_TYPE:
            setReferredType((EClassifier) newValue);
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
        case EXPPackage.ETYPE_EXP__REFERRED_TYPE:
            setReferredType((EClassifier) null);
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
        case EXPPackage.ETYPE_EXP__REFERRED_TYPE:
            return referredType != null;
        }
        return super.eIsSet(featureID);
    }

} //ETypeExpImpl
