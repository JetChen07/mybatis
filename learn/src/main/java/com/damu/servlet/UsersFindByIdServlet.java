package com.damu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.damu.dao.UsersDAO;
import com.damu.entity.Users;

/**
 * Servlet implementation class UsersFindByIdServlet
 */
public class UsersFindByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Logger log = Logger.getLogger(UsersFindByIdServlet.class);

	private UsersDAO usersDAO = new UsersDAO();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");

		log.info("获取到查询参数id--》" + id);

		Users user = usersDAO.findById(Integer.parseInt(id));

		log.info("查询数完成，查询到的数据：" + user);

		req.setAttribute("user", user);

		req.getRequestDispatcher("detail.jsp").forward(req, resp);
	}

}
