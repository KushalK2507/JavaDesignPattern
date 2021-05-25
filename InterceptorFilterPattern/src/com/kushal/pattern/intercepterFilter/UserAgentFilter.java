package com.kushal.pattern.intercepterFilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class UserAgentFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// The Header part "User-Agent" given the type of browser
		// we need to typecast it request to HttpServletRequest, so to get the method
		// getHeader() method

		String userAgentHeader = ((HttpServletRequest) request).getHeader("User-Agent");
		if (userAgentHeader.contains("Chrome")) {
			System.out.println(userAgentHeader);
			chain.doFilter(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("badBrowser.jsp");
			requestDispatcher.forward(request, response);

		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
