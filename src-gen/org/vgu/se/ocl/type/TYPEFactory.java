/**
 */
package org.vgu.se.ocl.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.type.TYPEPackage
 * @generated
 */
public interface TYPEFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TYPEFactory eINSTANCE = org.vgu.se.ocl.type.impl.TYPEFactoryImpl.init();

    /**
     * Returns a new object of class '<em>EInvalid Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EInvalid Type</em>'.
     * @generated
     */
    EInvalidType createEInvalidType();

    /**
     * Returns a new object of class '<em>EVoid Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EVoid Type</em>'.
     * @generated
     */
    EVoidType createEVoidType();

    /**
     * Returns a new object of class '<em>EAny Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EAny Type</em>'.
     * @generated
     */
    EAnyType createEAnyType();

    /**
     * Returns a new object of class '<em>EMessage Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EMessage Type</em>'.
     * @generated
     */
    EMessageType createEMessageType();

    /**
     * Returns a new object of class '<em>ECollection Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ECollection Type</em>'.
     * @generated
     */
    ECollectionType createECollectionType();

    /**
     * Returns a new object of class '<em>EPrimitive Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EPrimitive Type</em>'.
     * @generated
     */
    EPrimitiveType createEPrimitiveType();

    /**
     * Returns a new object of class '<em>ETuple Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ETuple Type</em>'.
     * @generated
     */
    ETupleType createETupleType();

    /**
     * Returns a new object of class '<em>EOrdered Set Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EOrdered Set Type</em>'.
     * @generated
     */
    EOrderedSetType createEOrderedSetType();

    /**
     * Returns a new object of class '<em>ESequence Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ESequence Type</em>'.
     * @generated
     */
    ESequenceType createESequenceType();

    /**
     * Returns a new object of class '<em>EBag Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EBag Type</em>'.
     * @generated
     */
    EBagType createEBagType();

    /**
     * Returns a new object of class '<em>ESet Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ESet Type</em>'.
     * @generated
     */
    ESetType createESetType();

    /**
     * Returns a new object of class '<em>ESignal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ESignal</em>'.
     * @generated
     */
    ESignal createESignal();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TYPEPackage getTYPEPackage();

} //TYPEFactory
