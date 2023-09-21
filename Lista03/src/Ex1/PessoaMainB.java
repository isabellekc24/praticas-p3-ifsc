package Ex1;

import java.util.Scanner;

public class PessoaMainB {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		Pessoa[] vetor = new Pessoa[3];
				
		for (int i = 0; i < vetor.length; i++) { 
			vetor[i] = new Pessoa(); //
			
			System.out.println(i+"- nome: ");
			vetor[i].nome = leitura.nextLine(); 
			
			System.out.println(i+"- cpf: ");
			vetor[i].cpf = Long.valueOf(leitura.nextLine());
			
			System.out.println(i+"- data de nascimento: ");
			vetor[i].data = leitura.nextLine();
			
			System.out.println("");
		}

		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i].nome);
			System.out.println(vetor[i].cpf);
			System.out.println(vetor[i].data+"\n");
		}
	}

}
