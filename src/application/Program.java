package application;


import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== TEST 1: seller findById ====");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.buscarPorId(3);
		System.out.println(seller);
		
		sc.close();
	}

}
