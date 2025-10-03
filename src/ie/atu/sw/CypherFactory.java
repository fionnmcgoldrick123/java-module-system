package ie.atu.sw;

public class CypherFactory {
	private static CypherFactory cf = new CypherFactory();

	private CypherFactory() {
	}

	public static CypherFactory getInstance() {
		return cf;
	}

	public Cypherable getCypher(CypherType type) throws Throwable {
		return switch (type) {
		case DES -> new SymmetricCypher("DES", 56, "DES/ECB/PKCS5Padding");
		case TripleDES -> new SymmetricCypher("DESede", 168, "DESede/ECB/PKCS5Padding");
		case RSA -> new SymmetricCypher("DES", 56, "DES/ECB/PKCS5Padding");
		default -> new SymmetricCypher("AES", 128, "AES/ECB/PKCS5Padding");
		};
	}
}
