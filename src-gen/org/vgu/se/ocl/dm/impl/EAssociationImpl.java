/**
 */
package org.vgu.se.ocl.dm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.vgu.se.ocl.dm.DMPackage;
import org.vgu.se.ocl.dm.EAssociation;
import org.vgu.se.ocl.dm.EEntity;
import org.vgu.se.ocl.dm.EMultiplicity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAssociation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EAssociationImpl#getOpp <em>Opp</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EAssociationImpl#getMult <em>Mult</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EAssociationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAssociationImpl extends MinimalEObjectImpl.Container
    implements EAssociation {
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
     * The default value of the '{@link #getOpp() <em>Opp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpp()
     * @generated
     * @ordered
     */
    protected static final String OPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOpp() <em>Opp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpp()
     * @generated
     * @ordered
     */
    protected String opp = OPP_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EAssociationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DMPackage.Literals.EASSOCIATION;
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
                DMPackage.EASSOCIATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOpp() {
        return opp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOpp(String newOpp) {
        String oldOpp = opp;
        opp = newOpp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                DMPackage.EASSOCIATION__OPP, oldOpp, opp));
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
                DMPackage.EASSOCIATION__MULT, oldMult, mult));
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
                        DMPackage.EASSOCIATION__TARGET, oldTarget, target));
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
                DMPackage.EASSOCIATION__TARGET, oldTarget, target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DMPackage.EASSOCIATION__NAME:
            return getName();
        case DMPackage.EASSOCIATION__OPP:
            return getOpp();
        case DMPackage.EASSOCIATION__MULT:
            return getMult();
        case DMPackage.EASSOCIATION__TARGET:
            if (resolve)
                return getTarget();
            return basicGetTarget();
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
        case DMPackage.EASSOCIATION__NAME:
            setName((String) newValue);
            return;
        case DMPackage.EASSOCIATION__OPP:
            setOpp((String) newValue);
            return;
        case DMPackage.EASSOCIATION__MULT:
            setMult((EMultiplicity) newValue);
            return;
        case DMPackage.EASSOCIATION__TARGET:
            setTarget((EEntity) newValue);
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
        case DMPackage.EASSOCIATION__NAME:
            setName(NAME_EDEFAULT);
            return;
        case DMPackage.EASSOCIATION__OPP:
            setOpp(OPP_EDEFAULT);
            return;
        case DMPackage.EASSOCIATION__MULT:
            setMult(MULT_EDEFAULT);
            return;
        case DMPackage.EASSOCIATION__TARGET:
            setTarget((EEntity) null);
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
        case DMPackage.EASSOCIATION__NAME:
            return NAME_EDEFAULT == null ? name != null
                : !NAME_EDEFAULT.equals(name);
        case DMPackage.EASSOCIATION__OPP:
            return OPP_EDEFAULT == null ? opp != null
                : !OPP_EDEFAULT.equals(opp);
        case DMPackage.EASSOCIATION__MULT:
            return mult != MULT_EDEFAULT;
        case DMPackage.EASSOCIATION__TARGET:
            return target != null;
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
        result.append(", opp: ");
        result.append(opp);
        result.append(", mult: ");
        result.append(mult);
        result.append(')');
        return result.toString();
    }

} //EAssociationImpl
