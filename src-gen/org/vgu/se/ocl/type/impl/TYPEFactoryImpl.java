/**
 */
package org.vgu.se.ocl.type.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.vgu.se.ocl.type.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TYPEFactoryImpl extends EFactoryImpl implements TYPEFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TYPEFactory init() {
        try {
            TYPEFactory theTYPEFactory = (TYPEFactory) EPackage.Registry.INSTANCE
                .getEFactory(TYPEPackage.eNS_URI);
            if (theTYPEFactory != null) {
                return theTYPEFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TYPEFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case TYPEPackage.EINVALID_TYPE:
            return createEInvalidType();
        case TYPEPackage.EVOID_TYPE:
            return createEVoidType();
        case TYPEPackage.EANY_TYPE:
            return createEAnyType();
        case TYPEPackage.EMESSAGE_TYPE:
            return createEMessageType();
        case TYPEPackage.ECOLLECTION_TYPE:
            return createECollectionType();
        case TYPEPackage.EPRIMITIVE_TYPE:
            return createEPrimitiveType();
        case TYPEPackage.ETUPLE_TYPE:
            return createETupleType();
        case TYPEPackage.EORDERED_SET_TYPE:
            return createEOrderedSetType();
        case TYPEPackage.ESEQUENCE_TYPE:
            return createESequenceType();
        case TYPEPackage.EBAG_TYPE:
            return createEBagType();
        case TYPEPackage.ESET_TYPE:
            return createESetType();
        case TYPEPackage.ESIGNAL:
            return createESignal();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName()
                + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EInvalidType createEInvalidType() {
        EInvalidTypeImpl eInvalidType = new EInvalidTypeImpl();
        return eInvalidType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EVoidType createEVoidType() {
        EVoidTypeImpl eVoidType = new EVoidTypeImpl();
        return eVoidType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAnyType createEAnyType() {
        EAnyTypeImpl eAnyType = new EAnyTypeImpl();
        return eAnyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EMessageType createEMessageType() {
        EMessageTypeImpl eMessageType = new EMessageTypeImpl();
        return eMessageType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ECollectionType createECollectionType() {
        ECollectionTypeImpl eCollectionType = new ECollectionTypeImpl();
        return eCollectionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EPrimitiveType createEPrimitiveType() {
        EPrimitiveTypeImpl ePrimitiveType = new EPrimitiveTypeImpl();
        return ePrimitiveType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ETupleType createETupleType() {
        ETupleTypeImpl eTupleType = new ETupleTypeImpl();
        return eTupleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOrderedSetType createEOrderedSetType() {
        EOrderedSetTypeImpl eOrderedSetType = new EOrderedSetTypeImpl();
        return eOrderedSetType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ESequenceType createESequenceType() {
        ESequenceTypeImpl eSequenceType = new ESequenceTypeImpl();
        return eSequenceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EBagType createEBagType() {
        EBagTypeImpl eBagType = new EBagTypeImpl();
        return eBagType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ESetType createESetType() {
        ESetTypeImpl eSetType = new ESetTypeImpl();
        return eSetType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ESignal createESignal() {
        ESignalImpl eSignal = new ESignalImpl();
        return eSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TYPEPackage getTYPEPackage() {
        return (TYPEPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TYPEPackage getPackage() {
        return TYPEPackage.eINSTANCE;
    }

} //TYPEFactoryImpl
