/**
 * 
 */
package com.hfsecurity.dao;

import com.hfsecurity.bean.Comments;

/**
 * 评论DAO
 */
public interface CommentDao {
	public boolean add(Comments comment);

	/**
	 * @param comments
	 */
	public void update(Comments comments);

	/**
	 * @param id
	 * @return
	 */
	public Comments find(int id);

	/**
	 * @param comment
	 */
	public void delete(Comments comment);

}
