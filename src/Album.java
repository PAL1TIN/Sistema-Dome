
public class Album extends Item {
	private String artista;
	private int numFaixas;
	
	
	public Album(String titulo, double tempoDeReproducao, boolean gotIt, String comentario, String artista, int numFaixas) {
	super(titulo, tempoDeReproducao, gotIt, comentario);
	
	this.artista = artista;
	this.numFaixas = numFaixas;
	}


	public String getArtista() {
		return artista;
	}

	public int getNumFaixas() {
		return numFaixas;
	}
	public void imprime() {
		super.imprime();
		System.out.println("Artista: "+ this.artista);
		System.out.println("Numero de faixas: "+ this.numFaixas);
		
	}


	
	
}
