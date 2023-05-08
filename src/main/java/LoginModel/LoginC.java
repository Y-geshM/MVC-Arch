package LoginModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginC implements LoginIN {
	Connection con;
	Statement st;
    int req;
	@Override
	public void DBconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loginDB","root","g00gle33");
			st= con.createStatement();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	@Override
	public boolean LoginD(String emailid, String password) {
		try {
			ResultSet result = st.executeQuery("select * from login where email='"+emailid+"' and password='"+password+"'");
			return result.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public  void SingUp(String name,String city,String email,String mobile){
		try {
			if(name!=null) {
			st.executeUpdate("insert into Udata values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ResultSet ListAll() {
		try {
			ResultSet Reg = st.executeQuery("select * from Udata");
			return Reg;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void IReg(String email,String pass) {
		try {
			 st.executeUpdate("insert into login values('"+email+"','"+pass+"')");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void DeleteReg(String email) {
		try {
			 st.executeUpdate("delete from Udata where email='"+email+"'");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void UpdateReg(String email, String mobile, String city, String name) {
		try {
			 st.executeUpdate("update Udata set mobile='"+mobile+"',city='"+city+"',name='"+name+"',email='"+email+"' where email='"+email+"' ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
