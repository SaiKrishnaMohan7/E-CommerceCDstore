package org.infinity.controller;
import org.infinity.model.buisobjects.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductCatalogService
 */
@WebServlet({ "/showall", "/showcategory", "/addtocart" })
public class ProductCatalogService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductCatalogService() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String servPath = request.getServletPath();
		if(servPath.equals("/showall"))
		{
			System.out.println(servPath);
			Product[] prodarray = Helper.getAllProducts("");
			Category[] categoryarray = Helper.getAllCategory();
			
			request.getSession().setAttribute("ALL_PRODUCTS", prodarray);
			request.getSession().setAttribute("ALL_CATEGORYS", categoryarray);
			response.sendRedirect("Home.jsp");
			
		}

		if(servPath.equals("/showcategory"))
		{
			System.out.println(servPath);
			String catID = request.getParameter("category_id");
			Product[] prodarray = Helper.getAllProducts(catID);
			Category[] categoryarray = Helper.getAllCategory();
			
			request.getSession().setAttribute("ALL_PRODUCTS", prodarray);
			request.getSession().setAttribute("ALL_CATEGORYS", categoryarray);
			response.sendRedirect("Home.jsp");
			
		}

		else if(servPath.equals("/addtocart"))
		{


			
			String prodID = request.getParameter("ProductID");
			
			System.out.println(servPath);
		}





	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
