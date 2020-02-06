/**
 */
package org.vgu.se.ocl.exp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.vgu.se.ocl.dm.EAssociation;

import org.vgu.se.ocl.exp.EAssociationClassCallExp;
import org.vgu.se.ocl.exp.expPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAssociation Class Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EAssociationClassCallExpImpl#getReferredAssociationEnds <em>Referred Association Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAssociationClassCallExpImpl extends ENavigationCallExpImpl
    implements EAssociationClassCallExp {
    /**
     * The cached value of the '{@link #getReferredAssociationEnds() <em>Referred Association Ends</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredAssociationEnds()
     * @generated
     * @ordered
     */
    protected EAssociation referredAssociationEnds;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EAssociationClassCallExpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return expPackage.Literals.EASSOCIATION_CLASS_CALL_EXP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAssociation getReferredAssociationEnds() {
        if (referredAssociationEnds != null
            && referredAssociationEnds.eIsProxy()) {
            InternalEObject oldReferredAssociationEnds = (InternalEObject) referredAssociationEnds;
            referredAssociationEnds = (EAssociation) eResolveProxy(
                oldReferredAssociationEnds);
            if (referredAssociationEnds != oldReferredAssociationEnds) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        expPackage.EASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS,
                        oldReferredAssociationEnds, referredAssociationEnds));
            }
        }
        return referredAssociationEnds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAssociation basicGetReferredAssociationEnds() {
        return referredAssociationEnds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferredAssociationEnds(
        EAssociation newReferredAssociationEnds) {
        EAssociation oldReferredAssociationEnds = referredAssociationEnds;
        referredAssociationEnds = newReferredAssociationEnds;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                expPackage.EASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS,
                oldReferredAssociationEnds, referredAssociationEnds));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case expPackage.EASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS:
            if (resolve)
                return getReferredAssociationEnds();
            return basicGetReferredAssociationEnds();
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
        case expPackage.EASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS:
            setReferredAssociationEnds((EAssociation) newValue);
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
        case expPackage.EASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS:
            setReferredAssociationEnds((EAssociation) null);
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
        case expPackage.EASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS:
            return referredAssociationEnds != null;
        }
        return super.eIsSet(featureID);
    }

} //EAssociationClassCallExpImpl
