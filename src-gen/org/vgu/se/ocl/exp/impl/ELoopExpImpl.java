/**
 */
package org.vgu.se.ocl.exp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.vgu.se.ocl.exp.ELoopExp;
import org.vgu.se.ocl.exp.EOclExpression;
import org.vgu.se.ocl.exp.EVariable;
import org.vgu.se.ocl.exp.EXPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ELoop Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.ELoopExpImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.ELoopExpImpl#getIterator <em>Iterator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ELoopExpImpl extends ECallExpImpl implements ELoopExp {
    /**
     * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBody()
     * @generated
     * @ordered
     */
    protected EOclExpression body;

    /**
     * The cached value of the '{@link #getIterator() <em>Iterator</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIterator()
     * @generated
     * @ordered
     */
    protected EList<EVariable> iterator;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ELoopExpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EXPPackage.Literals.ELOOP_EXP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOclExpression getBody() {
        return body;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBody(EOclExpression newBody,
        NotificationChain msgs) {
        EOclExpression oldBody = body;
        body = newBody;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, EXPPackage.ELOOP_EXP__BODY, oldBody, newBody);
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
    public void setBody(EOclExpression newBody) {
        if (newBody != body) {
            NotificationChain msgs = null;
            if (body != null)
                msgs = ((InternalEObject) body).eInverseRemove(this,
                    EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER,
                    EOclExpression.class, msgs);
            if (newBody != null)
                msgs = ((InternalEObject) newBody).eInverseAdd(this,
                    EXPPackage.EOCL_EXPRESSION__LOOP_BODY_OWNER,
                    EOclExpression.class, msgs);
            msgs = basicSetBody(newBody, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                EXPPackage.ELOOP_EXP__BODY, newBody, newBody));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EVariable> getIterator() {
        if (iterator == null) {
            iterator = new EObjectContainmentWithInverseEList<EVariable>(
                EVariable.class, this, EXPPackage.ELOOP_EXP__ITERATOR,
                EXPPackage.EVARIABLE__LOOP_EXP);
        }
        return iterator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd,
        int featureID, NotificationChain msgs) {
        switch (featureID) {
        case EXPPackage.ELOOP_EXP__BODY:
            if (body != null)
                msgs = ((InternalEObject) body).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE - EXPPackage.ELOOP_EXP__BODY, null,
                    msgs);
            return basicSetBody((EOclExpression) otherEnd, msgs);
        case EXPPackage.ELOOP_EXP__ITERATOR:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getIterator())
                .basicAdd(otherEnd, msgs);
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
        case EXPPackage.ELOOP_EXP__BODY:
            return basicSetBody(null, msgs);
        case EXPPackage.ELOOP_EXP__ITERATOR:
            return ((InternalEList<?>) getIterator()).basicRemove(otherEnd,
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
        case EXPPackage.ELOOP_EXP__BODY:
            return getBody();
        case EXPPackage.ELOOP_EXP__ITERATOR:
            return getIterator();
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
        case EXPPackage.ELOOP_EXP__BODY:
            setBody((EOclExpression) newValue);
            return;
        case EXPPackage.ELOOP_EXP__ITERATOR:
            getIterator().clear();
            getIterator().addAll((Collection<? extends EVariable>) newValue);
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
        case EXPPackage.ELOOP_EXP__BODY:
            setBody((EOclExpression) null);
            return;
        case EXPPackage.ELOOP_EXP__ITERATOR:
            getIterator().clear();
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
        case EXPPackage.ELOOP_EXP__BODY:
            return body != null;
        case EXPPackage.ELOOP_EXP__ITERATOR:
            return iterator != null && !iterator.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ELoopExpImpl
