/**
 * 
 */
package com.hfsecurity.dao;

import com.hfsecurity.bean.Grades;

/**
 * 评分DAO
 */
public interface GradeDao {

	/**
	 * @param id
	 * @return
	 */
	public Grades find(int id);

}
