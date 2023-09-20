package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		
		Gato g1 = new Gato();
		g1.setNome("Matias");
		g1.setRaca("Persa");
		g1.setComprimento(45.6f);
		g1.setNumPastas(4);
		g1.setCor("Branco");
		g1.setEcossistema("Natural");
		
		Cachorro cao1 = new Cachorro();
		cao1.setNome("toby");
		cao1.setRaca("Labrador");
		cao1.setComprimento(79.9f);
		cao1.setNumPastas(4);
		cao1.setCor("Marrom");
		cao1.setEcossistema("Natural");
		
		
		g1.mia();
		System.out.println(g1.getNome());
		System.out.println(g1.getRaca());
		System.out.println(g1.getComprimento());
		System.out.println(g1.getNumPastas());
		System.out.println(g1.getCor());
		System.out.println(g1.getEcossistema());
		
		System.out.println("");
		
		cao1.late();
		System.out.println(cao1.getNome());
		System.out.println(cao1.getRaca());
		System.out.println(cao1.getComprimento());
		System.out.println(cao1.getNumPastas());
		System.out.println(cao1.getCor());
		System.out.println(cao1.getEcossistema());

	}

}
