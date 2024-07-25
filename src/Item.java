
public class Item {
	private String titulo;
	private double tempoDeReproducao;
	private boolean gotIt;
	private String comentario;

	public Item(String titulo, double tempoDeReproducao, boolean gotIt, String comentario) {
		this.titulo = titulo;
		this.tempoDeReproducao = tempoDeReproducao;
		this.gotIt = gotIt;
		this.comentario = comentario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getTempoDeReproducao() {
		return tempoDeReproducao;
	}

	public void setTempoDeReproducao(double tempoDeReproducao) {
		this.tempoDeReproducao = tempoDeReproducao;
	}

	public boolean isGotIt() {
		return gotIt;
	}

	public void setGotIt(boolean gotIt) {
		this.gotIt = gotIt;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public void imprime() {
		System.out.println(this.titulo + " (" + this.tempoDeReproducao + "min)");
		if (this.gotIt) {
			System.out.println("*");

		} else {
			System.out.println("");
		}
		System.out.println("    " + this.comentario);
	}
}