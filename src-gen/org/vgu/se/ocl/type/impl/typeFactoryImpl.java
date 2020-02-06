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
public class typeFactoryImpl extends EFactoryImpl implements typeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static typeFactory init() {
        try {
            typeFactory thetypeFactory = (typeFactory) EPackage.Registry.INSTANCE
                .getEFactory(typePackage.eNS_URI);
            if (thetypeFactory != null) {
                return thetypeFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new typeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public typeFactoryImpl() {
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
        case typePackage.EINVALID_TYPE:
            return createEInvalidType();
        case typePackage.EVOID_TYPE:
            return createEVoidType();
        case typePackage.EANY_TYPE:
            return createEAnyType();
        case typePackage.EMESSAGE_TYPE:
            return createEMessageType();
        case typePackage.ECOLLECTION_TYPE:
            return createECollectionType();
        case typePackage.EPRIMITIVE_TYPE:
            return createEPrimitiveType();
        case typePackage.ETUPLE_TYPE:
            return createETupleType();
        case typePackage.EORDERED_SET_TYPE:
            return createEOrderedSetType();
        case typePackage.ESEQUENCE_TYPE:
            return createESequenceType();
        case typePackage.EBAG_TYPE:
            return createEBagType();
        case typePackage.ESET_TYPE:
            return createESetType();
        case typePackage.ESIGNAL:
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
    public typePackage gettypePackage() {
        return (typePackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static typePackage getPackage() {
        return typePackage.eINSTANCE;
    }

} //typeFactoryImpl
