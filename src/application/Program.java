package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== TEST 1: seller findById ====");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.buscarPorId(3);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("==== TEST 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.buscarPorDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("==== TEST 3: seller findAll ====");
		list = sellerDao.buscarTodos();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		/*System.out.println("==== TEST 4: seller insert ====");
		Seller newSeller = new Seller(null, "Marx", "marx@gmail.com", new Date(), 15000.00, department);
		sellerDao.inserir(newSeller);
		System.out.println("Inserido! Novo Id = " + newSeller.getId());

		System.out.println();*/
		
		System.out.println("==== TEST 5: seller update ====");
		seller = sellerDao.buscarPorId(1);
		seller.setName("Martha Waine");
		seller.setEmail("martha@gmail.com");
		sellerDao.atualizar(seller);
		System.out.println("Atualização completada");

		System.out.println();
		
		System.out.println("==== TEST 6: seller delete ====");
		System.out.print("Digite um id para testar o delete: ");
		int id = sc.nextInt();
		sellerDao.deletarPorId(id);
		System.out.println("Delete comletado");
		sc.close();
	}

}
