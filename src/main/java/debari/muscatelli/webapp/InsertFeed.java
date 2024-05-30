package debari.muscatelli.webapp;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import debari.muscatelli.webapp.dao.DaoAccessFeedback;
import debari.muscatelli.webapp.model.Feedback;

/**
 * Servlet implementation class InsertFeed
 */
@WebServlet(description = "Inserisce un Feedback", urlPatterns = {"/insertfeed"} )
public class InsertFeed extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertFeed() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DaoAccessFeedback dao = new DaoAccessFeedback();
        String nome= request.getParameter("nome");
        String cognome= request.getParameter("cognome");
        String acquisto= request.getParameter("acquisto");
        String contenuto = request.getParameter("contenuto");
        Feedback feed=new Feedback(nome,cognome,acquisto,contenuto);
        try {
            dao.InserisciFeed(feed);
            response.sendRedirect("feedback.jsp");
        } catch (SQLException e) {
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
