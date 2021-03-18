/**
 */
package ocl.exp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.NavigationCallExp#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getNavigationCallExp()
 * @model abstract="true"
 * @generated
 */
public interface NavigationCallExp extends FeatureCallExp {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link ocl.exp.OclExpression}.
	 * It is bidirectional and its opposite is '{@link ocl.exp.OclExpression#getParentNav <em>Parent Nav</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see ocl.exp.ExpPackage#getNavigationCallExp_Qualifier()
	 * @see ocl.exp.OclExpression#getParentNav
	 * @model opposite="parentNav" containment="true"
	 * @generated
	 */
	EList<OclExpression> getQualifier();

} // NavigationCallExp
