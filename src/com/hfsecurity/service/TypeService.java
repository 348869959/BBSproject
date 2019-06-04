/**
 * 
 */
package com.hfsecurity.service;


import com.hfsecurity.bean.Pages;
import com.hfsecurity.bean.Types;


/**
 * 类型服务接口定义
 * 
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
