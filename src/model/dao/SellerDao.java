package model.dao;

import java.util.List;

import entities.model.Department;
import entities.model.Seller;

public interface SellerDao {
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer obj);
	Seller findById(Integer id);
	List<Department> findAll();
}
