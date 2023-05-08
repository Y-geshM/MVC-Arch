package LoginCon;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LoginModel.LoginC;
import LoginModel.LoginIN;

@WebServlet("/update")
public class UpdateReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UpdateReg() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String city = request.getParameter("city");
		String name = request.getParameter("name");
		
		request.setAttribute("email", email);
		request.setAttribute("mobile", mobile);
		request.setAttribute("city", city);
		request.setAttribute("name", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/UpdateReg.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String city = request.getParameter("city");
		String name = request.getParameter("name");
		
		LoginIN obj = new LoginC();
		obj.DBconnection();
		
		obj.UpdateReg(email,mobile,city,name);
		
		ResultSet Reg = obj.ListAll();
		request.setAttribute("AReg", Reg);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/List_reg.jsp");
		rd.forward(request, response);
	}

}
