/**
 */
package ocl.dm.impl;

import ocl.dm.AssociationEnd;
import ocl.dm.DmPackage;
import ocl.dm.Entity;
import ocl.dm.Multiplicity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocl.dm.impl.AssociationEndImpl#getName <em>Name</em>}</li>
 *   <li>{@link ocl.dm.impl.AssociationEndImpl#getMult <em>Mult</em>}</li>
 *   <li>{@link ocl.dm.impl.AssociationEndImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ocl.dm.impl.AssociationEndImpl#getOpp <em>Opp</em>}</li>
 *   <li>{@link ocl.dm.impl.AssociationEndImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationEndImpl extends MinimalEObjectImpl.Container implements AssociationEnd {
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
	 * The default value of the '{@link #getMult() <em>Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMult()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicity MULT_EDEFAULT = Multiplicity.ONE;

	/**
	 * The cached value of the '{@link #getMult() <em>Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMult()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity mult = MULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Entity target;

	/**
	 * The cached value of the '{@link #getOpp() <em>Opp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpp()
	 * @generated
	 * @ordered
	 */
	protected AssociationEnd opp;

	/**
	 * The default value of the '{@link #getAssociation() <em>Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected String association = ASSOCIATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmPackage.Literals.ASSOCIATION_END;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ASSOCIATION_END__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getMult() {
		return mult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMult(Multiplicity newMult) {
		Multiplicity oldMult = mult;
		mult = newMult == null ? MULT_EDEFAULT : newMult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ASSOCIATION_END__MULT, oldMult, mult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Entity)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmPackage.ASSOCIATION_END__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Entity newTarget) {
		Entity oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ASSOCIATION_END__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationEnd getOpp() {
		if (opp != null && opp.eIsProxy()) {
			InternalEObject oldOpp = (InternalEObject)opp;
			opp = (AssociationEnd)eResolveProxy(oldOpp);
			if (opp != oldOpp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmPackage.ASSOCIATION_END__OPP, oldOpp, opp));
			}
		}
		return opp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd basicGetOpp() {
		return opp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpp(AssociationEnd newOpp) {
		AssociationEnd oldOpp = opp;
		opp = newOpp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ASSOCIATION_END__OPP, oldOpp, opp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociation(String newAssociation) {
		String oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ASSOCIATION_END__ASSOCIATION, oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DmPackage.ASSOCIATION_END__NAME:
				return getName();
			case DmPackage.ASSOCIATION_END__MULT:
				return getMult();
			case DmPackage.ASSOCIATION_END__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DmPackage.ASSOCIATION_END__OPP:
				if (resolve) return getOpp();
				return basicGetOpp();
			case DmPackage.ASSOCIATION_END__ASSOCIATION:
				return getAssociation();
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
			case DmPackage.ASSOCIATION_END__NAME:
				setName((String)newValue);
				return;
			case DmPackage.ASSOCIATION_END__MULT:
				setMult((Multiplicity) newValue);
				return;
			case DmPackage.ASSOCIATION_END__TARGET:
				setTarget((Entity)newValue);
				return;
			case DmPackage.ASSOCIATION_END__OPP:
				setOpp((AssociationEnd)newValue);
				return;
			case DmPackage.ASSOCIATION_END__ASSOCIATION:
				setAssociation((String)newValue);
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
			case DmPackage.ASSOCIATION_END__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DmPackage.ASSOCIATION_END__MULT:
				setMult(MULT_EDEFAULT);
				return;
			case DmPackage.ASSOCIATION_END__TARGET:
				setTarget((Entity)null);
				return;
			case DmPackage.ASSOCIATION_END__OPP:
				setOpp((AssociationEnd)null);
				return;
			case DmPackage.ASSOCIATION_END__ASSOCIATION:
				setAssociation(ASSOCIATION_EDEFAULT);
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
			case DmPackage.ASSOCIATION_END__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DmPackage.ASSOCIATION_END__MULT:
				return mult != MULT_EDEFAULT;
			case DmPackage.ASSOCIATION_END__TARGET:
				return target != null;
			case DmPackage.ASSOCIATION_END__OPP:
				return opp != null;
			case DmPackage.ASSOCIATION_END__ASSOCIATION:
				return ASSOCIATION_EDEFAULT == null ? association != null : !ASSOCIATION_EDEFAULT.equals(association);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", mult: ");
		result.append(mult);
		result.append(", association: ");
		result.append(association);
		result.append(')');
		return result.toString();
	}

} //AssociationEndImpl
