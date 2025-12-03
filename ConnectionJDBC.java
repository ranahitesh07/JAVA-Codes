import java.sql.*;
public class ConnectionJDBC{
	public static void main (String args[]){
		String driverName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://192.168.1.17:5432/sample_db";
		String username = "cse";
		String password = "cse123";
		try{
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url, username, password);
			if(con!= null){
				System.out.print("DATABASE CONNECTED");
			}else{
				System.out.print("DATABASE IS NOT CONNECTED");
			}
			con.close();
		}
		catch (ClassNotFoundException ob){
			System.out.print("CLASS NOT FOUND");
		}catch (SQLException se){
			System.out.print("DATABASE EXCEPTION");
		}
	}
}