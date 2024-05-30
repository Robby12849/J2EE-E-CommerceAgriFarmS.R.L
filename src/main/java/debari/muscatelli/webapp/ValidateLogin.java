package debari.muscatelli.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import debari.muscatelli.webapp.dao.DaoAccessAccessi;
import debari.muscatelli.webapp.dao.DaoAccessCarrello;
import debari.muscatelli.webapp.dao.DaoAccessUtenti;

/**
 * Servlet implementation class ValidateLogin
 */
@WebServlet("/validatelogin")
public class ValidateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String id = (String)session.getAttribute("id_strumento");
		int idStrumento=0;
		if (id!=null) {
		idStrumento = Integer.parseInt(id);
		}
		int userid=0;
		DaoAccessUtenti dao=new DaoAccessUtenti();
		DaoAccessAccessi dao1=new DaoAccessAccessi();
		DaoAccessCarrello dao2=new DaoAccessCarrello();
		if(dao.CheckCredentials(username, password))
		{
			dao1.InserisciAccesso(username, password);
			userid=dao.FoundId(username, password);		
			session.setAttribute("userid", userid);
			request.getRequestDispatcher("postregistrazione.jsp").forward(request, response);
			if(idStrumento!=0 ) {
			dao2.InserisciCarr(idStrumento, userid);
			}
		}
		else {
			
			response.sendRedirect("oggetti.jsp");
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
