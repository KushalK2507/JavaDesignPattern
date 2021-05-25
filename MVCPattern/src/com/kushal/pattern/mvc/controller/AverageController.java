package com.kushal.pattern.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kushal.pattern.mvc.model.AverageModel;

@WebServlet("/averageController")
public class AverageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));

		AverageModel model = new AverageModel();
		int result = model.calculateAverage(num1, num2);
		request.setAttribute("number1", num1);
		request.setAttribute("number2", num2);
		request.setAttribute("averageResult", result);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);

	}

}
