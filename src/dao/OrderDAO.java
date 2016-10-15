package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.*;
//@leilei-pc
public class OrderDAO {
	protected static final String FIELDS_INSERT = "id,text,mnum,remark";
	protected static String INSERT_SQL = "insert into torder(" + FIELDS_INSERT + ")" + "values (?,?,?,?)";
	protected static String SELECT_SQL = "select * from torder where oid=?";
	protected static String DELETE_SQL = "delete from torder where oid=?";
	 public Order create(Order ord) throws Exception {//order订单
	        Connection con = null;
	        PreparedStatement prepStmt = null;
	        ResultSet rs = null;
	        try {
	            con = (Connection) DbConnecter.getDBconnection();
	            prepStmt = con.prepareStatement(INSERT_SQL);
	            prepStmt.setString(1, ord.getId());
	            prepStmt.setString(2, ord.getText());
	            prepStmt.setInt(3, ord.getMnum());
	            prepStmt.setString(4, ord.getRemark());
	            	            
	            prepStmt.executeUpdate();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            DbConnecter.closeDB(con, prepStmt, rs);
	        }
	        return ord;
	    }
	 public Order find(Order ord) throws Exception {
	        Connection con = null;
	        PreparedStatement prepStmt = null;
	        ResultSet rs = null;
	        Order ord2 = null;
	        try {
	            con = DbConnecter.getDBconnection();
	            prepStmt = con.prepareStatement(SELECT_SQL);
	            prepStmt.setInt(1, ord.getOid());
	            rs = prepStmt.executeQuery();
	            if (rs.next()) {
	                ord2 = new Order();
	                ord2.setOid(rs.getInt(1));
	                ord2.setId(rs.getString(2));
	                ord2.setText(rs.getString(3));
	                ord2.setMnum(rs.getInt(4));
	                ord2.setRemark(rs.getString(5));
	                ord2.setOdate(rs.getDate(6));	                
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            DbConnecter.closeDB(con, prepStmt, rs);
	        }
	        return ord2;
	    }
	 public List<Order> findAll(Order ord) throws Exception {
	        Connection con = null;
	        PreparedStatement prepStmt = null;
	        ResultSet rs = null;
	        List<Order> order = new ArrayList<Order>();
	        con = DbConnecter.getDBconnection();
	        prepStmt = con.prepareStatement("select * from torder where id=?");
	        prepStmt.setString(1, ord.getId());
	        rs = prepStmt.executeQuery();
	        while (rs.next()) {
	         Order ord2 = new Order();	            
             ord2.setOid(rs.getInt(1));
             ord2.setId(rs.getString(2));
             ord2.setText(rs.getString(3));
             ord2.setMnum(rs.getInt(4));
             ord2.setRemark(rs.getString(5));
             ord2.setOdate(rs.getDate(6));
	            order.add(ord2);
	        }
	        DbConnecter.closeDB(con, prepStmt, rs);
	        return order;
	    }

	    public List<Order> findAll() throws Exception {
	        Connection con = null;
	        PreparedStatement prepStmt = null;
	        ResultSet rs = null;
	        List<Order> order = new ArrayList<Order>();
	        con = DbConnecter.getDBconnection();
	        prepStmt = con.prepareStatement("select * from Torder");
	        rs = prepStmt.executeQuery();
	        while (rs.next()) {
	            Order ord2 = new Order();	            
                ord2.setOid(rs.getInt(1));
                ord2.setId(rs.getString(2));
                ord2.setText(rs.getString(3));
                ord2.setMnum(rs.getInt(4));
                ord2.setRemark(rs.getString(5));
                ord2.setOdate(rs.getDate(6));
	            order.add(ord2);
	        }
	        DbConnecter.closeDB(con, prepStmt, rs);
	        return order;
	    }

	    public void remove(Order ord) throws Exception {
	        Connection con = null;
	        PreparedStatement prepStmt = null;
	        ResultSet rs = null;
	        try {
	            con = DbConnecter.getDBconnection();
	            prepStmt = con.prepareStatement(DELETE_SQL);
	            prepStmt.setInt(1, ord.getOid());
	            prepStmt.executeUpdate();
	        } catch (Exception e) {
	            //
	            e.printStackTrace();
	        } finally {
	            DbConnecter.closeDB(con, prepStmt, rs);
	        }
	    }
	 
}
