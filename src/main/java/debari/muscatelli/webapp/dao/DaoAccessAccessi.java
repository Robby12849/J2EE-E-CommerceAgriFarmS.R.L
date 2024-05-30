package debari.muscatelli.webapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAccessAccessi {
	final String URL="jdbc:mysql://localhost:3307/db_agrifarmsrl";
	final String USER="root";
	final String PSSW="robb";
	Connection conn=null;
	final String SELECTUT="select id_utente from utente where email=? and password=?";
	final String INSERTACC="insert into accesso(id_utente) VALUES(?)";
	public Connection connessione() {
		try {
	        conn = DriverManager.getConnection(URL, USER, PSSW);	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void InserisciAccesso(String username, String password) {
		conn=connessione();
        PreparedStatement pss = null;
        PreparedStatement psi = null;
		try {
			pss=conn.prepareStatement(SELECTUT);
	        pss.setString(1, username);
	        pss.setString(2, password);
	        ResultSet rs = pss.executeQuery();
	        if (rs.next()) {
                int id_utente = rs.getInt("id_utente");
                psi = conn.prepareStatement(INSERTACC);
                psi.setInt(1, id_utente);
                psi.executeUpdate();
            }
		}catch(SQLException e ) {
			e.printStackTrace();
		}
	}
	
	
}
