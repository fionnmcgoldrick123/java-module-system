package ie.atu.sw;

import ie.atu.sw.asymmetric.CypherType;
import ie.atu.sw.crypto.CypherFactory;
import ie.atu.sw.crypto.Cypherable;

public class Runner {
	public static void main(String[] args) throws Throwable {

		CypherFactory cf = CypherFactory.getInstance();
		Cypherable cypher = cf.getCypher(CypherType.RSA);
		
		byte[] s = cypher.encrypt(new String("Attack the castle wall at dawn").getBytes("UTF-8"));
		
		System.out.println(new String(s));
		System.out.println(new String(cypher.decrypt(s)));
	}
}
