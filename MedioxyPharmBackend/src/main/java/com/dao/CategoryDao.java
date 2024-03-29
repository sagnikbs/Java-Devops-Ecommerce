package com.dao;

import java.util.List;

import com.model.Category;

public interface CategoryDao {

	public boolean addCategory(Category category);
	public List<Category>retrieveCategory();
	public boolean deleteCategory(Category category);
	public boolean updateCategory(Category category);
	public Category getCategory(int catgId);
}
