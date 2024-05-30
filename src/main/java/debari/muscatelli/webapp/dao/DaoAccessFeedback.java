package debari.muscatelli.webapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import debari.muscatelli.webapp.model.Feedback;

public class DaoAccessFeedback {
	// DB --tabella feed(id_feedback,nome,cognome,acquisto,contenuto,data)--
final String URL="jdbc:mysql://localhost:3307/db_agrifarmsrl";
final String USER="root";
final String PSSW="robb";
final String INSERTFEED="INSERT INTO feed(nome,cognome,acquisto,contenuto) VALUES (?,?,?,?);";
final String SELECTALL="SELECT nome,cognome,acquisto,contenuto,data from feed; ";
final String UPDATEFEED="update feed set contenuto= ? where id= ?;";
Connection conn=null;
public Connection connessione() {
	try {
        conn = DriverManager.getConnection(URL, USER, PSSW);	
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return conn;
}

public void InserisciFeed(Feedback feed) throws SQLException {
	conn=connessione();
	PreparedStatement ps=conn.prepareStatement(INSERTFEED);
	ps.setString(1, feed.getNome());
	ps.setString(2, feed.getCognome());
	ps.setString(3, feed.getAcquisto());
	ps.setString(4, feed.getContenuto());
	ps.executeUpdate();
}
public List<Feedback> VediTuttiFeed(){
	List <Feedback> feed = new ArrayList <>() ;
	conn=connessione();
	try {
		PreparedStatement ps=conn.prepareStatement(SELECTALL);
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			// visualizzo data contenuto acquisto nome  cognome utente 
			String data= rs.getString("data");
			String contenuto= rs.getString("contenuto");
			String acquisto= rs.getString("acquisto");
			String nome= rs.getString("nome");
			String cognome= rs.getString("cognome");
			feed.add(new Feedback(data,contenuto,nome,cognome,acquisto));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}	
	return feed;	
}

public boolean UpdateFeed(Feedback feed) throws SQLException {
    	boolean righe;
    	conn=connessione();
    	PreparedStatement ps= conn.prepareStatement(UPDATEFEED);
        ps.setString(1, feed.getContenuto());
        righe = ps.executeUpdate() > 0;    
    return righe;
}
}