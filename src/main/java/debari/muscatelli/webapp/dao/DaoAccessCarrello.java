package debari.muscatelli.webapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import debari.muscatelli.webapp.model.Carrello;
import debari.muscatelli.webapp.model.Feedback;

public class DaoAccessCarrello {
	final String URL="jdbc:mysql://localhost:3307/db_agrifarmsrl";
	final String USER="root";
	final String PSSW="robb";
	Connection conn=null;
	final String INSERTCARR="INSERT INTO carrello(id_utente,id_strumento) VALUES(?,?)";
	final String SELECTTUTTO="SELECT id_oggetto,famiglia,marca,modello,costo FROM carrello inner join strumento on carrello.id_strumento=strumento.id_strumento where id_utente=? group by id_oggetto";
	final String COSTOTOT="SELECT utente.username, SUM(strumento.costo) AS costototale\r\n"
			+ "FROM strumento \r\n"
			+ "INNER JOIN carrello ON strumento.id_strumento = carrello.id_strumento \r\n"
			+ "INNER JOIN utente ON carrello.id_utente = utente.id_utente \r\n"
			+"WHERE utente.id_utente = ? \r\n"
			+ "GROUP BY utente.id_utente, utente.username" ;
	final String DELETEELEMENTO="DELETE FROM carrello where id_oggetto = ?";
	final String DELETECARR="DELETE FROM carrello";
	public Connection connessione() {
		try {
	        conn = DriverManager.getConnection(URL, USER, PSSW);	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void InserisciCarr(int id_str,int id_ut) {
		conn=connessione();
		try {
			PreparedStatement ps=conn.prepareStatement(INSERTCARR);
			ps.setInt(1, id_ut);
			ps.setInt(2, id_str);
		ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	public List<Carrello> VediTuttiOgg(int id){
		conn=connessione();
		List <Carrello> carrello = new ArrayList <>() ;
		try {
			PreparedStatement ps=conn.prepareStatement(SELECTTUTTO);
			ps.setInt(1,id);			
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				int id_oggetto=rs.getInt("id_oggetto");
				String famiglia= rs.getString("famiglia");
				String marca= rs.getString("marca");
				String modello= rs.getString("modello");
				int costo= rs.getInt("costo");
				carrello.add(new Carrello(id_oggetto,famiglia,marca,modello,costo));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return carrello;
	}
	public int SommaTotale(int idUtente) {
        int sommaTotale = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(COSTOTOT);
            ps.setInt(1, idUtente);
            rs = ps.executeQuery();
            if (rs.next()) {
                sommaTotale = rs.getInt("costototale");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sommaTotale;
    }
	public void EliminaOgg(int id) {
		conn=connessione();
		try {
			PreparedStatement ps=conn.prepareStatement(DELETEELEMENTO);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void EliminaTutto() {
		conn=connessione();
		try {
			PreparedStatement ps=conn.prepareStatement(DELETECARR);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
