package debari.muscatelli.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import debari.muscatelli.webapp.dao.DaoAccessCarrello;

/**
 * Servlet implementation class SumCosto
 */
@WebServlet("/sumcosto")
public class SumCosto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumCosto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		String id1 =(String) session.getAttribute("userid");
		int id = Integer.parseInt(id1);
		DaoAccessCarrello carrello= new DaoAccessCarrello();
		int somma=carrello.SommaTotale(id);
		session.setAttribute("somma", somma);
		response.sendRedirect("carrello.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
