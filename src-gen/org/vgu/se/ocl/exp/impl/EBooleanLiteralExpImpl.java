/**
 */
package org.vgu.se.ocl.exp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.vgu.se.ocl.exp.EBooleanLiteralExp;
import org.vgu.se.ocl.exp.expPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBoolean Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EBooleanLiteralExpImpl#getBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBooleanLiteralExpImpl extends EPrimitiveTypeImpl
    implements EBooleanLiteralExp {
    /**
     * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBooleanValue()
     * @generated
     * @ordered
     */
    protected static final Boolean BOOLEAN_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBooleanValue()
     * @generated
     * @ordered
     */
    protected Boolean booleanValue = BOOLEAN_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EBooleanLiteralExpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return expPackage.Literals.EBOOLEAN_LITERAL_EXP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getBooleanValue() {
        return booleanValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBooleanValue(Boolean newBooleanValue) {
        Boolean oldBooleanValue = booleanValue;
        booleanValue = newBooleanValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                expPackage.EBOOLEAN_LITERAL_EXP__BOOLEAN_VALUE, oldBooleanValue,
                booleanValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case expPackage.EBOOLEAN_LITERAL_EXP__BOOLEAN_VALUE:
            return getBooleanValue();
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
        case expPackage.EBOOLEAN_LITERAL_EXP__BOOLEAN_VALUE:
            setBooleanValue((Boolean) newValue);
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
        case expPackage.EBOOLEAN_LITERAL_EXP__BOOLEAN_VALUE:
            setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
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
        case expPackage.EBOOLEAN_LITERAL_EXP__BOOLEAN_VALUE:
            return BOOLEAN_VALUE_EDEFAULT == null ? booleanValue != null
                : !BOOLEAN_VALUE_EDEFAULT.equals(booleanValue);
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
        result.append(" (booleanValue: ");
        result.append(booleanValue);
        result.append(')');
        return result.toString();
    }

} //EBooleanLiteralExpImpl
