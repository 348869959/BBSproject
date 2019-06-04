/**
 * 
 */
package com.hfsecurity.service;

import java.util.List;

import com.hfsecurity.bean.Categorys;
import com.hfsecurity.bean.Pages;
import com.hfsecurity.bean.Topics;
import com.hfsecurity.bean.Types;

/**
 * 类目服务接口定义
 * 
 */
public interface CategoryService {
	public boolean add(Categorys cate);

	public boolean delete(int index);

	public boolean update(Categorys cate);

	public List<Categorys> getAll();

	/**
	 * @param id
	 * @return
	 */
	public List<Types> getType(int id);

	public List<Types> new_getType(int id);

	/**
	 * @param listType
	 * @return
	 */
	public List<Topics> getTopic(List<Types> listType);

	/**
	 * @param i
	 * @param nowPage
	 * @param listType
	 * @return
	 */
	public Pages getAllForPages(int pageSize, int nowPage, List<Types> listType);

	/**
	 * @param id
	 * @return
	 */
	public Categorys find(int id);

	/**
	 * @param id
	 * @return
	 */
	public List<Types> manageType(int id);
}
