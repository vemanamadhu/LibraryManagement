package com.uhg.library.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private StudentDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
       // dao = new StudentDAOImpl();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("username");
		String passw = request.getParameter("pass");
		
		
		//Student student = dao.getStudentById(name);
		
		
		//if(name.equals(student.student_id) && passw.equals(student.password))
		if(name.equals("admin") && passw.equals("123456"))
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("username", name);
			session.setMaxInactiveInterval(120);
			response.sendRedirect("HomeController");
			return;
		}
		
		else
		{
			
			request.setAttribute("errorMessage", "* Invalid login Details");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
		System.out.println("its coming");
	}

}
