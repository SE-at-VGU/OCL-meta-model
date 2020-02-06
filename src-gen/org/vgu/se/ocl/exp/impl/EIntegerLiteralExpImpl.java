/**
 */
package org.vgu.se.ocl.exp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.vgu.se.ocl.exp.EIntegerLiteralExp;
import org.vgu.se.ocl.exp.EXPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EInteger Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EIntegerLiteralExpImpl#getIntegerValue <em>Integer Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EIntegerLiteralExpImpl extends ENumericLiteralExpImpl
    implements EIntegerLiteralExp {
    /**
     * The default value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntegerValue()
     * @generated
     * @ordered
     */
    protected static final Integer INTEGER_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntegerValue()
     * @generated
     * @ordered
     */
    protected Integer integerValue = INTEGER_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EIntegerLiteralExpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EXPPackage.Literals.EINTEGER_LITERAL_EXP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getIntegerValue() {
        return integerValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIntegerValue(Integer newIntegerValue) {
        Integer oldIntegerValue = integerValue;
        integerValue = newIntegerValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.EINTEGER_LITERAL_EXP__INTEGER_VALUE, oldIntegerValue,
                integerValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case EXPPackage.EINTEGER_LITERAL_EXP__INTEGER_VALUE:
            return getIntegerValue();
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
        case EXPPackage.EINTEGER_LITERAL_EXP__INTEGER_VALUE:
            setIntegerValue((Integer) newValue);
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
        case EXPPackage.EINTEGER_LITERAL_EXP__INTEGER_VALUE:
            setIntegerValue(INTEGER_VALUE_EDEFAULT);
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
        case EXPPackage.EINTEGER_LITERAL_EXP__INTEGER_VALUE:
            return INTEGER_VALUE_EDEFAULT == null ? integerValue != null
                : !INTEGER_VALUE_EDEFAULT.equals(integerValue);
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
        result.append(" (integerValue: ");
        result.append(integerValue);
        result.append(')');
        return result.toString();
    }

} //EIntegerLiteralExpImpl
