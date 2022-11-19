package controle;

import java.util.ArrayList;

public interface IngressoDAO {

	public boolean inserir(IngressoDAO i); 
	public boolean atualizar(IngressoDAO i);
	public ArrayList<IngressoDAO> listarIngresso();
	public boolean excluir(IngressoDAO i);
	
	public String filmes();
}
