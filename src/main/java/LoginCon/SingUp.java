package LoginCon;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LoginModel.LoginC;
import LoginModel.LoginIN;

@WebServlet("/SingUp")
public class SingUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SingUp() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/SingUp.jsp");
		rd.forward(request, response);
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");

		LoginIN obj = new LoginC();
		obj.DBconnection();
		obj.SingUp(name,city,email,mobile);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
