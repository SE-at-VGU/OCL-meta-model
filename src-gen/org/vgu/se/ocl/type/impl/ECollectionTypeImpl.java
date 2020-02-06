/**
 */
package org.vgu.se.ocl.type.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.vgu.se.ocl.type.EClassifier;
import org.vgu.se.ocl.type.ECollectionType;
import org.vgu.se.ocl.type.typePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECollection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.type.impl.ECollectionTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECollectionTypeImpl extends EDataTypeImpl
    implements ECollectionType {
    /**
     * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementType()
     * @generated
     * @ordered
     */
    protected EClassifier elementType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ECollectionTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return typePackage.Literals.ECOLLECTION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClassifier getElementType() {
        if (elementType != null && elementType.eIsProxy()) {
            InternalEObject oldElementType = (InternalEObject) elementType;
            elementType = (EClassifier) eResolveProxy(oldElementType);
            if (elementType != oldElementType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        typePackage.ECOLLECTION_TYPE__ELEMENT_TYPE,
                        oldElementType, elementType));
            }
        }
        return elementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClassifier basicGetElementType() {
        return elementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setElementType(EClassifier newElementType) {
        EClassifier oldElementType = elementType;
        elementType = newElementType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                typePackage.ECOLLECTION_TYPE__ELEMENT_TYPE, oldElementType,
                elementType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case typePackage.ECOLLECTION_TYPE__ELEMENT_TYPE:
            if (resolve)
                return getElementType();
            return basicGetElementType();
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
        case typePackage.ECOLLECTION_TYPE__ELEMENT_TYPE:
            setElementType((EClassifier) newValue);
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
        case typePackage.ECOLLECTION_TYPE__ELEMENT_TYPE:
            setElementType((EClassifier) null);
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
        case typePackage.ECOLLECTION_TYPE__ELEMENT_TYPE:
            return elementType != null;
        }
        return super.eIsSet(featureID);
    }

} //ECollectionTypeImpl
