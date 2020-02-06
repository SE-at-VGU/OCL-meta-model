/**
 */
package org.vgu.se.ocl.type;

import org.vgu.se.ocl.exp.EOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMessage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.type.EMessageType#getReferredSignal <em>Referred Signal</em>}</li>
 *   <li>{@link org.vgu.se.ocl.type.EMessageType#getReferredOperation <em>Referred Operation</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.type.typePackage#getEMessageType()
 * @model
 * @generated
 */
public interface EMessageType extends EClassifier {
    /**
     * Returns the value of the '<em><b>Referred Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred Signal</em>' reference.
     * @see #setReferredSignal(ESignal)
     * @see org.vgu.se.ocl.type.typePackage#getEMessageType_ReferredSignal()
     * @model
     * @generated
     */
    ESignal getReferredSignal();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.type.EMessageType#getReferredSignal <em>Referred Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred Signal</em>' reference.
     * @see #getReferredSignal()
     * @generated
     */
    void setReferredSignal(ESignal value);

    /**
     * Returns the value of the '<em><b>Referred Operation</b></em>' attribute.
     * The literals are from the enumeration {@link org.vgu.se.ocl.exp.EOperator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred Operation</em>' attribute.
     * @see org.vgu.se.ocl.exp.EOperator
     * @see #setReferredOperation(EOperator)
     * @see org.vgu.se.ocl.type.typePackage#getEMessageType_ReferredOperation()
     * @model dataType="org.vgu.se.ocl.exp.EOperator"
     * @generated
     */
    EOperator getReferredOperation();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.type.EMessageType#getReferredOperation <em>Referred Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred Operation</em>' attribute.
     * @see org.vgu.se.ocl.exp.EOperator
     * @see #getReferredOperation()
     * @generated
     */
    void setReferredOperation(EOperator value);

} // EMessageType
