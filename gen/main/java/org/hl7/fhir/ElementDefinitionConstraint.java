/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Captures constraints on each element within the resource, profile, or extension.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getKey <em>Key</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getSuppress <em>Suppress</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getHuman <em>Human</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint()
 * @model extendedMetaData="name='ElementDefinition.Constraint' kind='elementOnly'"
 * @generated
 */
public interface ElementDefinitionConstraint extends BackboneType {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Key()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getKey();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Id value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of why this constraint is necessary or appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getRequirements();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(Markdown value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the impact constraint violation has on the conformance of the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(ConstraintSeverity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Severity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(ConstraintSeverity value);

	/**
	 * Returns the value of the '<em><b>Suppress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the warning or best practice guideline should be suppressed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suppress</em>' containment reference.
	 * @see #setSuppress(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Suppress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='suppress' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getSuppress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getSuppress <em>Suppress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress</em>' containment reference.
	 * @see #getSuppress()
	 * @generated
	 */
	void setSuppress(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Human</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text that can be used to describe the constraint in messages identifying that the constraint has been violated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Human</em>' containment reference.
	 * @see #setHuman(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Human()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='human' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getHuman();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getHuman <em>Human</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human</em>' containment reference.
	 * @see #getHuman()
	 * @generated
	 */
	void setHuman(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A [FHIRPath](fhirpath.html) expression of constraint that can be executed to see if this constraint is met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Expression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the original source of the constraint, for traceability purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Canonical value);

} // ElementDefinitionConstraint
