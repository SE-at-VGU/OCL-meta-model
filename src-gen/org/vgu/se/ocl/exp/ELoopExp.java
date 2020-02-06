/**
 */
package org.vgu.se.ocl.exp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ELoop Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.ELoopExp#getBody <em>Body</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.ELoopExp#getIterator <em>Iterator</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.expPackage#getELoopExp()
 * @model abstract="true"
 * @generated
 */
public interface ELoopExp extends ECallExp {
    /**
     * Returns the value of the '<em><b>Body</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EOclExpression#getLoopBodyOwner <em>Loop Body Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' containment reference.
     * @see #setBody(EOclExpression)
     * @see org.vgu.se.ocl.exp.expPackage#getELoopExp_Body()
     * @see org.vgu.se.ocl.exp.EOclExpression#getLoopBodyOwner
     * @model opposite="loopBodyOwner" containment="true" required="true"
     * @generated
     */
    EOclExpression getBody();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.ELoopExp#getBody <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' containment reference.
     * @see #getBody()
     * @generated
     */
    void setBody(EOclExpression value);

    /**
     * Returns the value of the '<em><b>Iterator</b></em>' containment reference list.
     * The list contents are of type {@link org.vgu.se.ocl.exp.EVariable}.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EVariable#getLoopExp <em>Loop Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Iterator</em>' containment reference list.
     * @see org.vgu.se.ocl.exp.expPackage#getELoopExp_Iterator()
     * @see org.vgu.se.ocl.exp.EVariable#getLoopExp
     * @model opposite="loopExp" containment="true"
     * @generated
     */
    EList<EVariable> getIterator();

} // ELoopExp
