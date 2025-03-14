# An implementation of the HL7 FHIR v5.0.0 standard

This code is generted from the *.xsd files published as part of the standard.
These files are kept in the model directory.
One of the files: fhir-base.xsd has been manually modified prior to generation.
A number of the values contained in <xs:simpleType name="JurisdictionValueSetEnum"> have been commented out and thereby removed from generation.  The reason is that having so many produced a class whose value() method exceeded the compiler's limit.  

The enum appears to have been taken from the ISO 3166-1 standard, which specifies three possible codes for each jurisdiction.  Only the two character codes remain.  