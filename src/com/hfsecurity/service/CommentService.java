/**
 * 
 */
package com.hfsecurity.service;

import com.hfsecurity.bean.Comments;
import com.hfsecurity.bean.Topics;
import com.hfsecurity.bean.Users;


/**
 * 评论服务接口定义
 * 
 */
public interface CommentService {

	public boolean newComment(Comments comment, Users user, Topics topic);


	/**
	 * @param comment
	 * @param topic 
	 */
	public void deleteComment(Comments comment, Topics topic);
}
