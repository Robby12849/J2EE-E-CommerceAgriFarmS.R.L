package debari.muscatelli.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import debari.muscatelli.webapp.dao.DaoAccessAcquisti;
import debari.muscatelli.webapp.dao.DaoAccessCarrello;

/**
 * Servlet implementation class AcquistaInsert
 */
@WebServlet("/acquistainsert")
public class AcquistaInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcquistaInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String id = (String)session.getAttribute("id_utente");
		int idInt=0;
		if(id != null) {
		idInt = Integer.parseInt(id);
		}
		else {
			response.sendRedirect("login.jsp");
		}
		DaoAccessAcquisti dao=new DaoAccessAcquisti();
		DaoAccessCarrello dao1=new DaoAccessCarrello();
		dao.InserisciAcquistiDaCarrello();
		dao1.EliminaTutto();
		dao1.UpdateCarrello(idInt);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<script>alert('Acquito effettuato con successo!')</script>");
		response.sendRedirect("visualacquisti");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
