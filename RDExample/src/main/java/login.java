

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet(urlPatterns = {"/login"})

public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//res.setContentType("text/html");
		
		String u = req.getParameter("username");
		String p = req.getParameter("password");
		
				PrintWriter out2 = res.getWriter();
		out2.println("Login Sucess..!");
		
		RequestDispatcher rd = req.getRequestDispatcher("multiply.html");
		rd.forward(req, res);

		
	}

}
