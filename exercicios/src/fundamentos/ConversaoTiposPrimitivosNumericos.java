package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.234566; //explicita (cast)
		System.out.println(b);
		
		int c = 127;
		byte d = (byte)c; //Conversão explicita
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
}
