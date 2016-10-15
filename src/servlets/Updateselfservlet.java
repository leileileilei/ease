package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;
import dao.UserDAO;

/**
 * Leilei Servlet implementation class Updateselfservlet
 */
@WebServlet("/Updateselfservlet")
public class Updateselfservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updateselfservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * leilei'pc @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String passWord=request.getParameter("passWord");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		int age=Integer.parseInt(request.getParameter("age"));
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		User pati=new User();
		pati.setId(id);
		pati.setPassWord(passWord);
		pati.setName(name);
		pati.setSex(sex);
		pati.setAge(age);
		pati.setPhone(phone);
		pati.setAddress(address);		
		pati.setEmail(email);
		UserDAO userd = new UserDAO();
		try {
			userd.update(pati);
			response.sendRedirect("mained.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
