/**
 */
package org.vgu.se.ocl.exp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIf Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EIfExp#getThenExpression <em>Then Expression</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EIfExp#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EIfExp#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.expPackage#getEIfExp()
 * @model
 * @generated
 */
public interface EIfExp extends EOclExpression {
    /**
     * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EOclExpression#getThenOwner <em>Then Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Then Expression</em>' containment reference.
     * @see #setThenExpression(EOclExpression)
     * @see org.vgu.se.ocl.exp.expPackage#getEIfExp_ThenExpression()
     * @see org.vgu.se.ocl.exp.EOclExpression#getThenOwner
     * @model opposite="thenOwner" containment="true" required="true"
     * @generated
     */
    EOclExpression getThenExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EIfExp#getThenExpression <em>Then Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Then Expression</em>' containment reference.
     * @see #getThenExpression()
     * @generated
     */
    void setThenExpression(EOclExpression value);

    /**
     * Returns the value of the '<em><b>Condition</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EOclExpression#getIfOwner <em>If Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(EOclExpression)
     * @see org.vgu.se.ocl.exp.expPackage#getEIfExp_Condition()
     * @see org.vgu.se.ocl.exp.EOclExpression#getIfOwner
     * @model opposite="ifOwner" containment="true" required="true"
     * @generated
     */
    EOclExpression getCondition();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EIfExp#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
    void setCondition(EOclExpression value);

    /**
     * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EOclExpression#getElseOwner <em>Else Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Else Expression</em>' containment reference.
     * @see #setElseExpression(EOclExpression)
     * @see org.vgu.se.ocl.exp.expPackage#getEIfExp_ElseExpression()
     * @see org.vgu.se.ocl.exp.EOclExpression#getElseOwner
     * @model opposite="elseOwner" containment="true" required="true"
     * @generated
     */
    EOclExpression getElseExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EIfExp#getElseExpression <em>Else Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Else Expression</em>' containment reference.
     * @see #getElseExpression()
     * @generated
     */
    void setElseExpression(EOclExpression value);

} // EIfExp
