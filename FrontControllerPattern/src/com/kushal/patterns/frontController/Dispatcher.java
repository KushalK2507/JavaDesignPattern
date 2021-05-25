package com.kushal.patterns.frontController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher {

	public void dispath(HttpServletRequest request, HttpServletResponse response, String nextView) {
		if (null != nextView) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(mapPageToView(nextView));
			try {
				requestDispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
	}

	private String mapPageToView(String nextView) {
		if (nextView.equals("showStudentDetails")) {
			return "viewStudentDetails.jsp";
		}
		return null;
	}

}
