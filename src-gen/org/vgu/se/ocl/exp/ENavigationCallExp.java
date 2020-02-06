/**
 */
package org.vgu.se.ocl.exp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENavigation Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.ENavigationCallExp#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.EXPPackage#getENavigationCallExp()
 * @model abstract="true"
 * @generated
 */
public interface ENavigationCallExp extends EFeatureCallExp {
    /**
     * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
     * The list contents are of type {@link org.vgu.se.ocl.exp.EOclExpression}.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EOclExpression#getParentNav <em>Parent Nav</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qualifier</em>' containment reference list.
     * @see org.vgu.se.ocl.exp.EXPPackage#getENavigationCallExp_Qualifier()
     * @see org.vgu.se.ocl.exp.EOclExpression#getParentNav
     * @model opposite="parentNav" containment="true"
     * @generated
     */
    EList<EOclExpression> getQualifier();

} // ENavigationCallExp
