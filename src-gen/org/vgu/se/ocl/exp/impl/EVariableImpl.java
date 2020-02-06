/**
 */
package org.vgu.se.ocl.exp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.vgu.se.ocl.exp.EIterateExp;
import org.vgu.se.ocl.exp.ELoopExp;
import org.vgu.se.ocl.exp.EOclExpression;
import org.vgu.se.ocl.exp.EVariable;
import org.vgu.se.ocl.exp.expPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EVariable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EVariableImpl#getLoopExp <em>Loop Exp</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EVariableImpl#getBaseExp <em>Base Exp</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EVariableImpl#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EVariableImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EVariableImpl extends MinimalEObjectImpl.Container
    implements EVariable {
    /**
     * The cached value of the '{@link #getInitExpression() <em>Init Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitExpression()
     * @generated
     * @ordered
     */
    protected EOclExpression initExpression;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return expPackage.Literals.EVARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ELoopExp getLoopExp() {
        if (eContainerFeatureID() != expPackage.EVARIABLE__LOOP_EXP)
            return null;
        return (ELoopExp) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopExp(ELoopExp newLoopExp,
        NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newLoopExp,
            expPackage.EVARIABLE__LOOP_EXP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoopExp(ELoopExp newLoopExp) {
        if (newLoopExp != eInternalContainer()
            || (eContainerFeatureID() != expPackage.EVARIABLE__LOOP_EXP
                && newLoopExp != null)) {
            if (EcoreUtil.isAncestor(this, newLoopExp))
                throw new IllegalArgumentException(
                    "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newLoopExp != null)
                msgs = ((InternalEObject) newLoopExp).eInverseAdd(this,
                    expPackage.ELOOP_EXP__ITERATOR, ELoopExp.class, msgs);
            msgs = basicSetLoopExp(newLoopExp, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                expPackage.EVARIABLE__LOOP_EXP, newLoopExp, newLoopExp));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EIterateExp getBaseExp() {
        if (eContainerFeatureID() != expPackage.EVARIABLE__BASE_EXP)
            return null;
        return (EIterateExp) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseExp(EIterateExp newBaseExp,
        NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newBaseExp,
            expPackage.EVARIABLE__BASE_EXP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseExp(EIterateExp newBaseExp) {
        if (newBaseExp != eInternalContainer()
            || (eContainerFeatureID() != expPackage.EVARIABLE__BASE_EXP
                && newBaseExp != null)) {
            if (EcoreUtil.isAncestor(this, newBaseExp))
                throw new IllegalArgumentException(
                    "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBaseExp != null)
                msgs = ((InternalEObject) newBaseExp).eInverseAdd(this,
                    expPackage.EITERATE_EXP__RESULT, EIterateExp.class, msgs);
            msgs = basicSetBaseExp(newBaseExp, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                expPackage.EVARIABLE__BASE_EXP, newBaseExp, newBaseExp));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOclExpression getInitExpression() {
        return initExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitExpression(
        EOclExpression newInitExpression, NotificationChain msgs) {
        EOclExpression oldInitExpression = initExpression;
        initExpression = newInitExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, expPackage.EVARIABLE__INIT_EXPRESSION,
                oldInitExpression, newInitExpression);
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
    public void setInitExpression(EOclExpression newInitExpression) {
        if (newInitExpression != initExpression) {
            NotificationChain msgs = null;
            if (initExpression != null)
                msgs = ((InternalEObject) initExpression).eInverseRemove(this,
                    expPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT,
                    EOclExpression.class, msgs);
            if (newInitExpression != null)
                msgs = ((InternalEObject) newInitExpression).eInverseAdd(this,
                    expPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT,
                    EOclExpression.class, msgs);
            msgs = basicSetInitExpression(newInitExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                expPackage.EVARIABLE__INIT_EXPRESSION, newInitExpression,
                newInitExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                expPackage.EVARIABLE__NAME, oldName, name));
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
        case expPackage.EVARIABLE__LOOP_EXP:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetLoopExp((ELoopExp) otherEnd, msgs);
        case expPackage.EVARIABLE__BASE_EXP:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetBaseExp((EIterateExp) otherEnd, msgs);
        case expPackage.EVARIABLE__INIT_EXPRESSION:
            if (initExpression != null)
                msgs = ((InternalEObject) initExpression)
                    .eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                            - expPackage.EVARIABLE__INIT_EXPRESSION,
                        null, msgs);
            return basicSetInitExpression((EOclExpression) otherEnd, msgs);
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
        case expPackage.EVARIABLE__LOOP_EXP:
            return basicSetLoopExp(null, msgs);
        case expPackage.EVARIABLE__BASE_EXP:
            return basicSetBaseExp(null, msgs);
        case expPackage.EVARIABLE__INIT_EXPRESSION:
            return basicSetInitExpression(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(
        NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case expPackage.EVARIABLE__LOOP_EXP:
            return eInternalContainer().eInverseRemove(this,
                expPackage.ELOOP_EXP__ITERATOR, ELoopExp.class, msgs);
        case expPackage.EVARIABLE__BASE_EXP:
            return eInternalContainer().eInverseRemove(this,
                expPackage.EITERATE_EXP__RESULT, EIterateExp.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case expPackage.EVARIABLE__LOOP_EXP:
            return getLoopExp();
        case expPackage.EVARIABLE__BASE_EXP:
            return getBaseExp();
        case expPackage.EVARIABLE__INIT_EXPRESSION:
            return getInitExpression();
        case expPackage.EVARIABLE__NAME:
            return getName();
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
        case expPackage.EVARIABLE__LOOP_EXP:
            setLoopExp((ELoopExp) newValue);
            return;
        case expPackage.EVARIABLE__BASE_EXP:
            setBaseExp((EIterateExp) newValue);
            return;
        case expPackage.EVARIABLE__INIT_EXPRESSION:
            setInitExpression((EOclExpression) newValue);
            return;
        case expPackage.EVARIABLE__NAME:
            setName((String) newValue);
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
        case expPackage.EVARIABLE__LOOP_EXP:
            setLoopExp((ELoopExp) null);
            return;
        case expPackage.EVARIABLE__BASE_EXP:
            setBaseExp((EIterateExp) null);
            return;
        case expPackage.EVARIABLE__INIT_EXPRESSION:
            setInitExpression((EOclExpression) null);
            return;
        case expPackage.EVARIABLE__NAME:
            setName(NAME_EDEFAULT);
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
        case expPackage.EVARIABLE__LOOP_EXP:
            return getLoopExp() != null;
        case expPackage.EVARIABLE__BASE_EXP:
            return getBaseExp() != null;
        case expPackage.EVARIABLE__INIT_EXPRESSION:
            return initExpression != null;
        case expPackage.EVARIABLE__NAME:
            return NAME_EDEFAULT == null ? name != null
                : !NAME_EDEFAULT.equals(name);
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //EVariableImpl
