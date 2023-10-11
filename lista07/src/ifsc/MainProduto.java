package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		ArrayList<Desktop>desktops = new ArrayList<>();
		
		Desktop pc1 = new Desktop();
		pc1.setCodBarras(123456789l);
		pc1.setFabricante("Positivo");
		pc1.setGamer(false);
		
		ArrayList<String>pecas1 = new ArrayList<>();
		pecas1.add("Mouse");
		pecas1.add("Teclado");
		pecas1.add("Monitor");
		pc1.setPecas(pecas1);
		
		desktops.add(pc1);
		
		
		Desktop pc2 = new Desktop();
		pc2.setCodBarras(654782139l);
		pc2.setFabricante("HAYOM");
		pc2.setGamer(true);
		
		ArrayList<String>pecas2 = new ArrayList<>();
		pecas2.add("Mouse rapido");
		pecas2.add("Teclado com fio");
		pecas2.add("Monitor x ultra");
		pc2.setPecas(pecas2);
		
		desktops.add(pc2);
		
		
		Desktop pc3 = new Desktop();
		pc3.setCodBarras(986547123l);
		pc3.setFabricante("Acer");
		pc3.setGamer(false);
		
		ArrayList<String>pecas3 = new ArrayList<>();
		pecas3.add("Mouse preto");
		pecas3.add("Teclado brilhante");
		pecas3.add("alto falante");
		pc3.setPecas(pecas3);
		
		desktops.add(pc3);
		
		
		ArrayList<Smartphone>celulares = new ArrayList<>();
		
		Smartphone cel1 = new Smartphone();
		cel1.setCodBarras(2314568798l);
		cel1.setFabricante("Samsung");
		cel1.setDimensoesTela("16x20");
		cel1.setWoltsBateria("2300w");
		celulares.add(cel1);
		
		Smartphone cel2 = new Smartphone();
		cel2.setCodBarras(9865471232l);
		cel2.setFabricante("Xiaomi");
		cel2.setDimensoesTela("24x20");
		cel2.setWoltsBateria("10000w");
		celulares.add(cel2);
		
		Smartphone cel3 = new Smartphone();
		cel3.setCodBarras(665647859l);
		cel3.setFabricante("Apple");
		cel3.setDimensoesTela("15x10");
		cel3.setWoltsBateria("5500w");
		celulares.add(cel3);
		
		
		System.out.println("Desktops: "+"\n");
		for (Desktop desktop : desktops) {
			System.out.println(desktop.getCodBarras());
			System.out.println(desktop.getFabricante());
			
			for (String peca : desktop.getPecas()) {
				System.out.println(peca);
				
			}
			System.out.println("");
		}
		
		
		System.out.println("Smartphone: "+"\n");
		for (Smartphone smartphone : celulares) {
			System.out.println(smartphone.getCodBarras());
			System.out.println(smartphone.getFabricante());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getWoltsBateria());
			System.out.println("");
		}

	}

}
