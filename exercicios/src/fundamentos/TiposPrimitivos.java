package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações do funcionário.
		
		// Tipo numéricos inteiros
		byte anosDeEmpresa =23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_333_333_999L;
		
		// Tipos numéricos reais;
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano
		boolean estaDeFerias = false; //true
		
		//tipo caractere
		char status = 'A'; //ativo
		
		// Dias de Empresa
		System.out.println(anosDeEmpresa * 365 + " Dias trabalhando na empresa");
		
		// Número de viagens
		System.out.println("Fez o total de " + numeroDeVoos / 2 + " voos" );
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas + " De pontos acumulados");
		
		System.out.println("o ID " + id + ": ganha -> " + salario );
		System.out.println("Ele está de férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}
}
