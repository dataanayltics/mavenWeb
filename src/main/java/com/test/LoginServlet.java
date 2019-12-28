package com.test;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");// setting the content type
		PrintWriter pw = res.getWriter();// get the stream to write the data
		String uname = req.getParameter("username");
		
		String password = req.getParameter("password");
		
		
		pw.println("<html><body> Login Success for User : " + uname);
		
		
		pw.println("</body></html>");

		pw.close();// closing the stream
	}
}
