package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet
{
	// ServletConfig & ServletContext
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		out.print("HI ");
		
		
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		//ServletContext ctx = request.getServletContext();
		//String str = ctx.getInitParameter("phone");
		out.println(str);
	}

}
