package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.DbConnecter;
import beans.Manager;
//@jialeilei
public class ManDAO {
	protected static final String FIELDS_INSERT = "id,passWord";
	protected static String INSERT_SQL = "insert into Tmanager (" + FIELDS_INSERT + ")" + "values (?,?)";
	 public Manager create(Manager man) throws Exception {//man
	        Connection con = null;
	        PreparedStatement prepStmt = null;
	        ResultSet rs = null;
	        try {
	            con = (Connection) DbConnecter.getDBconnection();
	            prepStmt = con.prepareStatement(INSERT_SQL);
	            prepStmt.setString(1, man.getId());
	            prepStmt.setString(2, man.getPassWord());
	            
	            
	            
	            prepStmt.executeUpdate();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            DbConnecter.closeDB(con, prepStmt, rs);
	        }
	        return man;
	    }
}
