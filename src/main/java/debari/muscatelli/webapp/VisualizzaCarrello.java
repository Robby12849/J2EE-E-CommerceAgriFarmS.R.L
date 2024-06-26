package debari.muscatelli.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import debari.muscatelli.webapp.dao.DaoAccessCarrello;
import debari.muscatelli.webapp.model.Carrello;

/**
 * Servlet implementation class VisualizzaCarrello
 */
@WebServlet("/visualizzacarrello")
public class VisualizzaCarrello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualizzaCarrello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer userid = (Integer) session.getAttribute("userid"); 

		DaoAccessCarrello dao = new DaoAccessCarrello(); 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
		    if (userid != null) { 
		        List<Carrello> carrello = dao.VediTuttiOgg(userid.intValue()); 
		        int sum = dao.SommaTotale(userid.intValue()); 
		        session.setAttribute("carrello", carrello);
		        session.setAttribute("userid", userid);
		        session.setAttribute("sum", sum);
		        response.sendRedirect("carrello.jsp");
		    } else {
		        out.println("<script>alert('Fai Login!!');window.location.href='login.jsp';</script>");
		    }
		} catch (Exception e) {
		   
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
