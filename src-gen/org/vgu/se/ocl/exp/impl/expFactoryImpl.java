/**
 */
package org.vgu.se.ocl.exp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.vgu.se.ocl.exp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class expFactoryImpl extends EFactoryImpl implements expFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static expFactory init() {
        try {
            expFactory theexpFactory = (expFactory) EPackage.Registry.INSTANCE
                .getEFactory(expPackage.eNS_URI);
            if (theexpFactory != null) {
                return theexpFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new expFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public expFactoryImpl() {
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
        case expPackage.EVARIABLE_EXP:
            return createEVariableExp();
        case expPackage.ETYPE_EXP:
            return createETypeExp();
        case expPackage.ESTATE_EXP:
            return createEStateExp();
        case expPackage.EASSOCIATION_CLASS_CALL_EXP:
            return createEAssociationClassCallExp();
        case expPackage.EMESSAGE_EXP:
            return createEMessageExp();
        case expPackage.EVARIABLE:
            return createEVariable();
        case expPackage.EPROPERTY_CALL_EXP:
            return createEPropertyCallExp();
        case expPackage.EITERATOR_EXP:
            return createEIteratorExp();
        case expPackage.EITERATE_EXP:
            return createEIterateExp();
        case expPackage.EINTEGER_LITERAL_EXP:
            return createEIntegerLiteralExp();
        case expPackage.EOPERATION_CALL_EXP:
            return createEOperationCallExp();
        case expPackage.ESTRING_LITERAL_EXP:
            return createEStringLiteralExp();
        case expPackage.EIF_EXP:
            return createEIfExp();
        case expPackage.EBOOLEAN_LITERAL_EXP:
            return createEBooleanLiteralExp();
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
        case expPackage.EITERATOR_KIND:
            return createEIteratorKindFromString(eDataType, initialValue);
        case expPackage.EOPERATOR:
            return createEOperatorFromString(eDataType, initialValue);
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
        case expPackage.EITERATOR_KIND:
            return convertEIteratorKindToString(eDataType, instanceValue);
        case expPackage.EOPERATOR:
            return convertEOperatorToString(eDataType, instanceValue);
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
    public EVariableExp createEVariableExp() {
        EVariableExpImpl eVariableExp = new EVariableExpImpl();
        return eVariableExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ETypeExp createETypeExp() {
        ETypeExpImpl eTypeExp = new ETypeExpImpl();
        return eTypeExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EStateExp createEStateExp() {
        EStateExpImpl eStateExp = new EStateExpImpl();
        return eStateExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAssociationClassCallExp createEAssociationClassCallExp() {
        EAssociationClassCallExpImpl eAssociationClassCallExp = new EAssociationClassCallExpImpl();
        return eAssociationClassCallExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EMessageExp createEMessageExp() {
        EMessageExpImpl eMessageExp = new EMessageExpImpl();
        return eMessageExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EVariable createEVariable() {
        EVariableImpl eVariable = new EVariableImpl();
        return eVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EPropertyCallExp createEPropertyCallExp() {
        EPropertyCallExpImpl ePropertyCallExp = new EPropertyCallExpImpl();
        return ePropertyCallExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EIteratorExp createEIteratorExp() {
        EIteratorExpImpl eIteratorExp = new EIteratorExpImpl();
        return eIteratorExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EIterateExp createEIterateExp() {
        EIterateExpImpl eIterateExp = new EIterateExpImpl();
        return eIterateExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EIntegerLiteralExp createEIntegerLiteralExp() {
        EIntegerLiteralExpImpl eIntegerLiteralExp = new EIntegerLiteralExpImpl();
        return eIntegerLiteralExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperationCallExp createEOperationCallExp() {
        EOperationCallExpImpl eOperationCallExp = new EOperationCallExpImpl();
        return eOperationCallExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EStringLiteralExp createEStringLiteralExp() {
        EStringLiteralExpImpl eStringLiteralExp = new EStringLiteralExpImpl();
        return eStringLiteralExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EIfExp createEIfExp() {
        EIfExpImpl eIfExp = new EIfExpImpl();
        return eIfExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EBooleanLiteralExp createEBooleanLiteralExp() {
        EBooleanLiteralExpImpl eBooleanLiteralExp = new EBooleanLiteralExpImpl();
        return eBooleanLiteralExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EIteratorKind createEIteratorKindFromString(EDataType eDataType,
        String initialValue) {
        EIteratorKind result = EIteratorKind.get(initialValue);
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
    public String convertEIteratorKindToString(EDataType eDataType,
        Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperator createEOperatorFromString(EDataType eDataType,
        String initialValue) {
        EOperator result = EOperator.get(initialValue);
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
    public String convertEOperatorToString(EDataType eDataType,
        Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public expPackage getexpPackage() {
        return (expPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static expPackage getPackage() {
        return expPackage.eINSTANCE;
    }

} //expFactoryImpl
