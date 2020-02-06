/**
 */
package org.vgu.se.ocl.exp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIterator Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EIteratorExp#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.EXPPackage#getEIteratorExp()
 * @model
 * @generated
 */
public interface EIteratorExp extends ELoopExp {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.vgu.se.ocl.exp.EIteratorKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.vgu.se.ocl.exp.EIteratorKind
     * @see #setKind(EIteratorKind)
     * @see org.vgu.se.ocl.exp.EXPPackage#getEIteratorExp_Kind()
     * @model dataType="org.vgu.se.ocl.exp.EIteratorKind"
     * @generated
     */
    EIteratorKind getKind();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EIteratorExp#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.vgu.se.ocl.exp.EIteratorKind
     * @see #getKind()
     * @generated
     */
    void setKind(EIteratorKind value);

} // EIteratorExp
