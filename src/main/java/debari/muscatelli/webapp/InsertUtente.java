package debari.muscatelli.webapp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import debari.muscatelli.webapp.dao.DaoAccessUtenti;
import debari.muscatelli.webapp.model.Utente;

/**
 * Servlet implementation class InsertUtente
 */
@WebServlet("/insertutente")
public class InsertUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertUtente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String nome = request.getParameter("nome");
	    String cognome = request.getParameter("cognome");
	    String username = request.getParameter("username");
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");
	    String telefono = request.getParameter("telefono");
	    String ruolo="utente";
	    DaoAccessUtenti dao=new DaoAccessUtenti();
		Utente reg=new Utente(nome,cognome,username,email,password,telefono,ruolo);
		try {
			dao.InserisciUtenti(reg);
			response.sendRedirect("login.jsp");
		} catch (SQLException e) {
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
