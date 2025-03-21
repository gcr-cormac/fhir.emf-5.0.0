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

import org.hl7.fhir.Age;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionParticipant;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getClinicalStatus <em>Clinical Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getVerificationStatus <em>Verification Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getOnsetDateTime <em>Onset Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getOnsetAge <em>Onset Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getOnsetPeriod <em>Onset Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getOnsetRange <em>Onset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getOnsetString <em>Onset String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getAbatementDateTime <em>Abatement Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getAbatementAge <em>Abatement Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getAbatementPeriod <em>Abatement Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getAbatementRange <em>Abatement Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getAbatementString <em>Abatement String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConditionImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends DomainResourceImpl implements Condition {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getClinicalStatus() <em>Clinical Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept clinicalStatus;

	/**
	 * The cached value of the '{@link #getVerificationStatus() <em>Verification Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept verificationStatus;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept severity;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodySite;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getOnsetDateTime() <em>Onset Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime onsetDateTime;

	/**
	 * The cached value of the '{@link #getOnsetAge() <em>Onset Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetAge()
	 * @generated
	 * @ordered
	 */
	protected Age onsetAge;

	/**
	 * The cached value of the '{@link #getOnsetPeriod() <em>Onset Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period onsetPeriod;

	/**
	 * The cached value of the '{@link #getOnsetRange() <em>Onset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetRange()
	 * @generated
	 * @ordered
	 */
	protected Range onsetRange;

	/**
	 * The cached value of the '{@link #getOnsetString() <em>Onset String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String onsetString;

	/**
	 * The cached value of the '{@link #getAbatementDateTime() <em>Abatement Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbatementDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime abatementDateTime;

	/**
	 * The cached value of the '{@link #getAbatementAge() <em>Abatement Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbatementAge()
	 * @generated
	 * @ordered
	 */
	protected Age abatementAge;

	/**
	 * The cached value of the '{@link #getAbatementPeriod() <em>Abatement Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbatementPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period abatementPeriod;

	/**
	 * The cached value of the '{@link #getAbatementRange() <em>Abatement Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbatementRange()
	 * @generated
	 * @ordered
	 */
	protected Range abatementRange;

	/**
	 * The cached value of the '{@link #getAbatementString() <em>Abatement String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbatementString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String abatementString;

	/**
	 * The cached value of the '{@link #getRecordedDate() <em>Recorded Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime recordedDate;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionParticipant> participant;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionStage> stage;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> evidence;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CONDITION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getClinicalStatus() {
		return clinicalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalStatus(CodeableConcept newClinicalStatus, NotificationChain msgs) {
		CodeableConcept oldClinicalStatus = clinicalStatus;
		clinicalStatus = newClinicalStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__CLINICAL_STATUS, oldClinicalStatus, newClinicalStatus);
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
	public void setClinicalStatus(CodeableConcept newClinicalStatus) {
		if (newClinicalStatus != clinicalStatus) {
			NotificationChain msgs = null;
			if (clinicalStatus != null)
				msgs = ((InternalEObject)clinicalStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__CLINICAL_STATUS, null, msgs);
			if (newClinicalStatus != null)
				msgs = ((InternalEObject)newClinicalStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__CLINICAL_STATUS, null, msgs);
			msgs = basicSetClinicalStatus(newClinicalStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__CLINICAL_STATUS, newClinicalStatus, newClinicalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getVerificationStatus() {
		return verificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationStatus(CodeableConcept newVerificationStatus, NotificationChain msgs) {
		CodeableConcept oldVerificationStatus = verificationStatus;
		verificationStatus = newVerificationStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__VERIFICATION_STATUS, oldVerificationStatus, newVerificationStatus);
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
	public void setVerificationStatus(CodeableConcept newVerificationStatus) {
		if (newVerificationStatus != verificationStatus) {
			NotificationChain msgs = null;
			if (verificationStatus != null)
				msgs = ((InternalEObject)verificationStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__VERIFICATION_STATUS, null, msgs);
			if (newVerificationStatus != null)
				msgs = ((InternalEObject)newVerificationStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__VERIFICATION_STATUS, null, msgs);
			msgs = basicSetVerificationStatus(newVerificationStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__VERIFICATION_STATUS, newVerificationStatus, newVerificationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONDITION__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(CodeableConcept newSeverity, NotificationChain msgs) {
		CodeableConcept oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__SEVERITY, oldSeverity, newSeverity);
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
	public void setSeverity(CodeableConcept newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getBodySite() {
		if (bodySite == null) {
			bodySite = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONDITION__BODY_SITE);
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ENCOUNTER, oldEncounter, newEncounter);
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
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getOnsetDateTime() {
		return onsetDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetDateTime(DateTime newOnsetDateTime, NotificationChain msgs) {
		DateTime oldOnsetDateTime = onsetDateTime;
		onsetDateTime = newOnsetDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ONSET_DATE_TIME, oldOnsetDateTime, newOnsetDateTime);
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
	public void setOnsetDateTime(DateTime newOnsetDateTime) {
		if (newOnsetDateTime != onsetDateTime) {
			NotificationChain msgs = null;
			if (onsetDateTime != null)
				msgs = ((InternalEObject)onsetDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ONSET_DATE_TIME, null, msgs);
			if (newOnsetDateTime != null)
				msgs = ((InternalEObject)newOnsetDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ONSET_DATE_TIME, null, msgs);
			msgs = basicSetOnsetDateTime(newOnsetDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ONSET_DATE_TIME, newOnsetDateTime, newOnsetDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getOnsetAge() {
		return onsetAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetAge(Age newOnsetAge, NotificationChain msgs) {
		Age oldOnsetAge = onsetAge;
		onsetAge = newOnsetAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ONSET_AGE, oldOnsetAge, newOnsetAge);
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
	public void setOnsetAge(Age newOnsetAge) {
		if (newOnsetAge != onsetAge) {
			NotificationChain msgs = null;
			if (onsetAge != null)
				msgs = ((InternalEObject)onsetAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ONSET_AGE, null, msgs);
			if (newOnsetAge != null)
				msgs = ((InternalEObject)newOnsetAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ONSET_AGE, null, msgs);
			msgs = basicSetOnsetAge(newOnsetAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ONSET_AGE, newOnsetAge, newOnsetAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getOnsetPeriod() {
		return onsetPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetPeriod(Period newOnsetPeriod, NotificationChain msgs) {
		Period oldOnsetPeriod = onsetPeriod;
		onsetPeriod = newOnsetPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ONSET_PERIOD, oldOnsetPeriod, newOnsetPeriod);
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
	public void setOnsetPeriod(Period newOnsetPeriod) {
		if (newOnsetPeriod != onsetPeriod) {
			NotificationChain msgs = null;
			if (onsetPeriod != null)
				msgs = ((InternalEObject)onsetPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ONSET_PERIOD, null, msgs);
			if (newOnsetPeriod != null)
				msgs = ((InternalEObject)newOnsetPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ONSET_PERIOD, null, msgs);
			msgs = basicSetOnsetPeriod(newOnsetPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ONSET_PERIOD, newOnsetPeriod, newOnsetPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getOnsetRange() {
		return onsetRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetRange(Range newOnsetRange, NotificationChain msgs) {
		Range oldOnsetRange = onsetRange;
		onsetRange = newOnsetRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ONSET_RANGE, oldOnsetRange, newOnsetRange);
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
	public void setOnsetRange(Range newOnsetRange) {
		if (newOnsetRange != onsetRange) {
			NotificationChain msgs = null;
			if (onsetRange != null)
				msgs = ((InternalEObject)onsetRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ONSET_RANGE, null, msgs);
			if (newOnsetRange != null)
				msgs = ((InternalEObject)newOnsetRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ONSET_RANGE, null, msgs);
			msgs = basicSetOnsetRange(newOnsetRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ONSET_RANGE, newOnsetRange, newOnsetRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getOnsetString() {
		return onsetString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetString(org.hl7.fhir.String newOnsetString, NotificationChain msgs) {
		org.hl7.fhir.String oldOnsetString = onsetString;
		onsetString = newOnsetString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ONSET_STRING, oldOnsetString, newOnsetString);
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
	public void setOnsetString(org.hl7.fhir.String newOnsetString) {
		if (newOnsetString != onsetString) {
			NotificationChain msgs = null;
			if (onsetString != null)
				msgs = ((InternalEObject)onsetString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ONSET_STRING, null, msgs);
			if (newOnsetString != null)
				msgs = ((InternalEObject)newOnsetString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ONSET_STRING, null, msgs);
			msgs = basicSetOnsetString(newOnsetString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ONSET_STRING, newOnsetString, newOnsetString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getAbatementDateTime() {
		return abatementDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbatementDateTime(DateTime newAbatementDateTime, NotificationChain msgs) {
		DateTime oldAbatementDateTime = abatementDateTime;
		abatementDateTime = newAbatementDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ABATEMENT_DATE_TIME, oldAbatementDateTime, newAbatementDateTime);
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
	public void setAbatementDateTime(DateTime newAbatementDateTime) {
		if (newAbatementDateTime != abatementDateTime) {
			NotificationChain msgs = null;
			if (abatementDateTime != null)
				msgs = ((InternalEObject)abatementDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ABATEMENT_DATE_TIME, null, msgs);
			if (newAbatementDateTime != null)
				msgs = ((InternalEObject)newAbatementDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ABATEMENT_DATE_TIME, null, msgs);
			msgs = basicSetAbatementDateTime(newAbatementDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ABATEMENT_DATE_TIME, newAbatementDateTime, newAbatementDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getAbatementAge() {
		return abatementAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbatementAge(Age newAbatementAge, NotificationChain msgs) {
		Age oldAbatementAge = abatementAge;
		abatementAge = newAbatementAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ABATEMENT_AGE, oldAbatementAge, newAbatementAge);
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
	public void setAbatementAge(Age newAbatementAge) {
		if (newAbatementAge != abatementAge) {
			NotificationChain msgs = null;
			if (abatementAge != null)
				msgs = ((InternalEObject)abatementAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ABATEMENT_AGE, null, msgs);
			if (newAbatementAge != null)
				msgs = ((InternalEObject)newAbatementAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ABATEMENT_AGE, null, msgs);
			msgs = basicSetAbatementAge(newAbatementAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ABATEMENT_AGE, newAbatementAge, newAbatementAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getAbatementPeriod() {
		return abatementPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbatementPeriod(Period newAbatementPeriod, NotificationChain msgs) {
		Period oldAbatementPeriod = abatementPeriod;
		abatementPeriod = newAbatementPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ABATEMENT_PERIOD, oldAbatementPeriod, newAbatementPeriod);
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
	public void setAbatementPeriod(Period newAbatementPeriod) {
		if (newAbatementPeriod != abatementPeriod) {
			NotificationChain msgs = null;
			if (abatementPeriod != null)
				msgs = ((InternalEObject)abatementPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ABATEMENT_PERIOD, null, msgs);
			if (newAbatementPeriod != null)
				msgs = ((InternalEObject)newAbatementPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ABATEMENT_PERIOD, null, msgs);
			msgs = basicSetAbatementPeriod(newAbatementPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ABATEMENT_PERIOD, newAbatementPeriod, newAbatementPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getAbatementRange() {
		return abatementRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbatementRange(Range newAbatementRange, NotificationChain msgs) {
		Range oldAbatementRange = abatementRange;
		abatementRange = newAbatementRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ABATEMENT_RANGE, oldAbatementRange, newAbatementRange);
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
	public void setAbatementRange(Range newAbatementRange) {
		if (newAbatementRange != abatementRange) {
			NotificationChain msgs = null;
			if (abatementRange != null)
				msgs = ((InternalEObject)abatementRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ABATEMENT_RANGE, null, msgs);
			if (newAbatementRange != null)
				msgs = ((InternalEObject)newAbatementRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ABATEMENT_RANGE, null, msgs);
			msgs = basicSetAbatementRange(newAbatementRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ABATEMENT_RANGE, newAbatementRange, newAbatementRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAbatementString() {
		return abatementString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbatementString(org.hl7.fhir.String newAbatementString, NotificationChain msgs) {
		org.hl7.fhir.String oldAbatementString = abatementString;
		abatementString = newAbatementString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ABATEMENT_STRING, oldAbatementString, newAbatementString);
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
	public void setAbatementString(org.hl7.fhir.String newAbatementString) {
		if (newAbatementString != abatementString) {
			NotificationChain msgs = null;
			if (abatementString != null)
				msgs = ((InternalEObject)abatementString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ABATEMENT_STRING, null, msgs);
			if (newAbatementString != null)
				msgs = ((InternalEObject)newAbatementString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__ABATEMENT_STRING, null, msgs);
			msgs = basicSetAbatementString(newAbatementString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__ABATEMENT_STRING, newAbatementString, newAbatementString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getRecordedDate() {
		return recordedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordedDate(DateTime newRecordedDate, NotificationChain msgs) {
		DateTime oldRecordedDate = recordedDate;
		recordedDate = newRecordedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__RECORDED_DATE, oldRecordedDate, newRecordedDate);
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
	public void setRecordedDate(DateTime newRecordedDate) {
		if (newRecordedDate != recordedDate) {
			NotificationChain msgs = null;
			if (recordedDate != null)
				msgs = ((InternalEObject)recordedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__RECORDED_DATE, null, msgs);
			if (newRecordedDate != null)
				msgs = ((InternalEObject)newRecordedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONDITION__RECORDED_DATE, null, msgs);
			msgs = basicSetRecordedDate(newRecordedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONDITION__RECORDED_DATE, newRecordedDate, newRecordedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<ConditionParticipant>(ConditionParticipant.class, this, FhirPackage.CONDITION__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionStage> getStage() {
		if (stage == null) {
			stage = new EObjectContainmentEList<ConditionStage>(ConditionStage.class, this, FhirPackage.CONDITION__STAGE);
		}
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.CONDITION__EVIDENCE);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.CONDITION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONDITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION__CLINICAL_STATUS:
				return basicSetClinicalStatus(null, msgs);
			case FhirPackage.CONDITION__VERIFICATION_STATUS:
				return basicSetVerificationStatus(null, msgs);
			case FhirPackage.CONDITION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION__SEVERITY:
				return basicSetSeverity(null, msgs);
			case FhirPackage.CONDITION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CONDITION__BODY_SITE:
				return ((InternalEList<?>)getBodySite()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.CONDITION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.CONDITION__ONSET_DATE_TIME:
				return basicSetOnsetDateTime(null, msgs);
			case FhirPackage.CONDITION__ONSET_AGE:
				return basicSetOnsetAge(null, msgs);
			case FhirPackage.CONDITION__ONSET_PERIOD:
				return basicSetOnsetPeriod(null, msgs);
			case FhirPackage.CONDITION__ONSET_RANGE:
				return basicSetOnsetRange(null, msgs);
			case FhirPackage.CONDITION__ONSET_STRING:
				return basicSetOnsetString(null, msgs);
			case FhirPackage.CONDITION__ABATEMENT_DATE_TIME:
				return basicSetAbatementDateTime(null, msgs);
			case FhirPackage.CONDITION__ABATEMENT_AGE:
				return basicSetAbatementAge(null, msgs);
			case FhirPackage.CONDITION__ABATEMENT_PERIOD:
				return basicSetAbatementPeriod(null, msgs);
			case FhirPackage.CONDITION__ABATEMENT_RANGE:
				return basicSetAbatementRange(null, msgs);
			case FhirPackage.CONDITION__ABATEMENT_STRING:
				return basicSetAbatementString(null, msgs);
			case FhirPackage.CONDITION__RECORDED_DATE:
				return basicSetRecordedDate(null, msgs);
			case FhirPackage.CONDITION__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION__STAGE:
				return ((InternalEList<?>)getStage()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONDITION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONDITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONDITION__CLINICAL_STATUS:
				return getClinicalStatus();
			case FhirPackage.CONDITION__VERIFICATION_STATUS:
				return getVerificationStatus();
			case FhirPackage.CONDITION__CATEGORY:
				return getCategory();
			case FhirPackage.CONDITION__SEVERITY:
				return getSeverity();
			case FhirPackage.CONDITION__CODE:
				return getCode();
			case FhirPackage.CONDITION__BODY_SITE:
				return getBodySite();
			case FhirPackage.CONDITION__SUBJECT:
				return getSubject();
			case FhirPackage.CONDITION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.CONDITION__ONSET_DATE_TIME:
				return getOnsetDateTime();
			case FhirPackage.CONDITION__ONSET_AGE:
				return getOnsetAge();
			case FhirPackage.CONDITION__ONSET_PERIOD:
				return getOnsetPeriod();
			case FhirPackage.CONDITION__ONSET_RANGE:
				return getOnsetRange();
			case FhirPackage.CONDITION__ONSET_STRING:
				return getOnsetString();
			case FhirPackage.CONDITION__ABATEMENT_DATE_TIME:
				return getAbatementDateTime();
			case FhirPackage.CONDITION__ABATEMENT_AGE:
				return getAbatementAge();
			case FhirPackage.CONDITION__ABATEMENT_PERIOD:
				return getAbatementPeriod();
			case FhirPackage.CONDITION__ABATEMENT_RANGE:
				return getAbatementRange();
			case FhirPackage.CONDITION__ABATEMENT_STRING:
				return getAbatementString();
			case FhirPackage.CONDITION__RECORDED_DATE:
				return getRecordedDate();
			case FhirPackage.CONDITION__PARTICIPANT:
				return getParticipant();
			case FhirPackage.CONDITION__STAGE:
				return getStage();
			case FhirPackage.CONDITION__EVIDENCE:
				return getEvidence();
			case FhirPackage.CONDITION__NOTE:
				return getNote();
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
			case FhirPackage.CONDITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CONDITION__CLINICAL_STATUS:
				setClinicalStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.CONDITION__VERIFICATION_STATUS:
				setVerificationStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.CONDITION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONDITION__SEVERITY:
				setSeverity((CodeableConcept)newValue);
				return;
			case FhirPackage.CONDITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.CONDITION__BODY_SITE:
				getBodySite().clear();
				getBodySite().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONDITION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.CONDITION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.CONDITION__ONSET_DATE_TIME:
				setOnsetDateTime((DateTime)newValue);
				return;
			case FhirPackage.CONDITION__ONSET_AGE:
				setOnsetAge((Age)newValue);
				return;
			case FhirPackage.CONDITION__ONSET_PERIOD:
				setOnsetPeriod((Period)newValue);
				return;
			case FhirPackage.CONDITION__ONSET_RANGE:
				setOnsetRange((Range)newValue);
				return;
			case FhirPackage.CONDITION__ONSET_STRING:
				setOnsetString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONDITION__ABATEMENT_DATE_TIME:
				setAbatementDateTime((DateTime)newValue);
				return;
			case FhirPackage.CONDITION__ABATEMENT_AGE:
				setAbatementAge((Age)newValue);
				return;
			case FhirPackage.CONDITION__ABATEMENT_PERIOD:
				setAbatementPeriod((Period)newValue);
				return;
			case FhirPackage.CONDITION__ABATEMENT_RANGE:
				setAbatementRange((Range)newValue);
				return;
			case FhirPackage.CONDITION__ABATEMENT_STRING:
				setAbatementString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONDITION__RECORDED_DATE:
				setRecordedDate((DateTime)newValue);
				return;
			case FhirPackage.CONDITION__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends ConditionParticipant>)newValue);
				return;
			case FhirPackage.CONDITION__STAGE:
				getStage().clear();
				getStage().addAll((Collection<? extends ConditionStage>)newValue);
				return;
			case FhirPackage.CONDITION__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.CONDITION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FhirPackage.CONDITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CONDITION__CLINICAL_STATUS:
				setClinicalStatus((CodeableConcept)null);
				return;
			case FhirPackage.CONDITION__VERIFICATION_STATUS:
				setVerificationStatus((CodeableConcept)null);
				return;
			case FhirPackage.CONDITION__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.CONDITION__SEVERITY:
				setSeverity((CodeableConcept)null);
				return;
			case FhirPackage.CONDITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.CONDITION__BODY_SITE:
				getBodySite().clear();
				return;
			case FhirPackage.CONDITION__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.CONDITION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.CONDITION__ONSET_DATE_TIME:
				setOnsetDateTime((DateTime)null);
				return;
			case FhirPackage.CONDITION__ONSET_AGE:
				setOnsetAge((Age)null);
				return;
			case FhirPackage.CONDITION__ONSET_PERIOD:
				setOnsetPeriod((Period)null);
				return;
			case FhirPackage.CONDITION__ONSET_RANGE:
				setOnsetRange((Range)null);
				return;
			case FhirPackage.CONDITION__ONSET_STRING:
				setOnsetString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONDITION__ABATEMENT_DATE_TIME:
				setAbatementDateTime((DateTime)null);
				return;
			case FhirPackage.CONDITION__ABATEMENT_AGE:
				setAbatementAge((Age)null);
				return;
			case FhirPackage.CONDITION__ABATEMENT_PERIOD:
				setAbatementPeriod((Period)null);
				return;
			case FhirPackage.CONDITION__ABATEMENT_RANGE:
				setAbatementRange((Range)null);
				return;
			case FhirPackage.CONDITION__ABATEMENT_STRING:
				setAbatementString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONDITION__RECORDED_DATE:
				setRecordedDate((DateTime)null);
				return;
			case FhirPackage.CONDITION__PARTICIPANT:
				getParticipant().clear();
				return;
			case FhirPackage.CONDITION__STAGE:
				getStage().clear();
				return;
			case FhirPackage.CONDITION__EVIDENCE:
				getEvidence().clear();
				return;
			case FhirPackage.CONDITION__NOTE:
				getNote().clear();
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
			case FhirPackage.CONDITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CONDITION__CLINICAL_STATUS:
				return clinicalStatus != null;
			case FhirPackage.CONDITION__VERIFICATION_STATUS:
				return verificationStatus != null;
			case FhirPackage.CONDITION__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.CONDITION__SEVERITY:
				return severity != null;
			case FhirPackage.CONDITION__CODE:
				return code != null;
			case FhirPackage.CONDITION__BODY_SITE:
				return bodySite != null && !bodySite.isEmpty();
			case FhirPackage.CONDITION__SUBJECT:
				return subject != null;
			case FhirPackage.CONDITION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.CONDITION__ONSET_DATE_TIME:
				return onsetDateTime != null;
			case FhirPackage.CONDITION__ONSET_AGE:
				return onsetAge != null;
			case FhirPackage.CONDITION__ONSET_PERIOD:
				return onsetPeriod != null;
			case FhirPackage.CONDITION__ONSET_RANGE:
				return onsetRange != null;
			case FhirPackage.CONDITION__ONSET_STRING:
				return onsetString != null;
			case FhirPackage.CONDITION__ABATEMENT_DATE_TIME:
				return abatementDateTime != null;
			case FhirPackage.CONDITION__ABATEMENT_AGE:
				return abatementAge != null;
			case FhirPackage.CONDITION__ABATEMENT_PERIOD:
				return abatementPeriod != null;
			case FhirPackage.CONDITION__ABATEMENT_RANGE:
				return abatementRange != null;
			case FhirPackage.CONDITION__ABATEMENT_STRING:
				return abatementString != null;
			case FhirPackage.CONDITION__RECORDED_DATE:
				return recordedDate != null;
			case FhirPackage.CONDITION__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FhirPackage.CONDITION__STAGE:
				return stage != null && !stage.isEmpty();
			case FhirPackage.CONDITION__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case FhirPackage.CONDITION__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
