package master.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.DAO.userA_DAO;
import master.DTO.userA_DTO;

/**
 * Servlet implementation class login_servlet
 */
public class login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String phone = request.getParameter("ph");
		String password = request.getParameter("ps");
		
		if(phone.trim().length()==0) {
			response.sendRedirect("login.jsp?status=phone no can not be empty");
			return;
		}
		
		if(password.trim().length()==0) {
			response.sendRedirect("login.jsp?status=password can not be empty");
			return;
		}
		
		userA_DTO dto = new userA_DTO();
		dto.setPhone(phone);
		dto.setPassword(password);
		
		userA_DAO dao = new userA_DAO();
		boolean x = dao.fetch(phone, password);
		
		if(x)
			response.sendRedirect("profile.jsp?status1="+x);
		else
			response.sendRedirect("login.jsp?status1="+x);

	}

}
