/**
 */
package org.vgu.se.ocl.dm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.vgu.se.ocl.dm.DMPackage;
import org.vgu.se.ocl.dm.EAssociationEnd;
import org.vgu.se.ocl.dm.EEntity;
import org.vgu.se.ocl.dm.EMultiplicity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAssociation End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EAssociationEndImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EAssociationEndImpl#getMult <em>Mult</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EAssociationEndImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EAssociationEndImpl#getOpp <em>Opp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAssociationEndImpl extends MinimalEObjectImpl.Container
    implements EAssociationEnd {
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
    protected static final EMultiplicity MULT_EDEFAULT = EMultiplicity.ONE;

    /**
     * The cached value of the '{@link #getMult() <em>Mult</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMult()
     * @generated
     * @ordered
     */
    protected EMultiplicity mult = MULT_EDEFAULT;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected EEntity target;

    /**
     * The cached value of the '{@link #getOpp() <em>Opp</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpp()
     * @generated
     * @ordered
     */
    protected EAssociationEnd opp;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EAssociationEndImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DMPackage.Literals.EASSOCIATION_END;
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
                DMPackage.EASSOCIATION_END__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EMultiplicity getMult() {
        return mult;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMult(EMultiplicity newMult) {
        EMultiplicity oldMult = mult;
        mult = newMult == null ? MULT_EDEFAULT : newMult;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                DMPackage.EASSOCIATION_END__MULT, oldMult, mult));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEntity getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject) target;
            target = (EEntity) eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        DMPackage.EASSOCIATION_END__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEntity basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTarget(EEntity newTarget) {
        EEntity oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                DMPackage.EASSOCIATION_END__TARGET, oldTarget, target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAssociationEnd getOpp() {
        if (opp != null && opp.eIsProxy()) {
            InternalEObject oldOpp = (InternalEObject) opp;
            opp = (EAssociationEnd) eResolveProxy(oldOpp);
            if (opp != oldOpp) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        DMPackage.EASSOCIATION_END__OPP, oldOpp, opp));
            }
        }
        return opp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAssociationEnd basicGetOpp() {
        return opp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOpp(EAssociationEnd newOpp) {
        EAssociationEnd oldOpp = opp;
        opp = newOpp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                DMPackage.EASSOCIATION_END__OPP, oldOpp, opp));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DMPackage.EASSOCIATION_END__NAME:
            return getName();
        case DMPackage.EASSOCIATION_END__MULT:
            return getMult();
        case DMPackage.EASSOCIATION_END__TARGET:
            if (resolve)
                return getTarget();
            return basicGetTarget();
        case DMPackage.EASSOCIATION_END__OPP:
            if (resolve)
                return getOpp();
            return basicGetOpp();
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
        case DMPackage.EASSOCIATION_END__NAME:
            setName((String) newValue);
            return;
        case DMPackage.EASSOCIATION_END__MULT:
            setMult((EMultiplicity) newValue);
            return;
        case DMPackage.EASSOCIATION_END__TARGET:
            setTarget((EEntity) newValue);
            return;
        case DMPackage.EASSOCIATION_END__OPP:
            setOpp((EAssociationEnd) newValue);
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
        case DMPackage.EASSOCIATION_END__NAME:
            setName(NAME_EDEFAULT);
            return;
        case DMPackage.EASSOCIATION_END__MULT:
            setMult(MULT_EDEFAULT);
            return;
        case DMPackage.EASSOCIATION_END__TARGET:
            setTarget((EEntity) null);
            return;
        case DMPackage.EASSOCIATION_END__OPP:
            setOpp((EAssociationEnd) null);
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
        case DMPackage.EASSOCIATION_END__NAME:
            return NAME_EDEFAULT == null ? name != null
                : !NAME_EDEFAULT.equals(name);
        case DMPackage.EASSOCIATION_END__MULT:
            return mult != MULT_EDEFAULT;
        case DMPackage.EASSOCIATION_END__TARGET:
            return target != null;
        case DMPackage.EASSOCIATION_END__OPP:
            return opp != null;
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
        result.append(", mult: ");
        result.append(mult);
        result.append(')');
        return result.toString();
    }

} //EAssociationEndImpl
