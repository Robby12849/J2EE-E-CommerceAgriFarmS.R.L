package debari.muscatelli.webapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import debari.muscatelli.webapp.model.Feedback;
import debari.muscatelli.webapp.model.Strumento;

public class DaoAccessStrumenti {
	// strumenti(id_strumento,marca,famiglia,costo,foto,potenza_cv,modello) 
	final String URL="jdbc:mysql://localhost:3307/db_agrifarmsrl";
	final String USER="root";
	final String PSSW="robb";
	Connection conn=null;
	// query 
	final String SELECTALL ="select id_strumento,marca,famiglia,costo,foto,potenza_cv,modello from strumento ";
	final String SELECTFAM ="select id_strumento,marca,famiglia,costo,foto,potenza_cv,modello from strumento where famiglia = ?";
	
	public Connection connessione() {
		try {
	        conn = DriverManager.getConnection(URL, USER, PSSW);	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public List<Strumento> VediTuttiStr(){
		List <Strumento> str = new ArrayList <>() ;
		conn=connessione();
		try {
			PreparedStatement ps=conn.prepareStatement(SELECTALL);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				// visualizzo  marca,famiglia e costo
				int id_strumento=rs.getInt("id_strumento") ;
				String famiglia= rs.getString("famiglia");
				String marca= rs.getString("marca");
				int costo= rs.getInt("costo");
				String linkfoto = rs.getString("foto");
				int potenza= rs.getInt("potenza_cv");
				String modello = rs.getString("modello");
				str.add(new Strumento(id_strumento,marca,famiglia,costo,linkfoto,potenza,modello));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return str;	
	}
	public List<Strumento> SelectStrum(String fam) {
		List <Strumento> str = new ArrayList <>() ;
        conn = connessione();
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(SELECTFAM); 
            preparedStatement.setString(1, fam);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
            	int id_strumento=rs.getInt("id_strumento") ;
				String marca= rs.getString("marca");
				String famiglia= rs.getString("famiglia");
				int costo= rs.getInt("costo");
				String linkfoto = rs.getString("foto");
				int potenza= rs.getInt("potenza_cv");
				String modello = rs.getString("modello");
			    str.add(new Strumento(id_strumento,marca,famiglia,costo,linkfoto,potenza,modello));
            }
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        return str;
    }
	
}
