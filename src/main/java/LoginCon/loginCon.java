package LoginCon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LoginModel.LoginC;
import LoginModel.LoginIN;

@WebServlet("/verifylogin")
public class loginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public loginCon() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String emailid = request.getParameter("email");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		LoginIN obj = new LoginC();
		obj.DBconnection();
		
		boolean status = obj.LoginD(emailid, password);
		if(status==true) {
			System.out.println("'"+emailid+"' Is Accessing");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/Menu.jsp");
			rd.forward(request, response);
		}else {
			out.println("INVALID");
		}
		
		
		
		

	}

}
