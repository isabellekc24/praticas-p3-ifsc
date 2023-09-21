package Ex2;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal macaco = new Animal();
		
		macaco.nomeCientifico = "Primates";
		macaco.familia = "Cebídeos";
		macaco.reino = "Reino animalia";
		
		macaco.vetor = new String[5];
		macaco.vetor[0] = "babuínos";
		macaco.vetor[1] = "sagui";
		macaco.vetor[2] = "bugio";
		macaco.vetor[3] = "macaco-prego";
		macaco.vetor[4] = "colobos";
		
		System.out.println(macaco.nomeCientifico);
		System.out.println(macaco.familia);
		System.out.println(macaco.reino+"\n");
		
		System.out.println("Nomes populares: ");
		System.out.println(macaco.vetor[0]);
		System.out.println(macaco.vetor[1]);
		System.out.println(macaco.vetor[2]);
		System.out.println(macaco.vetor[3]);
		System.out.println(macaco.vetor[4]);
	}

}
