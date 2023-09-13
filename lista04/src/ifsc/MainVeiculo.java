package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		
		ArrayList<Veiculo> veiculos = new ArrayList<>(); //minha lista de veiculos
		
		Veiculo carro1 = new Veiculo();
		carro1.setNome("Corola");
		carro1.setAno(2010); //num sem aspas, pq e um inteiro
		carro1.setCor("Branco");
		carro1.setNumRodas(4); //num sem aspas, pq e um inteiro
		carro1.setFabricante("Toyota");
		veiculos.add(carro1); 
		
		Veiculo carro2 = new Veiculo();
		carro2.setNome("HB20");
		carro2.setAno(2010); 
		carro2.setCor("Preto");
		carro2.setNumRodas(4);
		carro2.setFabricante("Hiunday");
		veiculos.add(carro2);
		
		Veiculo carro3 = new Veiculo();
		carro3.setNome("Prisma");
		carro3.setAno(2010);
		carro3.setCor("Cinza");
		carro3.setNumRodas(4);
		carro3.setFabricante("Chevrolet");
		veiculos.add(carro3);

		
		for(Veiculo veiculo : veiculos) { //p todo veiculo a vez faça... 
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getNumRodas());
			System.out.println(veiculo.getFabricante());
			System.out.println("");
			
			
		}
	}
	
	

}
