import java.sql.*;

public class DisplayJDBC {
    public static void main(String args[]) {
        String driverName = "org.postgresql.Driver";
        String url = "jdbc:postgresql://192.168.1.17:5432/sample_db";
        String username = "cse";
        String password = "cse123";

        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(url, username, password);
            if (con != null) {
                System.out.println("Database connected\n");
            } else {
                System.out.println("Database is not connected\n");
            }
            String query = "select * from students";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("First name = " + rs.getString("first_name"));
                System.out.println("Last name = " + rs.getString("last_name"));
                System.out.println("Mobile no is = " + rs.getString("mobile"));
                System.out.println("Email id is = " + rs.getString("email"));
                System.out.println("cgpa = " + rs.getString("cgpa"));
                System.out.println("-----------------------------");
            }

            rs.close();
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

