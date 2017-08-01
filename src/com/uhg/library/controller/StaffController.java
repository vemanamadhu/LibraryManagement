package com.uhg.library.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
@WebServlet("/StaffController")
public class StaffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffController() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	
		
		String password = request.getParameter("password");
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		long mobile_no = Long.parseLong(request.getParameter("mobile_no"));
		
		String staff_id = request.getParameter("staff_id");
		String designation = request.getParameter("designation");
		String dept_name = request.getParameter("dept_name");
		int dept_no;
		try{
		 dept_no = Integer.parseInt(request.getParameter("dept_no"));}
		catch(NumberFormatException nfe)
		{
		 dept_no = -1;	
		}
		
		
		HttpSession sess = request.getSession();
		
		sess.setAttribute("user1", staff_id);
		
		sess.setAttribute("pass", password);
		
		request.setAttribute("successMessage", "*Registeration Successfull");
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		
		
		
	}

}
