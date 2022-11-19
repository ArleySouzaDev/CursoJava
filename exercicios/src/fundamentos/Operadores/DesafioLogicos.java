package fundamentos.Operadores;

public class DesafioLogicos {
	public static void main(String[] args) {

		
		//Trabalho na terça (V ou F)
		
		//Trabalho na quinta feira (V ou F)
		
		boolean trabalho1 =true;
		boolean trabalho2 =true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho2 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador Unário!
		
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTv50);
		System.out.println("Comprou TV 32\"? " + comprouTv32);
		System.out.println("Comprou sorvete? " + comprouSorvete);

		System.out.println("Mais saudável? " + maisSaudavel);
	}
}
