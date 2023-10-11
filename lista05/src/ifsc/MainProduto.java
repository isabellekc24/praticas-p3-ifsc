package ifsc;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProduto {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
				
		Produto prod1 = new Produto();
		prod1.setNome("Sacola Branca");
		prod1.setCodBarras(123456789l);
		prod1.setPreco(16.98);
		prod1.setFornecedor("Avirio");
		produtos.add(prod1);
		
		Produto prod2 = new Produto();
		prod2.setNome("Sacola Azul");
		prod2.setCodBarras(132465798l);
		prod2.setPreco(15.99);
		prod2.setFornecedor("Avirio");
		produtos.add(prod2);
		
		Produto prod3 = new Produto();
		prod3.setNome("Sacola Vermelha");
		prod3.setCodBarras(987456321l);
		prod3.setPreco(17.90);
		prod3.setFornecedor("Avirio");
		produtos.add(prod3);
		
	
		//System.out.println(produtos.size());
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome());
			System.out.println(produto.getCodBarras());
			System.out.println(produto.getPreco());
			System.out.println(produto.getFornecedor());
			System.out.println("");
		}
	}
	
	

}
