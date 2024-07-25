
public class TesteMain {
	public static void main(String args[]) {
		
		BancoDeDados meuBD = new BancoDeDados();
		Album a1 = new Album ("Album 1", 100 , false, "Album bacana","Joao da Silva", 32);
		Filme f1 = new Filme ("tropa", 214, true, "Muito capa", "Jose padilha");
		
		meuBD.adicionaItem(a1);
		meuBD.adicionaItem(f1);
		
		meuBD.listaItens();
		
	
    }
}