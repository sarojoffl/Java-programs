package database;
import java.sql.*;

class JDBCSelect{
	public static void main(String[] args) {
		final String url="jdbc:mysql://localhost:3306/ncit";
		final String uname="root";
		final String pwd="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(url,uname,pwd);
			Statement stmt=cn.createStatement();
			String q="SELECT * FROM Student";
			ResultSet rs=stmt.executeQuery(q);
			while(rs.next()) {
				System.out.println("Roll="+rs.getInt(1)+"\t"+"Name="+rs.getString(2)+"\t"+"Faculty="+rs.getString(3));
			}
			cn.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}