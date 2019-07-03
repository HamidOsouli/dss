package eu.europa.esig.dss;

import eu.europa.esig.dss.identifier.EncapsulatedRevocationTokenIdentifier;

public class CRLBinary extends EncapsulatedRevocationTokenIdentifier {

	private static final long serialVersionUID = 3365111934665055383L;
	
	public CRLBinary(byte[] binaries) {
		super(binaries);
	}

}
