package beans;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class DbConnecter {
	private static String driverName = "oracle.jdbc.driver.OracleDriver"; //	
	public DbConnecter() { }
	
	public static Connection getDBconnection(){
		String  url="jdbc:oracle:thin:scott/MYORACLE@localhost:1521:Tablet"; //
		try{
		    Class.forName(driverName);		
		    Connection con=(Connection) DriverManager.getConnection(url); 
		    return con;		   
	    }catch (Exception e) {			
			   e.printStackTrace();
		}
		return null;
    } 
	public static void closeDB(Connection con,PreparedStatement  pstm, ResultSet rs){
	 	   try{
	 		   if(rs!=null) rs.close(); 
	 		   if(pstm!=null) pstm.close();
			   if(con!=null) con.close();				 
		   }catch (SQLException e) {				
				e.printStackTrace();			
		   }
		}

}
