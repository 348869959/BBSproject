/**
 * 
 */
package com.hfsecurity.interceptor;

import java.util.Map;

import com.hfsecurity.bean.Users;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 超管拦截器
 */
public class SuperAdminInterceptor extends MethodFilterInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public String doIntercept(ActionInvocation invocation) throws Exception {
		ActionContext actx = invocation.getInvocationContext();
		Map session = actx.getSession();
		Users u = (Users) session.get("tu");
		if (u == null || u.getRoleId() == 0 || u.getRoleId() == 6) {
			return Action.LOGIN;
		}
		return invocation.invoke();
	}

}
