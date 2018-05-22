package com.jack.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jack.dao.StudentDAO;
import com.jack.entity.Student;

/**
 * Servlet implementation class StudentFindByIdServlet
 */
public class StudentFindByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentFindByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		StudentDAO stDAO = new StudentDAO();
		Student stu = stDAO.findById(id);
		stu.setCourses(stDAO.findCourseByName(stu.getMajor()));
		if(stu.getCourses()==null) {
			System.out.println("course==null");
		}
		request.setAttribute("student", stu);
		request.getRequestDispatcher("detail.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
