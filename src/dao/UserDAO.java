//UserDAO
package dao;

import java.sql.*;
import java.util.*;
import java.util.List;
import beans.*;
//@jialeilei
public class UserDAO implements IDAO{

    public UserDAO() {
    }
    protected static final String FIELDS_INSERT = "id,passWord,name,sex,age,phone,email,address";
    //protected static final String  FIELDS_RETURN ="id, " + FIELDS_INSERT;
    protected static String INSERT_SQL = "insert into tuser (" + FIELDS_INSERT + ")" + "values (?,?,?,?,?,?,?,?)";
    protected static String SELECT_SQL = "select " + FIELDS_INSERT + " from tuser where id=?";
    protected static String UPDATE_SQL = "update tuser  set id=?,passWord=?,name=?,sex=?,age=?,phone=?,email=? ,address=? where id=?";
    protected static String DELETE_SQL = "delete from tuser where id=?";

    public User create(User pati) throws Exception {//pati
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        try {
            con = (Connection) DbConnecter.getDBconnection();
            prepStmt = con.prepareStatement(INSERT_SQL);
            prepStmt.setString(1, pati.getId());
            prepStmt.setString(2, pati.getPassWord());
            prepStmt.setString(3, pati.getName());
            prepStmt.setString(4, pati.getSex());
            prepStmt.setInt(5, pati.getAge());
            prepStmt.setString(6, pati.getPhone());
            prepStmt.setString(7, pati.getEmail());
            prepStmt.setString(8, pati.getAddress());
            
            prepStmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbConnecter.closeDB(con, prepStmt, rs);
        }
        return pati;
    }

    public User find(User pati) throws Exception {
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        User pati2 = null;
        try {
            con = DbConnecter.getDBconnection();
            prepStmt = con.prepareStatement(SELECT_SQL);
            prepStmt.setString(1, pati.getId());
            rs = prepStmt.executeQuery();
            if (rs.next()) {
                pati2 = new User();
                pati2.setId(rs.getString(1));
                pati2.setPassWord(rs.getString(2));
                pati2.setName(rs.getString(3));
                pati2.setSex(rs.getString(4));
                pati2.setAge(rs.getInt(5));
                pati2.setPhone(rs.getString(6));
                pati2.setEmail(rs.getString(7));
                pati2.setAddress(rs.getString(8));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbConnecter.closeDB(con, prepStmt, rs);
        }
        return pati2;
    }

    public List<User> findAll() throws Exception {
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        List<User> user = new ArrayList<User>();
        con = DbConnecter.getDBconnection();
        prepStmt = con.prepareStatement("select * from Tuser");
        rs = prepStmt.executeQuery();
        while (rs.next()) {
            User pati = new User();
            pati.setId(rs.getString(1));
            pati.setPassWord(rs.getString(2));
            pati.setName(rs.getString(3));
            pati.setSex(rs.getString(4));
            pati.setAge(rs.getInt(5));
            pati.setPhone(rs.getString(6));
            pati.setEmail(rs.getString(7));
            pati.setAddress(rs.getString(8));
            user.add(pati);
            
        }
        DbConnecter.closeDB(con, prepStmt, rs);
        return user;
    }

    public void remove(User pati) throws Exception {
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        try {
            con = DbConnecter.getDBconnection();
            prepStmt = con.prepareStatement(DELETE_SQL);
            prepStmt.setString(1, pati.getId());
            prepStmt.executeUpdate();
        } catch (Exception e) {
            //
            e.printStackTrace();
        } finally {
            DbConnecter.closeDB(con, prepStmt, rs);
        }
    }

    public void update(User pati) throws Exception {
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        try {
            con = DbConnecter.getDBconnection();
            prepStmt = con.prepareStatement(UPDATE_SQL);
            
            prepStmt.setString(1, pati.getId());
            prepStmt.setString(2, pati.getPassWord());
            prepStmt.setString(3, pati.getName());
            prepStmt.setString(4, pati.getSex());
            prepStmt.setInt(5, pati.getAge());
            prepStmt.setString(6, pati.getPhone());
            prepStmt.setString(7, pati.getEmail());
            prepStmt.setString(8, pati.getAddress());
            prepStmt.setString(9, pati.getId());
            int rowCount = prepStmt.executeUpdate();
            if (rowCount == 0) {
                throw new Exception("更新出错:User Id:" + pati.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbConnecter.closeDB(con, prepStmt, rs);
        }
    }
}
