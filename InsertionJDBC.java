import java.sql.*;
public class InsertionJDBC{
	public static void main (String args[]){
		String driverName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://192.168.1.17:5432/sample_db";
		String username = "cse";
		String password = "cse123";
		try{
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url, username, password);
			if(con!= null){
				System.out.println("DATABASE CONNECTED\n");
			}else{
				System.out.println("DATABASE IS NOT CONNECTED\n");
			}
			String query = "Insert into students(first_name,last_name,mobile,email,cgpa)values('Hitesh','Rana','898****587','cse.24bcsg88@silicon.ac.in','8.6')";
			Statement stmt=con.createStatement();
			int total=stmt.executeUpdate(query);
			if(total>0){
				System.out.print("Numbers of rows are installed: "+total);
			}
			stmt.close();
			con.close();
		}
		catch (ClassNotFoundException ob){
			System.out.print("CLASS NOT FOUND");
		} catch (SQLException se) {
			System.out.print("DATABASE EXCEPTION");
		}
	}
}
