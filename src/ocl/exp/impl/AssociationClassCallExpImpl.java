/**
 */
package ocl.exp.impl;

import ocl.dm.AssociationEnd;

import ocl.exp.AssociationClassCallExp;
import ocl.exp.ExpPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Class Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.impl.AssociationClassCallExpImpl#getReferredAssociationEnds <em>Referred Association Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationClassCallExpImpl extends CallExpImpl implements AssociationClassCallExp {
	/**
	 * The cached value of the '{@link #getReferredAssociationEnds() <em>Referred Association Ends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredAssociationEnds()
	 * @generated
	 * @ordered
	 */
	protected AssociationEnd referredAssociationEnds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationClassCallExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpPackage.Literals.ASSOCIATION_CLASS_CALL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationEnd getReferredAssociationEnds() {
		if (referredAssociationEnds != null && referredAssociationEnds.eIsProxy()) {
			InternalEObject oldReferredAssociationEnds = (InternalEObject)referredAssociationEnds;
			referredAssociationEnds = (AssociationEnd)eResolveProxy(oldReferredAssociationEnds);
			if (referredAssociationEnds != oldReferredAssociationEnds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS, oldReferredAssociationEnds, referredAssociationEnds));
			}
		}
		return referredAssociationEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd basicGetReferredAssociationEnds() {
		return referredAssociationEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferredAssociationEnds(AssociationEnd newReferredAssociationEnds) {
		AssociationEnd oldReferredAssociationEnds = referredAssociationEnds;
		referredAssociationEnds = newReferredAssociationEnds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS, oldReferredAssociationEnds, referredAssociationEnds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS:
				if (resolve) return getReferredAssociationEnds();
				return basicGetReferredAssociationEnds();
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
			case ExpPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS:
				setReferredAssociationEnds((AssociationEnd)newValue);
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
			case ExpPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS:
				setReferredAssociationEnds((AssociationEnd)null);
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
			case ExpPackage.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS:
				return referredAssociationEnds != null;
		}
		return super.eIsSet(featureID);
	}

} //AssociationClassCallExpImpl
