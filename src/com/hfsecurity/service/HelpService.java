/**
 * 
 */
package com.hfsecurity.service;

import java.util.List;

import com.hfsecurity.bean.Helps;
import com.hfsecurity.bean.Pages;


/**
 * 帮助栏服务接口定义
 * 
 */
public interface HelpService {
	public List<Helps> getAll();

	/**
	 * @param pageSize
	 * @param nowPage
	 * @return
	 */
	public Pages ManageAllForPages(int pageSize, int nowPage);

	/**
	 * @param index
	 * @return
	 */
	public Helps find(int index);

	/**
	 * @param thelp
	 */
	public void ManageAdd(Helps thelp);

	/**
	 * @param thelp
	 */
	public void ManageUpdate(Helps thelp);
}
