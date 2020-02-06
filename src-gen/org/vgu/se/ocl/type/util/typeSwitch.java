/**
 */
package org.vgu.se.ocl.type.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.vgu.se.ocl.type.*;

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
 * @see org.vgu.se.ocl.type.typePackage
 * @generated
 */
public class typeSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static typePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public typeSwitch() {
        if (modelPackage == null) {
            modelPackage = typePackage.eINSTANCE;
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
        case typePackage.ECLASSIFIER: {
            EClassifier eClassifier = (EClassifier) theEObject;
            T result = caseEClassifier(eClassifier);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.EDATA_TYPE: {
            EDataType eDataType = (EDataType) theEObject;
            T result = caseEDataType(eDataType);
            if (result == null)
                result = caseEClassifier(eDataType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.EINVALID_TYPE: {
            EInvalidType eInvalidType = (EInvalidType) theEObject;
            T result = caseEInvalidType(eInvalidType);
            if (result == null)
                result = caseEClassifier(eInvalidType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.EVOID_TYPE: {
            EVoidType eVoidType = (EVoidType) theEObject;
            T result = caseEVoidType(eVoidType);
            if (result == null)
                result = caseEClassifier(eVoidType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.EANY_TYPE: {
            EAnyType eAnyType = (EAnyType) theEObject;
            T result = caseEAnyType(eAnyType);
            if (result == null)
                result = caseEClassifier(eAnyType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.EMESSAGE_TYPE: {
            EMessageType eMessageType = (EMessageType) theEObject;
            T result = caseEMessageType(eMessageType);
            if (result == null)
                result = caseEClassifier(eMessageType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.ECOLLECTION_TYPE: {
            ECollectionType eCollectionType = (ECollectionType) theEObject;
            T result = caseECollectionType(eCollectionType);
            if (result == null)
                result = caseEDataType(eCollectionType);
            if (result == null)
                result = caseEClassifier(eCollectionType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.EPRIMITIVE_TYPE: {
            EPrimitiveType ePrimitiveType = (EPrimitiveType) theEObject;
            T result = caseEPrimitiveType(ePrimitiveType);
            if (result == null)
                result = caseEDataType(ePrimitiveType);
            if (result == null)
                result = caseEClassifier(ePrimitiveType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.ETUPLE_TYPE: {
            ETupleType eTupleType = (ETupleType) theEObject;
            T result = caseETupleType(eTupleType);
            if (result == null)
                result = caseEDataType(eTupleType);
            if (result == null)
                result = caseEClassifier(eTupleType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.EORDERED_SET_TYPE: {
            EOrderedSetType eOrderedSetType = (EOrderedSetType) theEObject;
            T result = caseEOrderedSetType(eOrderedSetType);
            if (result == null)
                result = caseECollectionType(eOrderedSetType);
            if (result == null)
                result = caseEDataType(eOrderedSetType);
            if (result == null)
                result = caseEClassifier(eOrderedSetType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.ESEQUENCE_TYPE: {
            ESequenceType eSequenceType = (ESequenceType) theEObject;
            T result = caseESequenceType(eSequenceType);
            if (result == null)
                result = caseECollectionType(eSequenceType);
            if (result == null)
                result = caseEDataType(eSequenceType);
            if (result == null)
                result = caseEClassifier(eSequenceType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.EBAG_TYPE: {
            EBagType eBagType = (EBagType) theEObject;
            T result = caseEBagType(eBagType);
            if (result == null)
                result = caseECollectionType(eBagType);
            if (result == null)
                result = caseEDataType(eBagType);
            if (result == null)
                result = caseEClassifier(eBagType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.ESET_TYPE: {
            ESetType eSetType = (ESetType) theEObject;
            T result = caseESetType(eSetType);
            if (result == null)
                result = caseECollectionType(eSetType);
            if (result == null)
                result = caseEDataType(eSetType);
            if (result == null)
                result = caseEClassifier(eSetType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case typePackage.ESIGNAL: {
            ESignal eSignal = (ESignal) theEObject;
            T result = caseESignal(eSignal);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EClassifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EClassifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEClassifier(EClassifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EData Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EData Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEDataType(EDataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EInvalid Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EInvalid Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEInvalidType(EInvalidType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EVoid Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EVoid Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEVoidType(EVoidType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EAny Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EAny Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEAnyType(EAnyType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EMessage Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EMessage Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEMessageType(EMessageType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ECollection Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ECollection Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseECollectionType(ECollectionType object) {
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
     * Returns the result of interpreting the object as an instance of '<em>ETuple Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ETuple Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseETupleType(ETupleType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EOrdered Set Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EOrdered Set Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEOrderedSetType(EOrderedSetType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ESequence Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ESequence Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseESequenceType(ESequenceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EBag Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EBag Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEBagType(EBagType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ESet Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ESet Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseESetType(ESetType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ESignal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ESignal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseESignal(ESignal object) {
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

} //typeSwitch
