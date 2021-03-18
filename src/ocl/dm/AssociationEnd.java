/**
 */
package ocl.dm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.dm.AssociationEnd#getName <em>Name</em>}</li>
 *   <li>{@link ocl.dm.AssociationEnd#getMult <em>Mult</em>}</li>
 *   <li>{@link ocl.dm.AssociationEnd#getTarget <em>Target</em>}</li>
 *   <li>{@link ocl.dm.AssociationEnd#getOpp <em>Opp</em>}</li>
 *   <li>{@link ocl.dm.AssociationEnd#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @see ocl.dm.DmPackage#getAssociationEnd()
 * @model
 * @generated
 */
public interface AssociationEnd extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ocl.dm.DmPackage#getAssociationEnd_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ocl.dm.AssociationEnd#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mult</b></em>' attribute.
	 * The literals are from the enumeration {@link ocl.dm.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult</em>' attribute.
	 * @see ocl.dm.Multiplicity
	 * @see #setMult(Multiplicity)
	 * @see ocl.dm.DmPackage#getAssociationEnd_Mult()
	 * @model dataType="ocl.dm.Multiplicity"
	 * @generated
	 */
	Multiplicity getMult();

	/**
	 * Sets the value of the '{@link ocl.dm.AssociationEnd#getMult <em>Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult</em>' attribute.
	 * @see ocl.dm.Multiplicity
	 * @see #getMult()
	 * @generated
	 */
	void setMult(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see ocl.dm.DmPackage#getAssociationEnd_Target()
	 * @model required="true"
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link ocl.dm.AssociationEnd#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

	/**
	 * Returns the value of the '<em><b>Opp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp</em>' reference.
	 * @see #setOpp(AssociationEnd)
	 * @see ocl.dm.DmPackage#getAssociationEnd_Opp()
	 * @model required="true"
	 * @generated
	 */
	AssociationEnd getOpp();

	/**
	 * Sets the value of the '{@link ocl.dm.AssociationEnd#getOpp <em>Opp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp</em>' reference.
	 * @see #getOpp()
	 * @generated
	 */
	void setOpp(AssociationEnd value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' attribute.
	 * @see #setAssociation(String)
	 * @see ocl.dm.DmPackage#getAssociationEnd_Association()
	 * @model required="true"
	 * @generated
	 */
	String getAssociation();

	/**
	 * Sets the value of the '{@link ocl.dm.AssociationEnd#getAssociation <em>Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' attribute.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(String value);

} // AssociationEnd
