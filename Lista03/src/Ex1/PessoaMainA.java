package Ex1;

public class PessoaMainA {

	public static void main(String[] args) {

		//instanciar
		
		Pessoa isabelle = new Pessoa();
		isabelle.nome = "Isabelle";
		isabelle.cpf = 65998756423l;
		isabelle.data = "24/01/2007";
		
		Pessoa eduarda = new Pessoa();
		eduarda.nome = "Eduarda";
		eduarda.cpf = 94763652145l;
		eduarda.data = "17/03/2007";
		
		Pessoa maria = new Pessoa();
		maria.nome = "Maria";
		maria.cpf = 24653265812l;
		maria.data = "03/11/2006";
		
		System.out.println(isabelle.nome);
		System.out.println(isabelle.cpf);
		System.out.println(isabelle.data+"\n");
		
		System.out.println(eduarda.nome);
		System.out.println(eduarda.cpf);
		System.out.println(eduarda.data+"\n");
		
		System.out.println(maria.nome);
		System.out.println(maria.cpf);
		System.out.println(maria.data);
	}

}