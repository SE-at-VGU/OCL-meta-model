/**
 */
package ocl.exp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ocl.exp.ExpPackage#getOperator()
 * @model instanceClass="ocl.exp.Operator"
 * @generated
 */
public enum Operator implements Enumerator {
	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(0, "equal", "="),

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(1, "AND", "and"),

	/**
	 * The '<em><b>All Instances</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_INSTANCES_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_INSTANCES(2, "allInstances", "allInstances"),

	/**
	 * The '<em><b>Size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	SIZE(3, "size", "size");

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal" literal="="
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 0;

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model literal="and"
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 1;

	/**
	 * The '<em><b>All Instances</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_INSTANCES
	 * @model name="allInstances"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_INSTANCES_VALUE = 2;

	/**
	 * The '<em><b>Size</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIZE
	 * @model name="size"
	 * @generated
	 * @ordered
	 */
	public static final int SIZE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Operator[] VALUES_ARRAY =
		new Operator[] {
			EQUAL,
			AND,
			ALL_INSTANCES,
			SIZE,
		};

	/**
	 * A public read-only list of all the '<em><b>Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Operator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operator get(int value) {
		switch (value) {
			case EQUAL_VALUE: return EQUAL;
			case AND_VALUE: return AND;
			case ALL_INSTANCES_VALUE: return ALL_INSTANCES;
			case SIZE_VALUE: return SIZE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Operator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Operator
