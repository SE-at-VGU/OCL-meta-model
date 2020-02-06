/**
 */
package org.vgu.se.ocl.exp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOperation Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EOperationCallExp#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EOperationCallExp#getReferredOperation <em>Referred Operation</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.expPackage#getEOperationCallExp()
 * @model
 * @generated
 */
public interface EOperationCallExp extends EFeatureCallExp {
    /**
     * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
     * The list contents are of type {@link org.vgu.se.ocl.exp.EOclExpression}.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EOclExpression#getParentCall <em>Parent Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Argument</em>' containment reference list.
     * @see org.vgu.se.ocl.exp.expPackage#getEOperationCallExp_Argument()
     * @see org.vgu.se.ocl.exp.EOclExpression#getParentCall
     * @model opposite="parentCall" containment="true"
     * @generated
     */
    EList<EOclExpression> getArgument();

    /**
     * Returns the value of the '<em><b>Referred Operation</b></em>' attribute.
     * The literals are from the enumeration {@link org.vgu.se.ocl.exp.EOperator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred Operation</em>' attribute.
     * @see org.vgu.se.ocl.exp.EOperator
     * @see #setReferredOperation(EOperator)
     * @see org.vgu.se.ocl.exp.expPackage#getEOperationCallExp_ReferredOperation()
     * @model dataType="org.vgu.se.ocl.exp.EOperator"
     * @generated
     */
    EOperator getReferredOperation();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EOperationCallExp#getReferredOperation <em>Referred Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred Operation</em>' attribute.
     * @see org.vgu.se.ocl.exp.EOperator
     * @see #getReferredOperation()
     * @generated
     */
    void setReferredOperation(EOperator value);

} // EOperationCallExp
