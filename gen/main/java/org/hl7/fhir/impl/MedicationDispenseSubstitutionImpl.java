/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Dispense Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseSubstitutionImpl#getWasSubstituted <em>Was Substituted</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseSubstitutionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseSubstitutionImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseSubstitutionImpl#getResponsibleParty <em>Responsible Party</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationDispenseSubstitutionImpl extends BackboneElementImpl implements MedicationDispenseSubstitution {
	/**
	 * The cached value of the '{@link #getWasSubstituted() <em>Was Substituted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWasSubstituted()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean wasSubstituted;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reason;

	/**
	 * The cached value of the '{@link #getResponsibleParty() <em>Responsible Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParty()
	 * @generated
	 * @ordered
	 */
	protected Reference responsibleParty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispenseSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationDispenseSubstitution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getWasSubstituted() {
		return wasSubstituted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasSubstituted(org.hl7.fhir.Boolean newWasSubstituted, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldWasSubstituted = wasSubstituted;
		wasSubstituted = newWasSubstituted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED, oldWasSubstituted, newWasSubstituted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWasSubstituted(org.hl7.fhir.Boolean newWasSubstituted) {
		if (newWasSubstituted != wasSubstituted) {
			NotificationChain msgs = null;
			if (wasSubstituted != null)
				msgs = ((InternalEObject)wasSubstituted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED, null, msgs);
			if (newWasSubstituted != null)
				msgs = ((InternalEObject)newWasSubstituted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED, null, msgs);
			msgs = basicSetWasSubstituted(newWasSubstituted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED, newWasSubstituted, newWasSubstituted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getResponsibleParty() {
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleParty(Reference newResponsibleParty, NotificationChain msgs) {
		Reference oldResponsibleParty = responsibleParty;
		responsibleParty = newResponsibleParty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY, oldResponsibleParty, newResponsibleParty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsibleParty(Reference newResponsibleParty) {
		if (newResponsibleParty != responsibleParty) {
			NotificationChain msgs = null;
			if (responsibleParty != null)
				msgs = ((InternalEObject)responsibleParty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY, null, msgs);
			if (newResponsibleParty != null)
				msgs = ((InternalEObject)newResponsibleParty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY, null, msgs);
			msgs = basicSetResponsibleParty(newResponsibleParty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY, newResponsibleParty, newResponsibleParty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED:
				return basicSetWasSubstituted(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				return basicSetResponsibleParty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED:
				return getWasSubstituted();
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				return getType();
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				return getReason();
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				return getResponsibleParty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED:
				setWasSubstituted((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				setResponsibleParty((Reference)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED:
				setWasSubstituted((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				getReason().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				setResponsibleParty((Reference)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__WAS_SUBSTITUTED:
				return wasSubstituted != null;
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				return type != null;
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				return responsibleParty != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationDispenseSubstitutionImpl
