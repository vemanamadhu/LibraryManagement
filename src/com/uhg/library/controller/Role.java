package com.uhg.library.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Role
 */
@WebServlet("/Role")
public class Role extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Role() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 String rad = request.getParameter("role");
			 if ("staff".equals(rad))
			 	{
				 	response.sendRedirect("staff.jsp");
				}
			 else if("student".equals(rad))
			 {
				 response.sendRedirect("student.jsp");
			 }
			 else
			 {
				 response.sendRedirect("delivery.jsp");
			 }
			
		}
		
	}


