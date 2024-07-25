
public class Filme extends Item {
	private String diretor;

	public Filme(String titulo, double tempoDeReproducao, boolean gotIt, String comentario, String diretor) {
		super(titulo, tempoDeReproducao, gotIt, comentario);
		this.diretor = diretor;
	}

	public String getDiretor() {
		return diretor;
	}
	public void imprime() {
		super.imprime();
		System.out.println("Diretor: "+ this.diretor);
	}
	
	
}
