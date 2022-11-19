package controle;

import java.util.ArrayList;

public interface SessaoDAO {

	public boolean inserir(SessaoDAO s); 
	public boolean atualizar(SessaoDAO s);
	public ArrayList<SessaoDAO> listarSessoes();
	public boolean excluir(SessaoDAO s);
	
	public String escolhaAssento();
}
