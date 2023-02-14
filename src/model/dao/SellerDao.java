package model.dao;

import java.util.List;

import model.entities.Seller;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void uptade(Seller objSeller);
	void deleteById(Integer id);
	List<Seller> findAll();
}
