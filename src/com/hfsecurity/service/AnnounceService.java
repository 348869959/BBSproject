/**
 * 
 */
package com.hfsecurity.service;

import java.util.List;

import com.hfsecurity.bean.Announces;
import com.hfsecurity.bean.Pages;

/**
 * announcement service
 * interfaces defined
 * 
 */
public interface AnnounceService {
	public List<Announces> getIndexAnno(int index);

	/**
	 * @return
	 */
	public List<Announces> getAll();

	/**
	 * display the announcement by page
	 * @param pageSize
	 * @param nowPage
	 * @return
	 */
	public Pages ManageAllForPages(int pageSize, int nowPage);

	/** 
	 * @param id
	 */
	public Announces find(int id);

	/**
	 * @param announce
	 */
	public void ManageUpdate(Announces announce);

	/**
	 * @param announce
	 */
	public void ManageAdd(Announces announce);
}
