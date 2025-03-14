/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Request Patient Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ServiceRequestPatientInstruction#getInstructionMarkdown <em>Instruction Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.ServiceRequestPatientInstruction#getInstructionReference <em>Instruction Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getServiceRequestPatientInstruction()
 * @model extendedMetaData="name='ServiceRequest.PatientInstruction' kind='elementOnly'"
 * @generated
 */
public interface ServiceRequestPatientInstruction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Instruction Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instructions in terms that are understood by the patient or consumer. (choose any one of instruction*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instruction Markdown</em>' containment reference.
	 * @see #setInstructionMarkdown(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getServiceRequestPatientInstruction_InstructionMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instructionMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getInstructionMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ServiceRequestPatientInstruction#getInstructionMarkdown <em>Instruction Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Markdown</em>' containment reference.
	 * @see #getInstructionMarkdown()
	 * @generated
	 */
	void setInstructionMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Instruction Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instructions in terms that are understood by the patient or consumer. (choose any one of instruction*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instruction Reference</em>' containment reference.
	 * @see #setInstructionReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getServiceRequestPatientInstruction_InstructionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instructionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInstructionReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ServiceRequestPatientInstruction#getInstructionReference <em>Instruction Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Reference</em>' containment reference.
	 * @see #getInstructionReference()
	 * @generated
	 */
	void setInstructionReference(Reference value);

} // ServiceRequestPatientInstruction
