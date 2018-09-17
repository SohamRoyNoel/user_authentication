package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.DAO.userA_DAO;
import master.DTO.userA_DTO;

/**
 * Servlet implementation class register_servlet
 */
public class register_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("nm");
		String password = request.getParameter("ps");
		String con_pass = request.getParameter("con");
		String phone = request.getParameter("ph");
		
		if (password.equals(con_pass)) {
			userA_DTO dto = new userA_DTO();
			dto.setName(name);
			dto.setPassword(password);
			dto.setPhone(phone);
			
			userA_DAO dao = new userA_DAO();
			dao.insertUSER(dto);
			
			response.sendRedirect("Success.html");
		} else {
			response.sendRedirect("register.jsp");
		}
	}

}
