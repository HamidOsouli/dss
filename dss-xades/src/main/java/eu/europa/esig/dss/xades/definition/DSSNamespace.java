package eu.europa.esig.dss.xades.definition;

public class DSSNamespace {

	private final String uri;
	private final String prefix;

	public DSSNamespace(String uri, String prefix) {
		this.uri = uri;
		this.prefix = prefix;
	}

	public String getUri() {
		return uri;
	}

	public String getPrefix() {
		return prefix;
	}

	public boolean isSameUri(String paramUri) {
		return this.uri.equals(paramUri);
	}

}
