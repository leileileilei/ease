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
 * leileiServlet implementation class Ulookorderservlet
 */
@WebServlet("/Ulookorderservlet")
public class Ulookorderservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ulookorderservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		try{
			Order ord=new Order();
			String id=request.getParameter("id");
			ord.setId(id);
			OrderDAO ulookorderdao=new OrderDAO();			
			request.setAttribute("orderlist",ulookorderdao.findAll(ord));	//	
			request.getRequestDispatcher("ulookorder2.jsp").forward(request,response);
		}catch(Exception e){
			e.printStackTrace();
		}		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
