/**
 * 
 */
package com.hfsecurity.dao;

import com.hfsecurity.bean.Grades;

/**
 * @author chenguoji
 * @email chenguo_ji@163.com
 */
public interface GradeDao {

	/**
	 * @param id
	 * @return
	 */
	public Grades find(int id);

}
