package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Order;
import dao.OrderDAO;

/**
 * Leilei Servlet implementation class Bservlet
 */
@WebServlet("/Oservlet")
public class Oservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Oservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String text=request.getParameter("text");
		int mnum=Integer.parseInt(request.getParameter("mnum"));
		String remark=request.getParameter("remark");
		
		Order ord=new Order();
		ord.setId(id);
		ord.setText(text);
		ord.setMnum(mnum);
		ord.setRemark(remark);
		
		OrderDAO odao=new OrderDAO();
		try {
			odao.create(ord);
			response.sendRedirect("Chinamed.html");
			
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
