package jdbc;
import java.sql.* ;  // for standard JDBC programs
//import java.math.* ; // for BigDecimal and BigInteger support

public class Jdbcconnection {

	
		public static void main(String args[]){  
		try{  
		//step1 load the driver class  
		Class.forName("com.mysql.jdbc.Driver");               
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","cts-9090");  
		//step3 create the statement object  
		Statement stmt=con.createStatement();  
		//step4 execute query  
		ResultSet rs=stmt.executeQuery("select * from CITY LIMIT 10");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) +" "+ rs.getString(4));  
		//step5 close the connection object  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
		}  

	

