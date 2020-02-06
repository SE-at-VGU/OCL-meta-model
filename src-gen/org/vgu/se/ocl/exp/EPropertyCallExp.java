/**
 */
package org.vgu.se.ocl.exp;

import org.vgu.se.ocl.dm.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EProperty Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EPropertyCallExp#getReferredProperty <em>Referred Property</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.expPackage#getEPropertyCallExp()
 * @model
 * @generated
 */
public interface EPropertyCallExp extends ENavigationCallExp {
    /**
     * Returns the value of the '<em><b>Referred Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred Property</em>' reference.
     * @see #setReferredProperty(EAttribute)
     * @see org.vgu.se.ocl.exp.expPackage#getEPropertyCallExp_ReferredProperty()
     * @model required="true"
     * @generated
     */
    EAttribute getReferredProperty();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EPropertyCallExp#getReferredProperty <em>Referred Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred Property</em>' reference.
     * @see #getReferredProperty()
     * @generated
     */
    void setReferredProperty(EAttribute value);

} // EPropertyCallExp
