package LoginModel;

import java.sql.ResultSet;

public interface LoginIN {
	public void DBconnection();
	public boolean LoginD(String emailid,String password);
	public void SingUp(String name,String city,String email,String mobile);
	public ResultSet ListAll();
	public void IReg(String email,String pass);
	public void DeleteReg(String email);
	public void UpdateReg(String email, String mobile, String city, String name);
}
