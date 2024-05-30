package debari.muscatelli.webapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import debari.muscatelli.webapp.model.Utente;

public class DaoAccessUtenti {
	final String URL="jdbc:mysql://localhost:3307/db_agrifarmsrl";
	final String USER="root";
	final String PSSW="robb";
	Connection conn=null;
	final String INSERT="INSERT INTO utente(nome,cognome,username,email,password,numerotel,ruolo) VALUES (?,?,?,?,?,?,?) ";
	final String VALID="SELECT email, password FROM utente";
	final String FOUNDID="SELECT id_utente FROM utente where email=? and password=?";
	public Connection connessione() {
		try {
	        conn = DriverManager.getConnection(URL, USER, PSSW);	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void InserisciUtenti(Utente reg) throws SQLException {
		conn=connessione();
		PreparedStatement ps=conn.prepareStatement(INSERT);
		ps.setString(1, reg.getNome());
		ps.setString(2, reg.getCognome());
		ps.setString(3, reg.getUsername());
		ps.setString(4, reg.getEmail());
		ps.setString(5, reg.getPssw());
		ps.setString(6, reg.getNumerotel());
		ps.setString(7, reg.getRuolo());
		ps.executeUpdate();
	}
	public boolean CheckCredentials(String username, String password) {
	    conn = connessione();
	    try {
	        PreparedStatement ps = conn.prepareStatement(VALID);
	        ResultSet rs = ps.executeQuery();
	        
	        while (rs.next()) {
	            String dbUsername = rs.getString("email");
	            String dbPassword = rs.getString("password");   
	            if (username.equals(dbUsername) && password.equals(dbPassword)) {
	                return true;
	            }
	        }
	        return false;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	public int FoundId(String email, String password ) {
		 conn = connessione();
		try  {
			PreparedStatement ps = conn.prepareStatement(FOUNDID);
            ps.setString(1, email);
            ps.setString(2, password);      
            try {
            	ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    return rs.getInt("id_utente");
                }
                }
                catch(SQLException e) {
                e.printStackTrace();	
                }
                
		}catch(SQLException e) {
            e.printStackTrace();	
            }
		return 0;
        }
	
}
	

	

