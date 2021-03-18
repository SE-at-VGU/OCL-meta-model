/**
 */
package ocl.type.impl;

import ocl.exp.Operator;

import ocl.type.MessageType;
import ocl.type.Signal;
import ocl.type.TypePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocl.type.impl.MessageTypeImpl#getReferredSignal <em>Referred Signal</em>}</li>
 *   <li>{@link ocl.type.impl.MessageTypeImpl#getReferredOperation <em>Referred Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTypeImpl extends ClassifierImpl implements MessageType {
	/**
	 * The cached value of the '{@link #getReferredSignal() <em>Referred Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal referredSignal;

	/**
	 * The default value of the '{@link #getReferredOperation() <em>Referred Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredOperation()
	 * @generated
	 * @ordered
	 */
	protected static final Operator REFERRED_OPERATION_EDEFAULT = Operator.EQUAL;

	/**
	 * The cached value of the '{@link #getReferredOperation() <em>Referred Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredOperation()
	 * @generated
	 * @ordered
	 */
	protected Operator referredOperation = REFERRED_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.MESSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getReferredSignal() {
		if (referredSignal != null && referredSignal.eIsProxy()) {
			InternalEObject oldReferredSignal = (InternalEObject)referredSignal;
			referredSignal = (Signal)eResolveProxy(oldReferredSignal);
			if (referredSignal != oldReferredSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.MESSAGE_TYPE__REFERRED_SIGNAL, oldReferredSignal, referredSignal));
			}
		}
		return referredSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetReferredSignal() {
		return referredSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferredSignal(Signal newReferredSignal) {
		Signal oldReferredSignal = referredSignal;
		referredSignal = newReferredSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.MESSAGE_TYPE__REFERRED_SIGNAL, oldReferredSignal, referredSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getReferredOperation() {
		return referredOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferredOperation(Operator newReferredOperation) {
		Operator oldReferredOperation = referredOperation;
		referredOperation = newReferredOperation == null ? REFERRED_OPERATION_EDEFAULT : newReferredOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.MESSAGE_TYPE__REFERRED_OPERATION, oldReferredOperation, referredOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypePackage.MESSAGE_TYPE__REFERRED_SIGNAL:
				if (resolve) return getReferredSignal();
				return basicGetReferredSignal();
			case TypePackage.MESSAGE_TYPE__REFERRED_OPERATION:
				return getReferredOperation();
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
			case TypePackage.MESSAGE_TYPE__REFERRED_SIGNAL:
				setReferredSignal((Signal)newValue);
				return;
			case TypePackage.MESSAGE_TYPE__REFERRED_OPERATION:
				setReferredOperation((Operator) newValue);
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
			case TypePackage.MESSAGE_TYPE__REFERRED_SIGNAL:
				setReferredSignal((Signal)null);
				return;
			case TypePackage.MESSAGE_TYPE__REFERRED_OPERATION:
				setReferredOperation(REFERRED_OPERATION_EDEFAULT);
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
			case TypePackage.MESSAGE_TYPE__REFERRED_SIGNAL:
				return referredSignal != null;
			case TypePackage.MESSAGE_TYPE__REFERRED_OPERATION:
				return referredOperation != REFERRED_OPERATION_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (referredOperation: ");
		result.append(referredOperation);
		result.append(')');
		return result.toString();
	}

} //MessageTypeImpl
