package debari.muscatelli.webapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import debari.muscatelli.webapp.model.Acquisto;


public class DaoAccessAcquisti {
	final String URL="jdbc:mysql://localhost:3307/db_agrifarmsrl";
	final String USER="root";
	final String PSSW="robb";
	Connection conn=null;
	final String SELECTACQUISTIPERS="select utente.username,strumento.famiglia,strumento.marca,strumento.modello,strumento.costo from acquisto inner join strumento on acquisto.id_strumento=strumento.id_strumento \r\n"
			+ "inner join utente on utente.id_utente=acquisto.id_utente\r\n"
			+ "where utente.id_utente = ?\r\n"
			+"GROUP BY acquisto.id_acquisto\r\n"
			+ "ORDER BY acquisto.id_acquisto DESC";
	
	final String INSERTACQ="INSERT INTO acquisto(id_utente,id_strumento,costototale) VALUES (?,?,?) ";
	final String SELECTCARR="SELECT id_utente,carrello.id_strumento,costo from carrello inner join strumento on carrello.id_strumento=strumento.id_strumento";
	public Connection connessione() {
		try {
	        conn = DriverManager.getConnection(URL, USER, PSSW);	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public List<Acquisto> SelectPersAcq(int id){
		List <Acquisto> acq = new ArrayList <>() ;
		conn=connessione();
		try {
			PreparedStatement ps=conn.prepareStatement(SELECTACQUISTIPERS);
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				String user= rs.getString("username");
				String famiglia= rs.getString("famiglia");
				String marca= rs.getString("marca");
				String modello= rs.getString("modello");
				int costo=rs.getInt("costo");
				acq.add(new Acquisto(user,famiglia,marca,modello,costo));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return acq;
	}

	public void InserisciAcquistiDaCarrello() {
		PreparedStatement ss = null;
		PreparedStatement is = null;
		ResultSet rs = null;

		try {
		    // Ottieni la connessione
		    conn = connessione();
		    ss = conn.prepareStatement(SELECTCARR);
		    rs = ss.executeQuery();
		    is = conn.prepareStatement(INSERTACQ);
		    while (rs.next()) {
		        int id_utente = rs.getInt("id_utente");
		        int id_strumento = rs.getInt("id_strumento");
		        int costo = rs.getInt("costo");
		        is.setInt(1, id_utente);
		        is.setInt(2, id_strumento);
		        is.setInt(3, costo);
		        is.executeUpdate();
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    
	    }
	}
	
