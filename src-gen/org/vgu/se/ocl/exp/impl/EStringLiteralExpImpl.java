/**
 */
package org.vgu.se.ocl.exp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.vgu.se.ocl.exp.EStringLiteralExp;
import org.vgu.se.ocl.exp.EXPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EString Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EStringLiteralExpImpl#getStringValue <em>String Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EStringLiteralExpImpl extends EPrimitiveTypeImpl
    implements EStringLiteralExp {
    /**
     * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStringValue()
     * @generated
     * @ordered
     */
    protected static final String STRING_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStringValue()
     * @generated
     * @ordered
     */
    protected String stringValue = STRING_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EStringLiteralExpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EXPPackage.Literals.ESTRING_LITERAL_EXP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getStringValue() {
        return stringValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStringValue(String newStringValue) {
        String oldStringValue = stringValue;
        stringValue = newStringValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.ESTRING_LITERAL_EXP__STRING_VALUE, oldStringValue,
                stringValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case EXPPackage.ESTRING_LITERAL_EXP__STRING_VALUE:
            return getStringValue();
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
        case EXPPackage.ESTRING_LITERAL_EXP__STRING_VALUE:
            setStringValue((String) newValue);
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
        case EXPPackage.ESTRING_LITERAL_EXP__STRING_VALUE:
            setStringValue(STRING_VALUE_EDEFAULT);
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
        case EXPPackage.ESTRING_LITERAL_EXP__STRING_VALUE:
            return STRING_VALUE_EDEFAULT == null ? stringValue != null
                : !STRING_VALUE_EDEFAULT.equals(stringValue);
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
        result.append(" (stringValue: ");
        result.append(stringValue);
        result.append(')');
        return result.toString();
    }

} //EStringLiteralExpImpl
