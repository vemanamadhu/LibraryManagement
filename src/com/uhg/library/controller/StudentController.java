package com.uhg.library.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uhg.library.model.Student;

//import com.uhg.library.dao.StudentDAO;
//import com.uhg.library.daoimpl.StudentDAOImpl;
//import com.uhg.library.model.Student;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private StudentDAO dao;

	public static final String EDIT_STUDENT="/Profile.jsp";
	public static final String INSERT_STUDENT="/Register.jsp";
	public static final String LOGIN="/login.jsp";
    public StudentController() {
     //   dao=new StudentDAOImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("edit")){
			forward=EDIT_STUDENT;
			String student_id=request.getParameter("student_id");
		//	Student student=dao.getStudent(student_id);
		//	request.setAttribute("student",student);
		}
		else if(action.equalsIgnoreCase("register")){
			forward=INSERT_STUDENT;
		}
		RequestDispatcher view = request.getRequestDispatcher( forward );
    view.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		Student student=new Student();
		student.setStudent_id(request.getParameter("student_id"));
		student.setPassword(request.getParameter("password"));
		student.setFirst_name(request.getParameter("first_name"));
		student.setLast_name(request.getParameter("last_name"));
		student.setAddress(request.getParameter("address"));
		student.setMobile_no(Long.parseLong(request.getParameter("mobile_no")));
		student.setGender(request.getParameter("gender"));

	//	if(dao.getStudent(student.getStudent_id())==null){
	//		dao.addStudent(student);
		//}
		//else{
			//out.println("Already present in the database");
	//	}
		RequestDispatcher view= request.getRequestDispatcher(LOGIN);
		doGet(request, response);
	}

}
