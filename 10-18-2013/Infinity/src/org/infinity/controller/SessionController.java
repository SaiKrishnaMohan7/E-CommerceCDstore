package org.infinity.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionController
 */
@WebServlet(name="SessionController",loadOnStartup = 2, urlPatterns={"/category", "/viewCart", "/checkout"})
public class SessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String userPath = request.getServletPath();

		// if category page is requested
		if (userPath.equals("/category")) {
			// TODO: Implement category request
			userPath = "/Category";
			// if cart page is requested
		} else if (userPath.equals("/viewCart")) {
			// TODO: Implement cart page request

			userPath = "/CartPage";

			// if checkout page is requested
		} else if (userPath.equals("/checkout")) {
			// TODO: Implement checkout page request
			userPath = "/CheckoutPage";
			// if user switches language
		} 

		String url = "/WEB-INF/view" + userPath + ".jsp";
		
		try 
		{
			request.getRequestDispatcher(url).forward(request, response);
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
