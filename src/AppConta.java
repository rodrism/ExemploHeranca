
public class AppConta {

	public static void main(String[] args) {
	
		Conta c = new Conta ("Rodrigo", "302.103.918-98",12345, 100);
		
		c.creditar(1000);
		c.debitar(1100);

	}

}
