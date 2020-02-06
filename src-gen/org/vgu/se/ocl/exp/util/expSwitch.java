/**
 */
package org.vgu.se.ocl.exp.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.vgu.se.ocl.exp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.exp.expPackage
 * @generated
 */
public class expSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static expPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public expSwitch() {
        if (modelPackage == null) {
            modelPackage = expPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case expPackage.EVARIABLE_EXP: {
            EVariableExp eVariableExp = (EVariableExp) theEObject;
            T result = caseEVariableExp(eVariableExp);
            if (result == null)
                result = caseEOclExpression(eVariableExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.ETYPE_EXP: {
            ETypeExp eTypeExp = (ETypeExp) theEObject;
            T result = caseETypeExp(eTypeExp);
            if (result == null)
                result = caseEOclExpression(eTypeExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.ELOOP_EXP: {
            ELoopExp eLoopExp = (ELoopExp) theEObject;
            T result = caseELoopExp(eLoopExp);
            if (result == null)
                result = caseECallExp(eLoopExp);
            if (result == null)
                result = caseEOclExpression(eLoopExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.ESTATE_EXP: {
            EStateExp eStateExp = (EStateExp) theEObject;
            T result = caseEStateExp(eStateExp);
            if (result == null)
                result = caseEOclExpression(eStateExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EFEATURE_CALL_EXP: {
            EFeatureCallExp eFeatureCallExp = (EFeatureCallExp) theEObject;
            T result = caseEFeatureCallExp(eFeatureCallExp);
            if (result == null)
                result = caseECallExp(eFeatureCallExp);
            if (result == null)
                result = caseEOclExpression(eFeatureCallExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EASSOCIATION_CLASS_CALL_EXP: {
            EAssociationClassCallExp eAssociationClassCallExp = (EAssociationClassCallExp) theEObject;
            T result = caseEAssociationClassCallExp(eAssociationClassCallExp);
            if (result == null)
                result = caseENavigationCallExp(eAssociationClassCallExp);
            if (result == null)
                result = caseEFeatureCallExp(eAssociationClassCallExp);
            if (result == null)
                result = caseECallExp(eAssociationClassCallExp);
            if (result == null)
                result = caseEOclExpression(eAssociationClassCallExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.ENUMERIC_LITERAL_EXP: {
            ENumericLiteralExp eNumericLiteralExp = (ENumericLiteralExp) theEObject;
            T result = caseENumericLiteralExp(eNumericLiteralExp);
            if (result == null)
                result = caseEPrimitiveType(eNumericLiteralExp);
            if (result == null)
                result = caseELiteralExp(eNumericLiteralExp);
            if (result == null)
                result = caseEOclExpression(eNumericLiteralExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.ELITERAL_EXP: {
            ELiteralExp eLiteralExp = (ELiteralExp) theEObject;
            T result = caseELiteralExp(eLiteralExp);
            if (result == null)
                result = caseEOclExpression(eLiteralExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EMESSAGE_EXP: {
            EMessageExp eMessageExp = (EMessageExp) theEObject;
            T result = caseEMessageExp(eMessageExp);
            if (result == null)
                result = caseEOclExpression(eMessageExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EVARIABLE: {
            EVariable eVariable = (EVariable) theEObject;
            T result = caseEVariable(eVariable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EPROPERTY_CALL_EXP: {
            EPropertyCallExp ePropertyCallExp = (EPropertyCallExp) theEObject;
            T result = caseEPropertyCallExp(ePropertyCallExp);
            if (result == null)
                result = caseENavigationCallExp(ePropertyCallExp);
            if (result == null)
                result = caseEFeatureCallExp(ePropertyCallExp);
            if (result == null)
                result = caseECallExp(ePropertyCallExp);
            if (result == null)
                result = caseEOclExpression(ePropertyCallExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EITERATOR_EXP: {
            EIteratorExp eIteratorExp = (EIteratorExp) theEObject;
            T result = caseEIteratorExp(eIteratorExp);
            if (result == null)
                result = caseELoopExp(eIteratorExp);
            if (result == null)
                result = caseECallExp(eIteratorExp);
            if (result == null)
                result = caseEOclExpression(eIteratorExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EOCL_EXPRESSION: {
            EOclExpression eOclExpression = (EOclExpression) theEObject;
            T result = caseEOclExpression(eOclExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EITERATE_EXP: {
            EIterateExp eIterateExp = (EIterateExp) theEObject;
            T result = caseEIterateExp(eIterateExp);
            if (result == null)
                result = caseELoopExp(eIterateExp);
            if (result == null)
                result = caseECallExp(eIterateExp);
            if (result == null)
                result = caseEOclExpression(eIterateExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.ECALL_EXP: {
            ECallExp eCallExp = (ECallExp) theEObject;
            T result = caseECallExp(eCallExp);
            if (result == null)
                result = caseEOclExpression(eCallExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EINTEGER_LITERAL_EXP: {
            EIntegerLiteralExp eIntegerLiteralExp = (EIntegerLiteralExp) theEObject;
            T result = caseEIntegerLiteralExp(eIntegerLiteralExp);
            if (result == null)
                result = caseENumericLiteralExp(eIntegerLiteralExp);
            if (result == null)
                result = caseEPrimitiveType(eIntegerLiteralExp);
            if (result == null)
                result = caseELiteralExp(eIntegerLiteralExp);
            if (result == null)
                result = caseEOclExpression(eIntegerLiteralExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EPRIMITIVE_TYPE: {
            EPrimitiveType ePrimitiveType = (EPrimitiveType) theEObject;
            T result = caseEPrimitiveType(ePrimitiveType);
            if (result == null)
                result = caseELiteralExp(ePrimitiveType);
            if (result == null)
                result = caseEOclExpression(ePrimitiveType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.ENAVIGATION_CALL_EXP: {
            ENavigationCallExp eNavigationCallExp = (ENavigationCallExp) theEObject;
            T result = caseENavigationCallExp(eNavigationCallExp);
            if (result == null)
                result = caseEFeatureCallExp(eNavigationCallExp);
            if (result == null)
                result = caseECallExp(eNavigationCallExp);
            if (result == null)
                result = caseEOclExpression(eNavigationCallExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EOPERATION_CALL_EXP: {
            EOperationCallExp eOperationCallExp = (EOperationCallExp) theEObject;
            T result = caseEOperationCallExp(eOperationCallExp);
            if (result == null)
                result = caseEFeatureCallExp(eOperationCallExp);
            if (result == null)
                result = caseECallExp(eOperationCallExp);
            if (result == null)
                result = caseEOclExpression(eOperationCallExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.ESTRING_LITERAL_EXP: {
            EStringLiteralExp eStringLiteralExp = (EStringLiteralExp) theEObject;
            T result = caseEStringLiteralExp(eStringLiteralExp);
            if (result == null)
                result = caseEPrimitiveType(eStringLiteralExp);
            if (result == null)
                result = caseELiteralExp(eStringLiteralExp);
            if (result == null)
                result = caseEOclExpression(eStringLiteralExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EIF_EXP: {
            EIfExp eIfExp = (EIfExp) theEObject;
            T result = caseEIfExp(eIfExp);
            if (result == null)
                result = caseEOclExpression(eIfExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case expPackage.EBOOLEAN_LITERAL_EXP: {
            EBooleanLiteralExp eBooleanLiteralExp = (EBooleanLiteralExp) theEObject;
            T result = caseEBooleanLiteralExp(eBooleanLiteralExp);
            if (result == null)
                result = caseEPrimitiveType(eBooleanLiteralExp);
            if (result == null)
                result = caseELiteralExp(eBooleanLiteralExp);
            if (result == null)
                result = caseEOclExpression(eBooleanLiteralExp);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EVariable Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EVariable Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEVariableExp(EVariableExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EType Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EType Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseETypeExp(ETypeExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ELoop Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ELoop Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseELoopExp(ELoopExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EState Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EState Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEStateExp(EStateExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EFeature Call Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EFeature Call Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEFeatureCallExp(EFeatureCallExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EAssociation Class Call Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EAssociation Class Call Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEAssociationClassCallExp(EAssociationClassCallExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ENumeric Literal Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ENumeric Literal Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseENumericLiteralExp(ENumericLiteralExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ELiteral Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ELiteral Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseELiteralExp(ELiteralExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EMessage Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EMessage Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEMessageExp(EMessageExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EVariable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EVariable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEVariable(EVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EProperty Call Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EProperty Call Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEPropertyCallExp(EPropertyCallExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EIterator Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EIterator Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEIteratorExp(EIteratorExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EOcl Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EOcl Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEOclExpression(EOclExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EIterate Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EIterate Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEIterateExp(EIterateExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ECall Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ECall Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseECallExp(ECallExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EInteger Literal Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EInteger Literal Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEIntegerLiteralExp(EIntegerLiteralExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EPrimitive Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EPrimitive Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEPrimitiveType(EPrimitiveType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ENavigation Call Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ENavigation Call Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseENavigationCallExp(ENavigationCallExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EOperation Call Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EOperation Call Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEOperationCallExp(EOperationCallExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EString Literal Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EString Literal Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEStringLiteralExp(EStringLiteralExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EIf Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EIf Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEIfExp(EIfExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EBoolean Literal Exp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EBoolean Literal Exp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEBooleanLiteralExp(EBooleanLiteralExp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //expSwitch
