/**
 * 
 */
package com.hfsecurity.dao;

import java.util.List;

import com.hfsecurity.bean.Categorys;

/**
 * 类目DAO
 */
public interface CategoryDao {
	public boolean add(Categorys cate);
	public boolean delete(int index);
	public boolean update(Categorys cate);
	public List<Categorys> getAll();
	/**
	 * @param id
	 * @return
	 */
	public Categorys find(int id);
}
