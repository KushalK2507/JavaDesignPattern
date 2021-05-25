package com.kushal.patterns.frontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewStudentCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

		StudentVO vo = new StudentVO(1, "Kushal");
		request.setAttribute("studentDetails", vo);

		return "showStudentDetails";
	}

}
