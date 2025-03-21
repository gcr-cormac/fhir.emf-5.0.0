/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AuditEventSource#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventSource#getObserver <em>Observer</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventSource#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAuditEventSource()
 * @model extendedMetaData="name='AuditEvent.Source' kind='elementOnly'"
 * @generated
 */
public interface AuditEventSource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see #setSite(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventSource_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventSource#getSite <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' containment reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(Reference value);

	/**
	 * Returns the value of the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of the source where the event was detected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observer</em>' containment reference.
	 * @see #setObserver(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventSource_Observer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='observer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getObserver();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventSource#getObserver <em>Observer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer</em>' containment reference.
	 * @see #getObserver()
	 * @generated
	 */
	void setObserver(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code specifying the type of source where event originated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEventSource_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

} // AuditEventSource
