/**
 */
package org.vgu.se.ocl.exp;

import org.vgu.se.ocl.type.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EType Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.ETypeExp#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.expPackage#getETypeExp()
 * @model
 * @generated
 */
public interface ETypeExp extends EOclExpression {
    /**
     * Returns the value of the '<em><b>Referred Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred Type</em>' reference.
     * @see #setReferredType(EClassifier)
     * @see org.vgu.se.ocl.exp.expPackage#getETypeExp_ReferredType()
     * @model required="true"
     * @generated
     */
    EClassifier getReferredType();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.ETypeExp#getReferredType <em>Referred Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred Type</em>' reference.
     * @see #getReferredType()
     * @generated
     */
    void setReferredType(EClassifier value);

} // ETypeExp
