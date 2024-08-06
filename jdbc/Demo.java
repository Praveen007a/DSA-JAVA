package jdbc;
import java.sql.*;

public class Demo {

	public static void main(String[] args) throws SQLException {
		updateData();
		readData();


	}
	public static void readData()throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
		String password="8072";
		
		String query="select * from exam";
		
		Connection con = DriverManager.getConnection(url,name,password);
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()){
			System.out.println("id: "+rs.getInt(1));
			System.out.println("name: "+rs.getString(2));
			System.out.println("salary: "+rs.getInt(3));
			System.out.println("--------------------------------------");
		}

		con.close();
	}
	public static void insertData() throws SQLException{
		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
		String password="8072";
		
		String query="insert into exam value(7,'Kavitha',80000)";
		
		Connection con = DriverManager.getConnection(url,name,password);
		Statement st = con.createStatement();
		int rows=st.executeUpdate(query);
		
		System.out.println(rows);
		con.close();
	}
	public static void deleteData() throws SQLException{
		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
		String password="8072";
		
		String query="delete from exam where id=5";
		
		Connection con = DriverManager.getConnection(url,name,password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("affected rows: "+rows);
	}
	public static void updateData() throws SQLException{
		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
		String password="8072";
		
		String query="update exam set salary=100000 where name='Praveen'";
		
		Connection con = DriverManager.getConnection(url,name,password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("affected rows: "+rows);
	}
}