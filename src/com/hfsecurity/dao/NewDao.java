/**
 * 
 */
package com.hfsecurity.dao;

import com.hfsecurity.bean.News;

/**
 * 新闻DAO
 */
public interface NewDao {
	public boolean add(News tnew);

	public boolean update(News tnew);

	/**
	 * @param id
	 * @return
	 */
	public News find(int id);

	/**
	 * @param tnew
	 */
	public void delete(News tnew);
}
