/**
 */
package org.vgu.se.ocl.dm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.vgu.se.ocl.dm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class dmFactoryImpl extends EFactoryImpl implements dmFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static dmFactory init() {
        try {
            dmFactory thedmFactory = (dmFactory) EPackage.Registry.INSTANCE
                .getEFactory(dmPackage.eNS_URI);
            if (thedmFactory != null) {
                return thedmFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new dmFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public dmFactoryImpl() {
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
        case dmPackage.EENTITY:
            return createEEntity();
        case dmPackage.EASSOCIATION:
            return createEAssociation();
        case dmPackage.EDATA_MODEL:
            return createEDataModel();
        case dmPackage.EATTRIBUTE:
            return createEAttribute();
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
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case dmPackage.EMULTIPLICITY:
            return createEMultiplicityFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '"
                + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case dmPackage.EMULTIPLICITY:
            return convertEMultiplicityToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '"
                + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEntity createEEntity() {
        EEntityImpl eEntity = new EEntityImpl();
        return eEntity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAssociation createEAssociation() {
        EAssociationImpl eAssociation = new EAssociationImpl();
        return eAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataModel createEDataModel() {
        EDataModelImpl eDataModel = new EDataModelImpl();
        return eDataModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute createEAttribute() {
        EAttributeImpl eAttribute = new EAttributeImpl();
        return eAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMultiplicity createEMultiplicityFromString(EDataType eDataType,
        String initialValue) {
        EMultiplicity result = EMultiplicity.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                + "' is not a valid enumerator of '" + eDataType.getName()
                + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEMultiplicityToString(EDataType eDataType,
        Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public dmPackage getdmPackage() {
        return (dmPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static dmPackage getPackage() {
        return dmPackage.eINSTANCE;
    }

} //dmFactoryImpl
