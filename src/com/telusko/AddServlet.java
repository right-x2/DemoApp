package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		res.sendRedirect("sq?k="+k); // URL Redirecting
		//Session Managemant
		//req.setAttribute("k", k);
		// Req Dis and Redirect
		// RequestDispatcher�� �������� �鿣�忡�� �� ���� �𸥴�.
		// sendredirect�� ����Ѵ�.
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		//rd.forward(req, res);
	}
}
