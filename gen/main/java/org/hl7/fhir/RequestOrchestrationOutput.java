/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Orchestration Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RequestOrchestrationOutput#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestrationOutput#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestrationOutput#getRelatedData <em>Related Data</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationOutput()
 * @model extendedMetaData="name='RequestOrchestration.Output' kind='elementOnly'"
 * @generated
 */
public interface RequestOrchestrationOutput extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable label for the data requirement used to label data flows in BPMN or similar diagrams. Also provides a human readable label when rendering the data requirement that conveys its purpose to human readers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationOutput_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestrationOutput#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the data that results as output from the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference.
	 * @see #setRequirement(DataRequirement)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationOutput_Requirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirement' namespace='##targetNamespace'"
	 * @generated
	 */
	DataRequirement getRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestrationOutput#getRequirement <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' containment reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(DataRequirement value);

	/**
	 * Returns the value of the '<em><b>Related Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to an existing input or output element that is results as output from the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Data</em>' containment reference.
	 * @see #setRelatedData(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestrationOutput_RelatedData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedData' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRelatedData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestrationOutput#getRelatedData <em>Related Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Data</em>' containment reference.
	 * @see #getRelatedData()
	 * @generated
	 */
	void setRelatedData(org.hl7.fhir.String value);

} // RequestOrchestrationOutput
