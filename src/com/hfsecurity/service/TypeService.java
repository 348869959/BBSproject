/**
 * 
 */
package com.hfsecurity.service;


import com.hfsecurity.bean.Pages;
import com.hfsecurity.bean.Types;

/**
 * @author chenguoji
 * @email chenguo_ji@163.com
 */

public interface TypeService {
	public Pages getAllForPages(int pageSize, int nowPage, int typeId);

	/**
	 * @param id
	 * @return
	 */
	public Types find(int id);

	/**
	 * @param type
	 */
	public void add(Types type);

	/**
	 * @param type
	 */
	public void update(Types type);
	
}
