/**
 */
package ocl.exp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.OclExpression#getLoopBodyOwner <em>Loop Body Owner</em>}</li>
 *   <li>{@link ocl.exp.OclExpression#getAppliedElement <em>Applied Element</em>}</li>
 *   <li>{@link ocl.exp.OclExpression#getInitializedElement <em>Initialized Element</em>}</li>
 *   <li>{@link ocl.exp.OclExpression#getParentCall <em>Parent Call</em>}</li>
 *   <li>{@link ocl.exp.OclExpression#getParentNav <em>Parent Nav</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getOclExpression()
 * @model abstract="true"
 * @generated
 */
public interface OclExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Loop Body Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ocl.exp.LoopExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Body Owner</em>' container reference.
	 * @see #setLoopBodyOwner(LoopExp)
	 * @see ocl.exp.ExpPackage#getOclExpression_LoopBodyOwner()
	 * @see ocl.exp.LoopExp#getBody
	 * @model opposite="body" transient="false"
	 * @generated
	 */
	LoopExp getLoopBodyOwner();

	/**
	 * Sets the value of the '{@link ocl.exp.OclExpression#getLoopBodyOwner <em>Loop Body Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Body Owner</em>' container reference.
	 * @see #getLoopBodyOwner()
	 * @generated
	 */
	void setLoopBodyOwner(LoopExp value);

	/**
	 * Returns the value of the '<em><b>Applied Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ocl.exp.CallExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Element</em>' container reference.
	 * @see #setAppliedElement(CallExp)
	 * @see ocl.exp.ExpPackage#getOclExpression_AppliedElement()
	 * @see ocl.exp.CallExp#getSource
	 * @model opposite="source" transient="false"
	 * @generated
	 */
	CallExp getAppliedElement();

	/**
	 * Sets the value of the '{@link ocl.exp.OclExpression#getAppliedElement <em>Applied Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Element</em>' container reference.
	 * @see #getAppliedElement()
	 * @generated
	 */
	void setAppliedElement(CallExp value);

	/**
	 * Returns the value of the '<em><b>Initialized Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ocl.exp.Variable#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialized Element</em>' container reference.
	 * @see #setInitializedElement(Variable)
	 * @see ocl.exp.ExpPackage#getOclExpression_InitializedElement()
	 * @see ocl.exp.Variable#getInitExpression
	 * @model opposite="initExpression" transient="false"
	 * @generated
	 */
	Variable getInitializedElement();

	/**
	 * Sets the value of the '{@link ocl.exp.OclExpression#getInitializedElement <em>Initialized Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized Element</em>' container reference.
	 * @see #getInitializedElement()
	 * @generated
	 */
	void setInitializedElement(Variable value);

	/**
	 * Returns the value of the '<em><b>Parent Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ocl.exp.OperationCallExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Call</em>' container reference.
	 * @see #setParentCall(OperationCallExp)
	 * @see ocl.exp.ExpPackage#getOclExpression_ParentCall()
	 * @see ocl.exp.OperationCallExp#getArgument
	 * @model opposite="argument" transient="false"
	 * @generated
	 */
	OperationCallExp getParentCall();

	/**
	 * Sets the value of the '{@link ocl.exp.OclExpression#getParentCall <em>Parent Call</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Call</em>' container reference.
	 * @see #getParentCall()
	 * @generated
	 */
	void setParentCall(OperationCallExp value);

	/**
	 * Returns the value of the '<em><b>Parent Nav</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ocl.exp.NavigationCallExp#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Nav</em>' container reference.
	 * @see #setParentNav(NavigationCallExp)
	 * @see ocl.exp.ExpPackage#getOclExpression_ParentNav()
	 * @see ocl.exp.NavigationCallExp#getQualifier
	 * @model opposite="qualifier" transient="false"
	 * @generated
	 */
	NavigationCallExp getParentNav();

	/**
	 * Sets the value of the '{@link ocl.exp.OclExpression#getParentNav <em>Parent Nav</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Nav</em>' container reference.
	 * @see #getParentNav()
	 * @generated
	 */
	void setParentNav(NavigationCallExp value);

} // OclExpression
