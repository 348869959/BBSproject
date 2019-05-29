/**
 * 
 */
package com.hfsecurity.dao;

import java.util.List;

import com.hfsecurity.bean.Helps;

/**
 * @author chenguoji
 * @email chenguo_ji@163.com
 */
public interface HelpDao {
	public List<Helps> getAll();

	/**
	 * @param index
	 * @return
	 */
	public Helps find(int index);

	/**
	 * @param thelp
	 */
	public void add(Helps thelp);

	/**
	 * @param thelp
	 */
	public void update(Helps thelp);

}
