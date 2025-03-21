/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Appointment Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getAppointmentStatusEnum()
 * @model extendedMetaData="name='AppointmentStatusEnum'"
 * @generated
 */
public enum AppointmentStatusEnum implements Enumerator {
	/**
	 * The '<em><b>Proposed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposed
	 * <!-- end-model-doc -->
	 * @see #PROPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	PROPOSED(0, "proposed", "proposed"),

	/**
	 * The '<em><b>Pending</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pending
	 * <!-- end-model-doc -->
	 * @see #PENDING_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING(1, "pending", "pending"),

	/**
	 * The '<em><b>Booked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Booked
	 * <!-- end-model-doc -->
	 * @see #BOOKED_VALUE
	 * @generated
	 * @ordered
	 */
	BOOKED(2, "booked", "booked"),

	/**
	 * The '<em><b>Arrived</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arrived
	 * <!-- end-model-doc -->
	 * @see #ARRIVED_VALUE
	 * @generated
	 * @ordered
	 */
	ARRIVED(3, "arrived", "arrived"),

	/**
	 * The '<em><b>Fulfilled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fulfilled
	 * <!-- end-model-doc -->
	 * @see #FULFILLED_VALUE
	 * @generated
	 * @ordered
	 */
	FULFILLED(4, "fulfilled", "fulfilled"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(5, "cancelled", "cancelled"),

	/**
	 * The '<em><b>Noshow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Show
	 * <!-- end-model-doc -->
	 * @see #NOSHOW_VALUE
	 * @generated
	 * @ordered
	 */
	NOSHOW(6, "noshow", "noshow"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(7, "enteredInError", "entered-in-error"),

	/**
	 * The '<em><b>Checked In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checked In
	 * <!-- end-model-doc -->
	 * @see #CHECKED_IN_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKED_IN(8, "checkedIn", "checked-in"),

	/**
	 * The '<em><b>Waitlist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Waitlisted
	 * <!-- end-model-doc -->
	 * @see #WAITLIST_VALUE
	 * @generated
	 * @ordered
	 */
	WAITLIST(9, "waitlist", "waitlist");

	/**
	 * The '<em><b>Proposed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposed
	 * <!-- end-model-doc -->
	 * @see #PROPOSED
	 * @model name="proposed"
	 * @generated
	 * @ordered
	 */
	public static final int PROPOSED_VALUE = 0;

	/**
	 * The '<em><b>Pending</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pending
	 * <!-- end-model-doc -->
	 * @see #PENDING
	 * @model name="pending"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_VALUE = 1;

	/**
	 * The '<em><b>Booked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Booked
	 * <!-- end-model-doc -->
	 * @see #BOOKED
	 * @model name="booked"
	 * @generated
	 * @ordered
	 */
	public static final int BOOKED_VALUE = 2;

	/**
	 * The '<em><b>Arrived</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arrived
	 * <!-- end-model-doc -->
	 * @see #ARRIVED
	 * @model name="arrived"
	 * @generated
	 * @ordered
	 */
	public static final int ARRIVED_VALUE = 3;

	/**
	 * The '<em><b>Fulfilled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fulfilled
	 * <!-- end-model-doc -->
	 * @see #FULFILLED
	 * @model name="fulfilled"
	 * @generated
	 * @ordered
	 */
	public static final int FULFILLED_VALUE = 4;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 5;

	/**
	 * The '<em><b>Noshow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Show
	 * <!-- end-model-doc -->
	 * @see #NOSHOW
	 * @model name="noshow"
	 * @generated
	 * @ordered
	 */
	public static final int NOSHOW_VALUE = 6;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 7;

	/**
	 * The '<em><b>Checked In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checked In
	 * <!-- end-model-doc -->
	 * @see #CHECKED_IN
	 * @model name="checkedIn" literal="checked-in"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKED_IN_VALUE = 8;

	/**
	 * The '<em><b>Waitlist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Waitlisted
	 * <!-- end-model-doc -->
	 * @see #WAITLIST
	 * @model name="waitlist"
	 * @generated
	 * @ordered
	 */
	public static final int WAITLIST_VALUE = 9;

	/**
	 * An array of all the '<em><b>Appointment Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AppointmentStatusEnum[] VALUES_ARRAY =
		new AppointmentStatusEnum[] {
			PROPOSED,
			PENDING,
			BOOKED,
			ARRIVED,
			FULFILLED,
			CANCELLED,
			NOSHOW,
			ENTERED_IN_ERROR,
			CHECKED_IN,
			WAITLIST,
		};

	/**
	 * A public read-only list of all the '<em><b>Appointment Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AppointmentStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Appointment Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppointmentStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appointment Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppointmentStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appointment Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentStatusEnum get(int value) {
		switch (value) {
			case PROPOSED_VALUE: return PROPOSED;
			case PENDING_VALUE: return PENDING;
			case BOOKED_VALUE: return BOOKED;
			case ARRIVED_VALUE: return ARRIVED;
			case FULFILLED_VALUE: return FULFILLED;
			case CANCELLED_VALUE: return CANCELLED;
			case NOSHOW_VALUE: return NOSHOW;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
			case CHECKED_IN_VALUE: return CHECKED_IN;
			case WAITLIST_VALUE: return WAITLIST;
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
	private AppointmentStatusEnum(int value, String name, String literal) {
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
	
} //AppointmentStatusEnum
