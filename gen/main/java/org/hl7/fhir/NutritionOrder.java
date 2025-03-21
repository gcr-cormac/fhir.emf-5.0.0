/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getFoodPreferenceModifier <em>Food Preference Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getExcludeFoodModifier <em>Exclude Food Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getOutsideFoodAllowed <em>Outside Food Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getOralDiet <em>Oral Diet</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getEnteralFormula <em>Enteral Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionOrder#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionOrder()
 * @model extendedMetaData="name='NutritionOrder' kind='elementOnly'"
 * @generated
 */
public interface NutritionOrder extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this order by the order sender or by the order receiver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_InstantiatesCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getInstantiatesCanonical();

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_InstantiatesUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesUri' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getInstantiatesUri();

	/**
	 * Returns the value of the '<em><b>Instantiates</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to a protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Instantiates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiates' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getInstantiates();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A plan or request that is fulfilled in whole or in part by this nutrition order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Group Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A shared identifier common to all nutrition orders that were authorized more or less simultaneously by a single author, representing the composite or group identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Identifier</em>' containment reference.
	 * @see #setGroupIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_GroupIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getGroupIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getGroupIdentifier <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Identifier</em>' containment reference.
	 * @see #getGroupIdentifier()
	 * @generated
	 */
	void setGroupIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The workflow status of the nutrition order/request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(RequestStatus)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RequestStatus value);

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the level of authority/intentionality associated with the NutrionOrder and where the request fits into the workflow chain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(RequestIntent)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Intent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intent' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestIntent getIntent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(RequestIntent value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how quickly the Nutrition Order should be addressed with respect to other        requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(RequestPriority)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestPriority getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(RequestPriority value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person or set of individuals who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An encounter that provides additional information about the healthcare context in which this request is made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information to support fulfilling (i.e. dispensing or administering) of the nutrition,        for example, patient height and weight).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_SupportingInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingInformation();

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time that this nutrition order was requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_DateTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Orderer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orderer</em>' containment reference.
	 * @see #setOrderer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Orderer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrderer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getOrderer <em>Orderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderer</em>' containment reference.
	 * @see #getOrderer()
	 * @generated
	 */
	void setOrderer(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified desired performer of the nutrition order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getPerformer();

	/**
	 * Returns the value of the '<em><b>Allergy Intolerance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a record of allergies or intolerances  which should be included in the nutrition order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allergy Intolerance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_AllergyIntolerance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allergyIntolerance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAllergyIntolerance();

	/**
	 * Returns the value of the '<em><b>Food Preference Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Food Preference Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_FoodPreferenceModifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='foodPreferenceModifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getFoodPreferenceModifier();

	/**
	 * Returns the value of the '<em><b>Exclude Food Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This modifier is used to convey Order-specific modifier about the type of oral food or oral fluids that should not be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Food Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_ExcludeFoodModifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludeFoodModifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getExcludeFoodModifier();

	/**
	 * Returns the value of the '<em><b>Outside Food Allowed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This modifier is used to convey whether a food item is allowed to be brought in by the patient and/or family.  If set to true, indicates that the receiving system does not need to supply the food item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outside Food Allowed</em>' containment reference.
	 * @see #setOutsideFoodAllowed(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_OutsideFoodAllowed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outsideFoodAllowed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getOutsideFoodAllowed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getOutsideFoodAllowed <em>Outside Food Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside Food Allowed</em>' containment reference.
	 * @see #getOutsideFoodAllowed()
	 * @generated
	 */
	void setOutsideFoodAllowed(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Oral Diet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diet given orally in contrast to enteral (tube) feeding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oral Diet</em>' containment reference.
	 * @see #setOralDiet(NutritionOrderOralDiet)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_OralDiet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='oralDiet' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionOrderOralDiet getOralDiet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getOralDiet <em>Oral Diet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oral Diet</em>' containment reference.
	 * @see #getOralDiet()
	 * @generated
	 */
	void setOralDiet(NutritionOrderOralDiet value);

	/**
	 * Returns the value of the '<em><b>Supplement</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.NutritionOrderSupplement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Oral nutritional products given in order to add further nutritional value to the patient's diet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplement</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Supplement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionOrderSupplement> getSupplement();

	/**
	 * Returns the value of the '<em><b>Enteral Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enteral Formula</em>' containment reference.
	 * @see #setEnteralFormula(NutritionOrderEnteralFormula)
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_EnteralFormula()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enteralFormula' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionOrderEnteralFormula getEnteralFormula();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionOrder#getEnteralFormula <em>Enteral Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enteral Formula</em>' containment reference.
	 * @see #getEnteralFormula()
	 * @generated
	 */
	void setEnteralFormula(NutritionOrderEnteralFormula value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments made about the {{title}} by the requester, performer, subject or other participants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionOrder_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // NutritionOrder
