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

import org.vgu.se.ocl.exp.ECallExp;
import org.vgu.se.ocl.exp.EIfExp;
import org.vgu.se.ocl.exp.ELoopExp;
import org.vgu.se.ocl.exp.ENavigationCallExp;
import org.vgu.se.ocl.exp.EOclExpression;
import org.vgu.se.ocl.exp.EOperationCallExp;
import org.vgu.se.ocl.exp.EVariable;
import org.vgu.se.ocl.exp.EXPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOcl Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EOclExpressionImpl#getLoopBodyOwner <em>Loop Body Owner</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EOclExpressionImpl#getAppliedElement <em>Applied Element</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EOclExpressionImpl#getInitializedElement <em>Initialized Element</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EOclExpressionImpl#getThenOwner <em>Then Owner</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EOclExpressionImpl#getIfOwner <em>If Owner</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EOclExpressionImpl#getElseOwner <em>Else Owner</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EOclExpressionImpl#getParentCall <em>Parent Call</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EOclExpressionImpl#getParentNav <em>Parent Nav</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EOclExpressionImpl extends MinimalEObjectImpl.Container
    implements EOclExpression {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EOclExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EXPPackage.Literals.EOCL_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ELoopExp getLoopBodyOwner() {
        if (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER)
            return null;
        return (ELoopExp) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopBodyOwner(ELoopExp newLoopBodyOwner,
        NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newLoopBodyOwner,
            EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoopBodyOwner(ELoopExp newLoopBodyOwner) {
        if (newLoopBodyOwner != eInternalContainer()
            || (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER
                && newLoopBodyOwner != null)) {
            if (EcoreUtil.isAncestor(this, newLoopBodyOwner))
                throw new IllegalArgumentException(
                    "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newLoopBodyOwner != null)
                msgs = ((InternalEObject) newLoopBodyOwner).eInverseAdd(this,
                    EXPPackage.ELOOP_EXP__BODY, ELoopExp.class, msgs);
            msgs = basicSetLoopBodyOwner(newLoopBodyOwner, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER, newLoopBodyOwner,
                newLoopBodyOwner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ECallExp getAppliedElement() {
        if (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__APPLIED_ELEMENT)
            return null;
        return (ECallExp) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAppliedElement(ECallExp newAppliedElement,
        NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newAppliedElement,
            EXPPackage.EOCL_EXPRESSION__APPLIED_ELEMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAppliedElement(ECallExp newAppliedElement) {
        if (newAppliedElement != eInternalContainer()
            || (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__APPLIED_ELEMENT
                && newAppliedElement != null)) {
            if (EcoreUtil.isAncestor(this, newAppliedElement))
                throw new IllegalArgumentException(
                    "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAppliedElement != null)
                msgs = ((InternalEObject) newAppliedElement).eInverseAdd(this,
                    EXPPackage.ECALL_EXP__SOURCE, ECallExp.class, msgs);
            msgs = basicSetAppliedElement(newAppliedElement, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.EOCL_EXPRESSION__APPLIED_ELEMENT, newAppliedElement,
                newAppliedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EVariable getInitializedElement() {
        if (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT)
            return null;
        return (EVariable) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitializedElement(
        EVariable newInitializedElement, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newInitializedElement,
            EXPPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInitializedElement(EVariable newInitializedElement) {
        if (newInitializedElement != eInternalContainer()
            || (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT
                && newInitializedElement != null)) {
            if (EcoreUtil.isAncestor(this, newInitializedElement))
                throw new IllegalArgumentException(
                    "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newInitializedElement != null)
                msgs = ((InternalEObject) newInitializedElement).eInverseAdd(
                    this, EXPPackage.EVARIABLE__INIT_EXPRESSION,
                    EVariable.class, msgs);
            msgs = basicSetInitializedElement(newInitializedElement, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT,
                newInitializedElement, newInitializedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EIfExp getThenOwner() {
        if (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__THEN_OWNER)
            return null;
        return (EIfExp) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThenOwner(EIfExp newThenOwner,
        NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newThenOwner,
            EXPPackage.EOCL_EXPRESSION__THEN_OWNER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThenOwner(EIfExp newThenOwner) {
        if (newThenOwner != eInternalContainer()
            || (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__THEN_OWNER
                && newThenOwner != null)) {
            if (EcoreUtil.isAncestor(this, newThenOwner))
                throw new IllegalArgumentException(
                    "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newThenOwner != null)
                msgs = ((InternalEObject) newThenOwner).eInverseAdd(this,
                    EXPPackage.EIF_EXP__THEN_EXPRESSION, EIfExp.class, msgs);
            msgs = basicSetThenOwner(newThenOwner, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.EOCL_EXPRESSION__THEN_OWNER, newThenOwner,
                newThenOwner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EIfExp getIfOwner() {
        if (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__IF_OWNER)
            return null;
        return (EIfExp) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIfOwner(EIfExp newIfOwner,
        NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newIfOwner,
            EXPPackage.EOCL_EXPRESSION__IF_OWNER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIfOwner(EIfExp newIfOwner) {
        if (newIfOwner != eInternalContainer()
            || (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__IF_OWNER
                && newIfOwner != null)) {
            if (EcoreUtil.isAncestor(this, newIfOwner))
                throw new IllegalArgumentException(
                    "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newIfOwner != null)
                msgs = ((InternalEObject) newIfOwner).eInverseAdd(this,
                    EXPPackage.EIF_EXP__CONDITION, EIfExp.class, msgs);
            msgs = basicSetIfOwner(newIfOwner, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.EOCL_EXPRESSION__IF_OWNER, newIfOwner, newIfOwner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EIfExp getElseOwner() {
        if (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__ELSE_OWNER)
            return null;
        return (EIfExp) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElseOwner(EIfExp newElseOwner,
        NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newElseOwner,
            EXPPackage.EOCL_EXPRESSION__ELSE_OWNER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setElseOwner(EIfExp newElseOwner) {
        if (newElseOwner != eInternalContainer()
            || (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__ELSE_OWNER
                && newElseOwner != null)) {
            if (EcoreUtil.isAncestor(this, newElseOwner))
                throw new IllegalArgumentException(
                    "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newElseOwner != null)
                msgs = ((InternalEObject) newElseOwner).eInverseAdd(this,
                    EXPPackage.EIF_EXP__ELSE_EXPRESSION, EIfExp.class, msgs);
            msgs = basicSetElseOwner(newElseOwner, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.EOCL_EXPRESSION__ELSE_OWNER, newElseOwner,
                newElseOwner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperationCallExp getParentCall() {
        if (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__PARENT_CALL)
            return null;
        return (EOperationCallExp) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentCall(EOperationCallExp newParentCall,
        NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newParentCall,
            EXPPackage.EOCL_EXPRESSION__PARENT_CALL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentCall(EOperationCallExp newParentCall) {
        if (newParentCall != eInternalContainer()
            || (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__PARENT_CALL
                && newParentCall != null)) {
            if (EcoreUtil.isAncestor(this, newParentCall))
                throw new IllegalArgumentException(
                    "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentCall != null)
                msgs = ((InternalEObject) newParentCall).eInverseAdd(this,
                    EXPPackage.EOPERATION_CALL_EXP__ARGUMENT,
                    EOperationCallExp.class, msgs);
            msgs = basicSetParentCall(newParentCall, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.EOCL_EXPRESSION__PARENT_CALL, newParentCall,
                newParentCall));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ENavigationCallExp getParentNav() {
        if (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__PARENT_NAV)
            return null;
        return (ENavigationCallExp) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentNav(ENavigationCallExp newParentNav,
        NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newParentNav,
            EXPPackage.EOCL_EXPRESSION__PARENT_NAV, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentNav(ENavigationCallExp newParentNav) {
        if (newParentNav != eInternalContainer()
            || (eContainerFeatureID() != EXPPackage.EOCL_EXPRESSION__PARENT_NAV
                && newParentNav != null)) {
            if (EcoreUtil.isAncestor(this, newParentNav))
                throw new IllegalArgumentException(
                    "Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentNav != null)
                msgs = ((InternalEObject) newParentNav).eInverseAdd(this,
                    EXPPackage.ENAVIGATION_CALL_EXP__QUALIFIER,
                    ENavigationCallExp.class, msgs);
            msgs = basicSetParentNav(newParentNav, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.EOCL_EXPRESSION__PARENT_NAV, newParentNav,
                newParentNav));
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
        case EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetLoopBodyOwner((ELoopExp) otherEnd, msgs);
        case EXPPackage.EOCL_EXPRESSION__APPLIED_ELEMENT:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetAppliedElement((ECallExp) otherEnd, msgs);
        case EXPPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetInitializedElement((EVariable) otherEnd, msgs);
        case EXPPackage.EOCL_EXPRESSION__THEN_OWNER:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetThenOwner((EIfExp) otherEnd, msgs);
        case EXPPackage.EOCL_EXPRESSION__IF_OWNER:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetIfOwner((EIfExp) otherEnd, msgs);
        case EXPPackage.EOCL_EXPRESSION__ELSE_OWNER:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetElseOwner((EIfExp) otherEnd, msgs);
        case EXPPackage.EOCL_EXPRESSION__PARENT_CALL:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParentCall((EOperationCallExp) otherEnd, msgs);
        case EXPPackage.EOCL_EXPRESSION__PARENT_NAV:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParentNav((ENavigationCallExp) otherEnd, msgs);
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
        case EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER:
            return basicSetLoopBodyOwner(null, msgs);
        case EXPPackage.EOCL_EXPRESSION__APPLIED_ELEMENT:
            return basicSetAppliedElement(null, msgs);
        case EXPPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT:
            return basicSetInitializedElement(null, msgs);
        case EXPPackage.EOCL_EXPRESSION__THEN_OWNER:
            return basicSetThenOwner(null, msgs);
        case EXPPackage.EOCL_EXPRESSION__IF_OWNER:
            return basicSetIfOwner(null, msgs);
        case EXPPackage.EOCL_EXPRESSION__ELSE_OWNER:
            return basicSetElseOwner(null, msgs);
        case EXPPackage.EOCL_EXPRESSION__PARENT_CALL:
            return basicSetParentCall(null, msgs);
        case EXPPackage.EOCL_EXPRESSION__PARENT_NAV:
            return basicSetParentNav(null, msgs);
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
        case EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER:
            return eInternalContainer().eInverseRemove(this,
                EXPPackage.ELOOP_EXP__BODY, ELoopExp.class, msgs);
        case EXPPackage.EOCL_EXPRESSION__APPLIED_ELEMENT:
            return eInternalContainer().eInverseRemove(this,
                EXPPackage.ECALL_EXP__SOURCE, ECallExp.class, msgs);
        case EXPPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT:
            return eInternalContainer().eInverseRemove(this,
                EXPPackage.EVARIABLE__INIT_EXPRESSION, EVariable.class, msgs);
        case EXPPackage.EOCL_EXPRESSION__THEN_OWNER:
            return eInternalContainer().eInverseRemove(this,
                EXPPackage.EIF_EXP__THEN_EXPRESSION, EIfExp.class, msgs);
        case EXPPackage.EOCL_EXPRESSION__IF_OWNER:
            return eInternalContainer().eInverseRemove(this,
                EXPPackage.EIF_EXP__CONDITION, EIfExp.class, msgs);
        case EXPPackage.EOCL_EXPRESSION__ELSE_OWNER:
            return eInternalContainer().eInverseRemove(this,
                EXPPackage.EIF_EXP__ELSE_EXPRESSION, EIfExp.class, msgs);
        case EXPPackage.EOCL_EXPRESSION__PARENT_CALL:
            return eInternalContainer().eInverseRemove(this,
                EXPPackage.EOPERATION_CALL_EXP__ARGUMENT,
                EOperationCallExp.class, msgs);
        case EXPPackage.EOCL_EXPRESSION__PARENT_NAV:
            return eInternalContainer().eInverseRemove(this,
                EXPPackage.ENAVIGATION_CALL_EXP__QUALIFIER,
                ENavigationCallExp.class, msgs);
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
        case EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER:
            return getLoopBodyOwner();
        case EXPPackage.EOCL_EXPRESSION__APPLIED_ELEMENT:
            return getAppliedElement();
        case EXPPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT:
            return getInitializedElement();
        case EXPPackage.EOCL_EXPRESSION__THEN_OWNER:
            return getThenOwner();
        case EXPPackage.EOCL_EXPRESSION__IF_OWNER:
            return getIfOwner();
        case EXPPackage.EOCL_EXPRESSION__ELSE_OWNER:
            return getElseOwner();
        case EXPPackage.EOCL_EXPRESSION__PARENT_CALL:
            return getParentCall();
        case EXPPackage.EOCL_EXPRESSION__PARENT_NAV:
            return getParentNav();
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
        case EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER:
            setLoopBodyOwner((ELoopExp) newValue);
            return;
        case EXPPackage.EOCL_EXPRESSION__APPLIED_ELEMENT:
            setAppliedElement((ECallExp) newValue);
            return;
        case EXPPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT:
            setInitializedElement((EVariable) newValue);
            return;
        case EXPPackage.EOCL_EXPRESSION__THEN_OWNER:
            setThenOwner((EIfExp) newValue);
            return;
        case EXPPackage.EOCL_EXPRESSION__IF_OWNER:
            setIfOwner((EIfExp) newValue);
            return;
        case EXPPackage.EOCL_EXPRESSION__ELSE_OWNER:
            setElseOwner((EIfExp) newValue);
            return;
        case EXPPackage.EOCL_EXPRESSION__PARENT_CALL:
            setParentCall((EOperationCallExp) newValue);
            return;
        case EXPPackage.EOCL_EXPRESSION__PARENT_NAV:
            setParentNav((ENavigationCallExp) newValue);
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
        case EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER:
            setLoopBodyOwner((ELoopExp) null);
            return;
        case EXPPackage.EOCL_EXPRESSION__APPLIED_ELEMENT:
            setAppliedElement((ECallExp) null);
            return;
        case EXPPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT:
            setInitializedElement((EVariable) null);
            return;
        case EXPPackage.EOCL_EXPRESSION__THEN_OWNER:
            setThenOwner((EIfExp) null);
            return;
        case EXPPackage.EOCL_EXPRESSION__IF_OWNER:
            setIfOwner((EIfExp) null);
            return;
        case EXPPackage.EOCL_EXPRESSION__ELSE_OWNER:
            setElseOwner((EIfExp) null);
            return;
        case EXPPackage.EOCL_EXPRESSION__PARENT_CALL:
            setParentCall((EOperationCallExp) null);
            return;
        case EXPPackage.EOCL_EXPRESSION__PARENT_NAV:
            setParentNav((ENavigationCallExp) null);
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
        case EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER:
            return getLoopBodyOwner() != null;
        case EXPPackage.EOCL_EXPRESSION__APPLIED_ELEMENT:
            return getAppliedElement() != null;
        case EXPPackage.EOCL_EXPRESSION__INITIALIZED_ELEMENT:
            return getInitializedElement() != null;
        case EXPPackage.EOCL_EXPRESSION__THEN_OWNER:
            return getThenOwner() != null;
        case EXPPackage.EOCL_EXPRESSION__IF_OWNER:
            return getIfOwner() != null;
        case EXPPackage.EOCL_EXPRESSION__ELSE_OWNER:
            return getElseOwner() != null;
        case EXPPackage.EOCL_EXPRESSION__PARENT_CALL:
            return getParentCall() != null;
        case EXPPackage.EOCL_EXPRESSION__PARENT_NAV:
            return getParentNav() != null;
        }
        return super.eIsSet(featureID);
    }

} //EOclExpressionImpl
