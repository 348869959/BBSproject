/**
 * 
 */
package com.hfsecurity.dao;

import java.util.List;

import com.hfsecurity.bean.Announces;

/**
 * DAO data access object
 * 公告栏
 */
public interface AnnounceDao {
	public List<Announces> getIndexAnno(int index);

	/**
	 * @return
	 */
	public List<Announces> getAll();

	/**
	 * @param id
	 */
	public Announces find(int id);

	/**
	 * @param announce
	 */
	public void update(Announces announce);

	/**
	 * @param announce
	 */
	public void add(Announces announce);
}
