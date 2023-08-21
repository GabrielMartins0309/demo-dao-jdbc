package application;

import entities.model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: seller findById ===");

		Seller seller = sellerDao.findById(3);

		System.out.println(seller);
	}

}
