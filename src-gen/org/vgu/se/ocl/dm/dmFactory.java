/**
 */
package org.vgu.se.ocl.dm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.dm.dmPackage
 * @generated
 */
public interface dmFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    dmFactory eINSTANCE = org.vgu.se.ocl.dm.impl.dmFactoryImpl.init();

    /**
     * Returns a new object of class '<em>EEntity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EEntity</em>'.
     * @generated
     */
    EEntity createEEntity();

    /**
     * Returns a new object of class '<em>EAssociation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EAssociation</em>'.
     * @generated
     */
    EAssociation createEAssociation();

    /**
     * Returns a new object of class '<em>EData Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EData Model</em>'.
     * @generated
     */
    EDataModel createEDataModel();

    /**
     * Returns a new object of class '<em>EAttribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EAttribute</em>'.
     * @generated
     */
    EAttribute createEAttribute();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    dmPackage getdmPackage();

} //dmFactory
