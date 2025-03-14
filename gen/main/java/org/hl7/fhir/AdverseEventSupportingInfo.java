/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event Supporting Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research participant. The unintended effects may require additional monitoring, treatment, hospitalization, or may result in death. The AdverseEvent resource also extends to potential or avoided events that could have had such effects. There are two major domains where the AdverseEvent resource is expected to be used. One is in clinical care reported adverse events and the other is in reporting adverse events in clinical  research trial management. Adverse events can be reported by healthcare providers, patients, caregivers or by medical products manufacturers. Given the differences between these two concepts, we recommend consulting the domain specific implementation guides when implementing the AdverseEvent Resource. The implementation guides include specific extensions, value sets and constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AdverseEventSupportingInfo#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEventSupportingInfo#getItemCodeableConcept <em>Item Codeable Concept</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAdverseEventSupportingInfo()
 * @model extendedMetaData="name='AdverseEvent.SupportingInfo' kind='elementOnly'"
 * @generated
 */
public interface AdverseEventSupportingInfo extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relevant past history for the subject. In a clinical care context, an example being a patient had an adverse event following a pencillin administration and the patient had a previously documented penicillin allergy. In a clinical trials context, an example is a bunion or rash that was present prior to the study. Additionally, the supporting item can be a document that is relevant to this instance of the adverse event that is not part of the subject's medical history. For example, a clinical note, staff list, or material safety data sheet (MSDS).  Supporting information is not a contributing factor, preventive action, or mitigating action. (choose any one of item*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Reference</em>' containment reference.
	 * @see #setItemReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventSupportingInfo_ItemReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getItemReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventSupportingInfo#getItemReference <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Reference</em>' containment reference.
	 * @see #getItemReference()
	 * @generated
	 */
	void setItemReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Item Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relevant past history for the subject. In a clinical care context, an example being a patient had an adverse event following a pencillin administration and the patient had a previously documented penicillin allergy. In a clinical trials context, an example is a bunion or rash that was present prior to the study. Additionally, the supporting item can be a document that is relevant to this instance of the adverse event that is not part of the subject's medical history. For example, a clinical note, staff list, or material safety data sheet (MSDS).  Supporting information is not a contributing factor, preventive action, or mitigating action. (choose any one of item*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #setItemCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventSupportingInfo_ItemCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getItemCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventSupportingInfo#getItemCodeableConcept <em>Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #getItemCodeableConcept()
	 * @generated
	 */
	void setItemCodeableConcept(CodeableConcept value);

} // AdverseEventSupportingInfo
