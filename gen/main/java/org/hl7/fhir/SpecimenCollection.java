/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sample to be used for analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getCollector <em>Collector</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getCollectedDateTime <em>Collected Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getCollectedPeriod <em>Collected Period</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getFastingStatusCodeableConcept <em>Fasting Status Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenCollection#getFastingStatusDuration <em>Fasting Status Duration</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection()
 * @model extendedMetaData="name='Specimen.Collection' kind='elementOnly'"
 * @generated
 */
public interface SpecimenCollection extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Collector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person who collected the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collector</em>' containment reference.
	 * @see #setCollector(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_Collector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collector' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCollector();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getCollector <em>Collector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collector</em>' containment reference.
	 * @see #getCollector()
	 * @generated
	 */
	void setCollector(Reference value);

	/**
	 * Returns the value of the '<em><b>Collected Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time when specimen was collected from subject - the physiologically relevant time. (choose any one of collected*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collected Date Time</em>' containment reference.
	 * @see #setCollectedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_CollectedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collectedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCollectedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getCollectedDateTime <em>Collected Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collected Date Time</em>' containment reference.
	 * @see #getCollectedDateTime()
	 * @generated
	 */
	void setCollectedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Collected Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time when specimen was collected from subject - the physiologically relevant time. (choose any one of collected*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collected Period</em>' containment reference.
	 * @see #setCollectedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_CollectedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collectedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getCollectedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getCollectedPeriod <em>Collected Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collected Period</em>' containment reference.
	 * @see #getCollectedPeriod()
	 * @generated
	 */
	void setCollectedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The span of time over which the collection of a specimen occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded value specifying the technique that is used to perform the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded value specifying the technique that is used to perform the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The procedure event during which the specimen was collected (e.g. the surgery leading to the collection of a pathology sample).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(Reference value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Fasting Status Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstinence or reduction from some or all food, drink, or both, for a period of time prior to sample collection. (choose any one of fastingStatus*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fasting Status Codeable Concept</em>' containment reference.
	 * @see #setFastingStatusCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_FastingStatusCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fastingStatusCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFastingStatusCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getFastingStatusCodeableConcept <em>Fasting Status Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fasting Status Codeable Concept</em>' containment reference.
	 * @see #getFastingStatusCodeableConcept()
	 * @generated
	 */
	void setFastingStatusCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Fasting Status Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstinence or reduction from some or all food, drink, or both, for a period of time prior to sample collection. (choose any one of fastingStatus*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fasting Status Duration</em>' containment reference.
	 * @see #setFastingStatusDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenCollection_FastingStatusDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fastingStatusDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getFastingStatusDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenCollection#getFastingStatusDuration <em>Fasting Status Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fasting Status Duration</em>' containment reference.
	 * @see #getFastingStatusDuration()
	 * @generated
	 */
	void setFastingStatusDuration(Duration value);

} // SpecimenCollection
