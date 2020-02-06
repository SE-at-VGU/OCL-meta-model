/**
 */
package org.vgu.se.ocl.dm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.vgu.se.ocl.dm.EDataModel;
import org.vgu.se.ocl.dm.EEntity;
import org.vgu.se.ocl.dm.dmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EData Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EDataModelImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDataModelImpl extends MinimalEObjectImpl.Container
    implements EDataModel {
    /**
     * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClasses()
     * @generated
     * @ordered
     */
    protected EList<EEntity> classes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EDataModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return dmPackage.Literals.EDATA_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EEntity> getClasses() {
        if (classes == null) {
            classes = new EObjectContainmentEList<EEntity>(EEntity.class, this,
                dmPackage.EDATA_MODEL__CLASSES);
        }
        return classes;
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
        case dmPackage.EDATA_MODEL__CLASSES:
            return ((InternalEList<?>) getClasses()).basicRemove(otherEnd,
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
        case dmPackage.EDATA_MODEL__CLASSES:
            return getClasses();
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
        case dmPackage.EDATA_MODEL__CLASSES:
            getClasses().clear();
            getClasses().addAll((Collection<? extends EEntity>) newValue);
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
        case dmPackage.EDATA_MODEL__CLASSES:
            getClasses().clear();
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
        case dmPackage.EDATA_MODEL__CLASSES:
            return classes != null && !classes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EDataModelImpl
