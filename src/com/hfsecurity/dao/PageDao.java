/**
 * 
 */
package com.hfsecurity.dao;

import java.util.List;

import org.hibernate.Query;

/**
 * 分页管理DAO
 */
public interface PageDao {
	public int getAllRowCount(String hql);
	public List query_Objects_ForPages(String hql, int offset, int length);
}
