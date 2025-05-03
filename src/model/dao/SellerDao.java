package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	public void inserir(Seller obj);
	public void atualizar(Seller obj);
	public void deletarPorId(Integer id);
	Seller buscarPorId(Integer id);
	List<Seller> buscarTodos();
	
}
