/**
 */
package org.vgu.se.ocl.type.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.vgu.se.ocl.exp.EOperator;

import org.vgu.se.ocl.type.EMessageType;
import org.vgu.se.ocl.type.ESignal;
import org.vgu.se.ocl.type.typePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMessage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.type.impl.EMessageTypeImpl#getReferredSignal <em>Referred Signal</em>}</li>
 *   <li>{@link org.vgu.se.ocl.type.impl.EMessageTypeImpl#getReferredOperation <em>Referred Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMessageTypeImpl extends EClassifierImpl implements EMessageType {
    /**
     * The cached value of the '{@link #getReferredSignal() <em>Referred Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredSignal()
     * @generated
     * @ordered
     */
    protected ESignal referredSignal;

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
    protected EMessageTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return typePackage.Literals.EMESSAGE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ESignal getReferredSignal() {
        if (referredSignal != null && referredSignal.eIsProxy()) {
            InternalEObject oldReferredSignal = (InternalEObject) referredSignal;
            referredSignal = (ESignal) eResolveProxy(oldReferredSignal);
            if (referredSignal != oldReferredSignal) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        typePackage.EMESSAGE_TYPE__REFERRED_SIGNAL,
                        oldReferredSignal, referredSignal));
            }
        }
        return referredSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ESignal basicGetReferredSignal() {
        return referredSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferredSignal(ESignal newReferredSignal) {
        ESignal oldReferredSignal = referredSignal;
        referredSignal = newReferredSignal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                typePackage.EMESSAGE_TYPE__REFERRED_SIGNAL, oldReferredSignal,
                referredSignal));
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
                typePackage.EMESSAGE_TYPE__REFERRED_OPERATION,
                oldReferredOperation, referredOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case typePackage.EMESSAGE_TYPE__REFERRED_SIGNAL:
            if (resolve)
                return getReferredSignal();
            return basicGetReferredSignal();
        case typePackage.EMESSAGE_TYPE__REFERRED_OPERATION:
            return getReferredOperation();
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
        case typePackage.EMESSAGE_TYPE__REFERRED_SIGNAL:
            setReferredSignal((ESignal) newValue);
            return;
        case typePackage.EMESSAGE_TYPE__REFERRED_OPERATION:
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
        case typePackage.EMESSAGE_TYPE__REFERRED_SIGNAL:
            setReferredSignal((ESignal) null);
            return;
        case typePackage.EMESSAGE_TYPE__REFERRED_OPERATION:
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
        case typePackage.EMESSAGE_TYPE__REFERRED_SIGNAL:
            return referredSignal != null;
        case typePackage.EMESSAGE_TYPE__REFERRED_OPERATION:
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

} //EMessageTypeImpl
