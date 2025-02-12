package com.phone.common;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class FrontCtl extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();
		String path = request.getServletPath();
		OMMSResponse res = new OMMSResponse();
		if(!path.startsWith("/Auth")) {
			if(session.getAttribute("user")== null) {
			PrintWriter out =	response.getWriter();
			out.print("OOPS ! your session has been expired");
			out.close();
			}
		}
		return true;
	}

}
