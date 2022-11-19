package controle;

import java.util.ArrayList;

public interface FilmeDAO {

	public boolean inserir(FilmeDAO f); 
	public boolean atualizar(FilmeDAO f);
	public ArrayList<FilmeDAO> listarFilmes();
	public boolean excluir(FilmeDAO f);
	
	public String updateLugares(); 
	public String comprarIngressos();
	public boolean pagamento();
	public String cancelarPagamento(); 
	
	
	
}
