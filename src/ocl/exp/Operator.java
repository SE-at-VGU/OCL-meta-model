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
	EQUAL(1, "equal", "="),

	/**
	 * The '<em><b>All Instances</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_INSTANCES_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_INSTANCES(0, "allInstances", "allInstances"),

	/**
	 * The '<em><b>Greater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(2, "greater", ">"),

	/**
	 * The '<em><b>Less</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_VALUE
	 * @generated
	 * @ordered
	 */
	LESS(3, "less", "<"),

	/**
	 * The '<em><b>Not Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUAL(4, "notEqual", "<>"),

	/**
	 * The '<em><b>Greater Or Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_OR_EQUAL(6, "greaterOrEqual", ">="),

	/**
	 * The '<em><b>Less Or Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_OR_EQUAL(7, "lessOrEqual", "<="),

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(8, "AND", "and"),

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(9, "OR", "or"),

	/**
	 * The '<em><b>Size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	SIZE(12, "size", "size");

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal" literal="="
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 1;

	/**
	 * The '<em><b>All Instances</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_INSTANCES
	 * @model name="allInstances"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_INSTANCES_VALUE = 0;

	/**
	 * The '<em><b>Greater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model name="greater" literal="&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 2;

	/**
	 * The '<em><b>Less</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS
	 * @model name="less" literal="&lt;"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_VALUE = 3;

	/**
	 * The '<em><b>Not Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL
	 * @model name="notEqual" literal="&lt;&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUAL_VALUE = 4;

	/**
	 * The '<em><b>Greater Or Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUAL
	 * @model name="greaterOrEqual" literal="&gt;="
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_OR_EQUAL_VALUE = 6;

	/**
	 * The '<em><b>Less Or Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_OR_EQUAL
	 * @model name="lessOrEqual" literal="&lt;="
	 * @generated
	 * @ordered
	 */
	public static final int LESS_OR_EQUAL_VALUE = 7;

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model literal="and"
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 8;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model literal="or"
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 9;

	/**
	 * The '<em><b>Size</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIZE
	 * @model name="size"
	 * @generated
	 * @ordered
	 */
	public static final int SIZE_VALUE = 12;

	/**
	 * An array of all the '<em><b>Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Operator[] VALUES_ARRAY =
		new Operator[] {
			EQUAL,
			ALL_INSTANCES,
			GREATER,
			LESS,
			NOT_EQUAL,
			GREATER_OR_EQUAL,
			LESS_OR_EQUAL,
			AND,
			OR,
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
			case ALL_INSTANCES_VALUE: return ALL_INSTANCES;
			case GREATER_VALUE: return GREATER;
			case LESS_VALUE: return LESS;
			case NOT_EQUAL_VALUE: return NOT_EQUAL;
			case GREATER_OR_EQUAL_VALUE: return GREATER_OR_EQUAL;
			case LESS_OR_EQUAL_VALUE: return LESS_OR_EQUAL;
			case AND_VALUE: return AND;
			case OR_VALUE: return OR;
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
