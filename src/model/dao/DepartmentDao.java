package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	public void inserir(Department obj);
	public void atualizar(Department obj);
	public void deletarPorId(Integer id);
	Department buscarPorId(Integer id);
	List<Department> buscarTodos();

}
