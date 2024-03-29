package com.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.model.Product;


@Repository("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addProduct(Product product) {
		
		try
		{
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

	@Transactional
	@Override
	public boolean updateProduct(Product product) {
		try
		{
			Product productToUpdate=getProduct(product.getProId());
			productToUpdate.setProName(product.getProName());
			productToUpdate.setProCatg(product.getProCatg());
			productToUpdate.setProSupp(product.getProSupp());
			productToUpdate.setProDesp(product.getProDesp());
			productToUpdate.setProStock(product.getProStock());
			productToUpdate.setProPrice(product.getProPrice());
			productToUpdate.setFile(product.getFile());
			
			sessionFactory.getCurrentSession().update(productToUpdate);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

	@Transactional
	@Override
	public boolean deleteProduct(Product product) {
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
			return false;
		}
	}

	@Transactional
	@Override
	public List<Product> retrieveProduct() {
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product>listProduct=query.list();
		session.close();
		return listProduct;
	}

	@Transactional
	@Override
	public Product getProduct(int proId) {
		
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class, proId);
		session.close();
		return product;
	}

	
	
	
}
