package com.servlet;


	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Date;

	import javax.servlet.ServletConfig;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class FirstServlett extends HttpServlet{
		@Override
		public void init(ServletConfig config) throws ServletException {
			System.out.println("init()");
			super.init(config);
		}
		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("doget() is called");
		   PrintWriter out=resp.getWriter();
		   out.println("<h1> Welcome to Servlet HelloWorld"+new Date()+"</h1>");

		}
	}

