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

@WebServlet("/ListR")
public class ListR extends HttpServlet {
	
    public ListR() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginIN obj = new LoginC();
		obj.DBconnection();
		
		ResultSet Reg = obj.ListAll();
		request.setAttribute("AReg", Reg);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/List_reg.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
