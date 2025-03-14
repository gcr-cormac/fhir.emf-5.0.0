/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Questionnaire Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConditionQuestionnairePurpose#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConditionQuestionnairePurpose()
 * @model extendedMetaData="name='ConditionQuestionnairePurpose' kind='elementOnly'"
 * @generated
 */
public interface ConditionQuestionnairePurpose extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.ConditionQuestionnairePurposeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.ConditionQuestionnairePurposeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ConditionQuestionnairePurposeEnum)
	 * @see org.hl7.fhir.FhirPackage#getConditionQuestionnairePurpose_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	ConditionQuestionnairePurposeEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionQuestionnairePurpose#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.ConditionQuestionnairePurposeEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ConditionQuestionnairePurposeEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.ConditionQuestionnairePurpose#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ConditionQuestionnairePurposeEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.ConditionQuestionnairePurpose#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ConditionQuestionnairePurposeEnum)
	 * @generated
	 */
	boolean isSetValue();

} // ConditionQuestionnairePurpose
