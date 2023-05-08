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

@WebServlet("/delete")
public class deleteReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public deleteReg() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		
		System.out.println(email);
		LoginIN obj = new LoginC();
		obj.DBconnection();
		
		obj.DeleteReg(email);
		
		ResultSet Reg = obj.ListAll();
		request.setAttribute("AReg", Reg);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/List_reg.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
