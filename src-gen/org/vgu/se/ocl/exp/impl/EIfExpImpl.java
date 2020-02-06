/**
 */
package org.vgu.se.ocl.exp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.vgu.se.ocl.exp.EIfExp;
import org.vgu.se.ocl.exp.EOclExpression;
import org.vgu.se.ocl.exp.expPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EIf Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EIfExpImpl#getThenExpression <em>Then Expression</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EIfExpImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.impl.EIfExpImpl#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EIfExpImpl extends EOclExpressionImpl implements EIfExp {
    /**
     * The cached value of the '{@link #getThenExpression() <em>Then Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThenExpression()
     * @generated
     * @ordered
     */
    protected EOclExpression thenExpression;

    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected EOclExpression condition;

    /**
     * The cached value of the '{@link #getElseExpression() <em>Else Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElseExpression()
     * @generated
     * @ordered
     */
    protected EOclExpression elseExpression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EIfExpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return expPackage.Literals.EIF_EXP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOclExpression getThenExpression() {
        return thenExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThenExpression(
        EOclExpression newThenExpression, NotificationChain msgs) {
        EOclExpression oldThenExpression = thenExpression;
        thenExpression = newThenExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, expPackage.EIF_EXP__THEN_EXPRESSION,
                oldThenExpression, newThenExpression);
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
    public void setThenExpression(EOclExpression newThenExpression) {
        if (newThenExpression != thenExpression) {
            NotificationChain msgs = null;
            if (thenExpression != null)
                msgs = ((InternalEObject) thenExpression).eInverseRemove(this,
                    expPackage.EOCL_EXPRESSION__THEN_OWNER,
                    EOclExpression.class, msgs);
            if (newThenExpression != null)
                msgs = ((InternalEObject) newThenExpression).eInverseAdd(this,
                    expPackage.EOCL_EXPRESSION__THEN_OWNER,
                    EOclExpression.class, msgs);
            msgs = basicSetThenExpression(newThenExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                expPackage.EIF_EXP__THEN_EXPRESSION, newThenExpression,
                newThenExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOclExpression getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition(EOclExpression newCondition,
        NotificationChain msgs) {
        EOclExpression oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, expPackage.EIF_EXP__CONDITION, oldCondition,
                newCondition);
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
    public void setCondition(EOclExpression newCondition) {
        if (newCondition != condition) {
            NotificationChain msgs = null;
            if (condition != null)
                msgs = ((InternalEObject) condition).eInverseRemove(this,
                    expPackage.EOCL_EXPRESSION__IF_OWNER, EOclExpression.class,
                    msgs);
            if (newCondition != null)
                msgs = ((InternalEObject) newCondition).eInverseAdd(this,
                    expPackage.EOCL_EXPRESSION__IF_OWNER, EOclExpression.class,
                    msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                expPackage.EIF_EXP__CONDITION, newCondition, newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOclExpression getElseExpression() {
        return elseExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElseExpression(
        EOclExpression newElseExpression, NotificationChain msgs) {
        EOclExpression oldElseExpression = elseExpression;
        elseExpression = newElseExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, expPackage.EIF_EXP__ELSE_EXPRESSION,
                oldElseExpression, newElseExpression);
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
    public void setElseExpression(EOclExpression newElseExpression) {
        if (newElseExpression != elseExpression) {
            NotificationChain msgs = null;
            if (elseExpression != null)
                msgs = ((InternalEObject) elseExpression).eInverseRemove(this,
                    expPackage.EOCL_EXPRESSION__ELSE_OWNER,
                    EOclExpression.class, msgs);
            if (newElseExpression != null)
                msgs = ((InternalEObject) newElseExpression).eInverseAdd(this,
                    expPackage.EOCL_EXPRESSION__ELSE_OWNER,
                    EOclExpression.class, msgs);
            msgs = basicSetElseExpression(newElseExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                expPackage.EIF_EXP__ELSE_EXPRESSION, newElseExpression,
                newElseExpression));
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
        case expPackage.EIF_EXP__THEN_EXPRESSION:
            if (thenExpression != null)
                msgs = ((InternalEObject) thenExpression).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE
                        - expPackage.EIF_EXP__THEN_EXPRESSION,
                    null, msgs);
            return basicSetThenExpression((EOclExpression) otherEnd, msgs);
        case expPackage.EIF_EXP__CONDITION:
            if (condition != null)
                msgs = ((InternalEObject) condition).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE - expPackage.EIF_EXP__CONDITION,
                    null, msgs);
            return basicSetCondition((EOclExpression) otherEnd, msgs);
        case expPackage.EIF_EXP__ELSE_EXPRESSION:
            if (elseExpression != null)
                msgs = ((InternalEObject) elseExpression).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE
                        - expPackage.EIF_EXP__ELSE_EXPRESSION,
                    null, msgs);
            return basicSetElseExpression((EOclExpression) otherEnd, msgs);
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
        case expPackage.EIF_EXP__THEN_EXPRESSION:
            return basicSetThenExpression(null, msgs);
        case expPackage.EIF_EXP__CONDITION:
            return basicSetCondition(null, msgs);
        case expPackage.EIF_EXP__ELSE_EXPRESSION:
            return basicSetElseExpression(null, msgs);
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
        case expPackage.EIF_EXP__THEN_EXPRESSION:
            return getThenExpression();
        case expPackage.EIF_EXP__CONDITION:
            return getCondition();
        case expPackage.EIF_EXP__ELSE_EXPRESSION:
            return getElseExpression();
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
        case expPackage.EIF_EXP__THEN_EXPRESSION:
            setThenExpression((EOclExpression) newValue);
            return;
        case expPackage.EIF_EXP__CONDITION:
            setCondition((EOclExpression) newValue);
            return;
        case expPackage.EIF_EXP__ELSE_EXPRESSION:
            setElseExpression((EOclExpression) newValue);
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
        case expPackage.EIF_EXP__THEN_EXPRESSION:
            setThenExpression((EOclExpression) null);
            return;
        case expPackage.EIF_EXP__CONDITION:
            setCondition((EOclExpression) null);
            return;
        case expPackage.EIF_EXP__ELSE_EXPRESSION:
            setElseExpression((EOclExpression) null);
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
        case expPackage.EIF_EXP__THEN_EXPRESSION:
            return thenExpression != null;
        case expPackage.EIF_EXP__CONDITION:
            return condition != null;
        case expPackage.EIF_EXP__ELSE_EXPRESSION:
            return elseExpression != null;
        }
        return super.eIsSet(featureID);
    }

} //EIfExpImpl
