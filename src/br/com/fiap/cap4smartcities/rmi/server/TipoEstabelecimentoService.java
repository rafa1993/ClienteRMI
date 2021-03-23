package br.com.fiap.cap4smartcities.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TipoEstabelecimentoService extends Remote {
	
	public String pesquisar(Integer idPesquisa) throws RemoteException;

}
