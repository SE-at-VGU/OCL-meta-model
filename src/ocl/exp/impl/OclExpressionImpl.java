/**
 */
package ocl.exp.impl;

import ocl.exp.CallExp;
import ocl.exp.ExpPackage;
import ocl.exp.IteratorExp;
import ocl.exp.OclExpression;
import ocl.exp.OperationCallExp;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.impl.OclExpressionImpl#getLoopBodyOwner <em>Loop Body Owner</em>}</li>
 *   <li>{@link ocl.exp.impl.OclExpressionImpl#getAppliedElement <em>Applied Element</em>}</li>
 *   <li>{@link ocl.exp.impl.OclExpressionImpl#getParentCall <em>Parent Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OclExpressionImpl extends MinimalEObjectImpl.Container implements OclExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpPackage.Literals.OCL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IteratorExp getLoopBodyOwner() {
		if (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER) return null;
		return (IteratorExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopBodyOwner(IteratorExp newLoopBodyOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLoopBodyOwner, ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopBodyOwner(IteratorExp newLoopBodyOwner) {
		if (newLoopBodyOwner != eInternalContainer() || (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER && newLoopBodyOwner != null)) {
			if (EcoreUtil.isAncestor(this, newLoopBodyOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLoopBodyOwner != null)
				msgs = ((InternalEObject)newLoopBodyOwner).eInverseAdd(this, ExpPackage.ITERATOR_EXP__BODY, IteratorExp.class, msgs);
			msgs = basicSetLoopBodyOwner(newLoopBodyOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER, newLoopBodyOwner, newLoopBodyOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallExp getAppliedElement() {
		if (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT) return null;
		return (CallExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliedElement(CallExp newAppliedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAppliedElement, ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppliedElement(CallExp newAppliedElement) {
		if (newAppliedElement != eInternalContainer() || (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT && newAppliedElement != null)) {
			if (EcoreUtil.isAncestor(this, newAppliedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAppliedElement != null)
				msgs = ((InternalEObject)newAppliedElement).eInverseAdd(this, ExpPackage.CALL_EXP__SOURCE, CallExp.class, msgs);
			msgs = basicSetAppliedElement(newAppliedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT, newAppliedElement, newAppliedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationCallExp getParentCall() {
		if (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__PARENT_CALL) return null;
		return (OperationCallExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCall(OperationCallExp newParentCall, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentCall, ExpPackage.OCL_EXPRESSION__PARENT_CALL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentCall(OperationCallExp newParentCall) {
		if (newParentCall != eInternalContainer() || (eContainerFeatureID() != ExpPackage.OCL_EXPRESSION__PARENT_CALL && newParentCall != null)) {
			if (EcoreUtil.isAncestor(this, newParentCall))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentCall != null)
				msgs = ((InternalEObject)newParentCall).eInverseAdd(this, ExpPackage.OPERATION_CALL_EXP__ARGUMENT, OperationCallExp.class, msgs);
			msgs = basicSetParentCall(newParentCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpPackage.OCL_EXPRESSION__PARENT_CALL, newParentCall, newParentCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLoopBodyOwner((IteratorExp)otherEnd, msgs);
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAppliedElement((CallExp)otherEnd, msgs);
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentCall((OperationCallExp)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				return basicSetLoopBodyOwner(null, msgs);
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				return basicSetAppliedElement(null, msgs);
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				return basicSetParentCall(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				return eInternalContainer().eInverseRemove(this, ExpPackage.ITERATOR_EXP__BODY, IteratorExp.class, msgs);
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, ExpPackage.CALL_EXP__SOURCE, CallExp.class, msgs);
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				return eInternalContainer().eInverseRemove(this, ExpPackage.OPERATION_CALL_EXP__ARGUMENT, OperationCallExp.class, msgs);
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
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				return getLoopBodyOwner();
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				return getAppliedElement();
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				return getParentCall();
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
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				setLoopBodyOwner((IteratorExp)newValue);
				return;
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				setAppliedElement((CallExp)newValue);
				return;
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				setParentCall((OperationCallExp)newValue);
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
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				setLoopBodyOwner((IteratorExp)null);
				return;
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				setAppliedElement((CallExp)null);
				return;
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				setParentCall((OperationCallExp)null);
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
			case ExpPackage.OCL_EXPRESSION__LOOP_BODY_OWNER:
				return getLoopBodyOwner() != null;
			case ExpPackage.OCL_EXPRESSION__APPLIED_ELEMENT:
				return getAppliedElement() != null;
			case ExpPackage.OCL_EXPRESSION__PARENT_CALL:
				return getParentCall() != null;
		}
		return super.eIsSet(featureID);
	}

} //OclExpressionImpl
