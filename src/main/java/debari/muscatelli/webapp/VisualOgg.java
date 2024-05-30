package debari.muscatelli.webapp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import debari.muscatelli.webapp.dao.DaoAccessStrumenti;
import debari.muscatelli.webapp.model.Strumento;

/**
 * Servlet implementation class VisualOgg
 */
@WebServlet("/visualogg")
public class VisualOgg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualOgg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoAccessStrumenti dao=new DaoAccessStrumenti();
		String famiglia=request.getParameter("productValue");
	    List<Strumento> strumenti = dao.SelectStrum(famiglia);
	    HttpSession session = request.getSession();
	    session.setAttribute("strumenti", strumenti);
	    response.sendRedirect("oggetti.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
