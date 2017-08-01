package com.uhg.library.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ReturnController
 */
@WebServlet("/ReturnController")
public class ReturnController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReturnController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");  
	     PrintWriter out=response.getWriter();  
	     request.getRequestDispatcher("return_book.jsp").include(request, response);  
	     HttpSession session=request.getSession(false);  
	        if(session!=null&&(String)session.getAttribute("username")!=null){
	        	
	        	
	        }
	        else
	        {
	        	request.setAttribute("errorMessage", "* Please Login first");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
