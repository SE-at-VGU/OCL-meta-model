/**
 */
package org.vgu.se.ocl.exp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOcl Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EOclExpression#getLoopBodyOwner <em>Loop Body Owner</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EOclExpression#getAppliedElement <em>Applied Element</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EOclExpression#getInitializedElement <em>Initialized Element</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EOclExpression#getThenOwner <em>Then Owner</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EOclExpression#getIfOwner <em>If Owner</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EOclExpression#getElseOwner <em>Else Owner</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EOclExpression#getParentCall <em>Parent Call</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EOclExpression#getParentNav <em>Parent Nav</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.expPackage#getEOclExpression()
 * @model abstract="true"
 * @generated
 */
public interface EOclExpression extends EObject {
    /**
     * Returns the value of the '<em><b>Loop Body Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.ELoopExp#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop Body Owner</em>' container reference.
     * @see #setLoopBodyOwner(ELoopExp)
     * @see org.vgu.se.ocl.exp.expPackage#getEOclExpression_LoopBodyOwner()
     * @see org.vgu.se.ocl.exp.ELoopExp#getBody
     * @model opposite="body" transient="false"
     * @generated
     */
    ELoopExp getLoopBodyOwner();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EOclExpression#getLoopBodyOwner <em>Loop Body Owner</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop Body Owner</em>' container reference.
     * @see #getLoopBodyOwner()
     * @generated
     */
    void setLoopBodyOwner(ELoopExp value);

    /**
     * Returns the value of the '<em><b>Applied Element</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.ECallExp#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applied Element</em>' container reference.
     * @see #setAppliedElement(ECallExp)
     * @see org.vgu.se.ocl.exp.expPackage#getEOclExpression_AppliedElement()
     * @see org.vgu.se.ocl.exp.ECallExp#getSource
     * @model opposite="source" transient="false"
     * @generated
     */
    ECallExp getAppliedElement();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EOclExpression#getAppliedElement <em>Applied Element</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Applied Element</em>' container reference.
     * @see #getAppliedElement()
     * @generated
     */
    void setAppliedElement(ECallExp value);

    /**
     * Returns the value of the '<em><b>Initialized Element</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EVariable#getInitExpression <em>Init Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initialized Element</em>' container reference.
     * @see #setInitializedElement(EVariable)
     * @see org.vgu.se.ocl.exp.expPackage#getEOclExpression_InitializedElement()
     * @see org.vgu.se.ocl.exp.EVariable#getInitExpression
     * @model opposite="initExpression" transient="false"
     * @generated
     */
    EVariable getInitializedElement();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EOclExpression#getInitializedElement <em>Initialized Element</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initialized Element</em>' container reference.
     * @see #getInitializedElement()
     * @generated
     */
    void setInitializedElement(EVariable value);

    /**
     * Returns the value of the '<em><b>Then Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EIfExp#getThenExpression <em>Then Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Then Owner</em>' container reference.
     * @see #setThenOwner(EIfExp)
     * @see org.vgu.se.ocl.exp.expPackage#getEOclExpression_ThenOwner()
     * @see org.vgu.se.ocl.exp.EIfExp#getThenExpression
     * @model opposite="thenExpression" transient="false"
     * @generated
     */
    EIfExp getThenOwner();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EOclExpression#getThenOwner <em>Then Owner</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Then Owner</em>' container reference.
     * @see #getThenOwner()
     * @generated
     */
    void setThenOwner(EIfExp value);

    /**
     * Returns the value of the '<em><b>If Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EIfExp#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>If Owner</em>' container reference.
     * @see #setIfOwner(EIfExp)
     * @see org.vgu.se.ocl.exp.expPackage#getEOclExpression_IfOwner()
     * @see org.vgu.se.ocl.exp.EIfExp#getCondition
     * @model opposite="condition" transient="false"
     * @generated
     */
    EIfExp getIfOwner();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EOclExpression#getIfOwner <em>If Owner</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>If Owner</em>' container reference.
     * @see #getIfOwner()
     * @generated
     */
    void setIfOwner(EIfExp value);

    /**
     * Returns the value of the '<em><b>Else Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EIfExp#getElseExpression <em>Else Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Else Owner</em>' container reference.
     * @see #setElseOwner(EIfExp)
     * @see org.vgu.se.ocl.exp.expPackage#getEOclExpression_ElseOwner()
     * @see org.vgu.se.ocl.exp.EIfExp#getElseExpression
     * @model opposite="elseExpression" transient="false"
     * @generated
     */
    EIfExp getElseOwner();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EOclExpression#getElseOwner <em>Else Owner</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Else Owner</em>' container reference.
     * @see #getElseOwner()
     * @generated
     */
    void setElseOwner(EIfExp value);

    /**
     * Returns the value of the '<em><b>Parent Call</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EOperationCallExp#getArgument <em>Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Call</em>' container reference.
     * @see #setParentCall(EOperationCallExp)
     * @see org.vgu.se.ocl.exp.expPackage#getEOclExpression_ParentCall()
     * @see org.vgu.se.ocl.exp.EOperationCallExp#getArgument
     * @model opposite="argument" transient="false"
     * @generated
     */
    EOperationCallExp getParentCall();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EOclExpression#getParentCall <em>Parent Call</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Call</em>' container reference.
     * @see #getParentCall()
     * @generated
     */
    void setParentCall(EOperationCallExp value);

    /**
     * Returns the value of the '<em><b>Parent Nav</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.ENavigationCallExp#getQualifier <em>Qualifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Nav</em>' container reference.
     * @see #setParentNav(ENavigationCallExp)
     * @see org.vgu.se.ocl.exp.expPackage#getEOclExpression_ParentNav()
     * @see org.vgu.se.ocl.exp.ENavigationCallExp#getQualifier
     * @model opposite="qualifier" transient="false"
     * @generated
     */
    ENavigationCallExp getParentNav();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EOclExpression#getParentNav <em>Parent Nav</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Nav</em>' container reference.
     * @see #getParentNav()
     * @generated
     */
    void setParentNav(ENavigationCallExp value);

} // EOclExpression
