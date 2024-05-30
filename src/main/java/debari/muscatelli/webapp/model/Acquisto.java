package debari.muscatelli.webapp.model;

import java.util.Objects;

public class Acquisto {
	int id_acquisto;
	int id_utente; 
	int id_strumento;
	String username;
    String Famiglia;
    String Marca;
    String Modello;
    int costo;
	String dataora;
	public int getId_acquisto() {
		return id_acquisto;
	}
	public void setId_acquisto(int id_acquisto) {
		this.id_acquisto = id_acquisto;
	}
	public int getId_utente() {
		return id_utente;
	}
	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
	}
	public int getId_strumento() {
		return id_strumento;
	}
	public void setId_strumento(int id_strumento) {
		this.id_strumento = id_strumento;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFamiglia() {
		return Famiglia;
	}
	public void setFamiglia(String famiglia) {
		Famiglia = famiglia;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModello() {
		return Modello;
	}
	public void setModello(String modello) {
		Modello = modello;
	}
	public String getDataora() {
		return dataora;
	}
	public void setDataora(String dataora) {
		this.dataora = dataora;
	}
	
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Famiglia, Marca, Modello, costo, dataora, id_acquisto, id_strumento, id_utente, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Acquisto other = (Acquisto) obj;
		return Objects.equals(Famiglia, other.Famiglia) && Objects.equals(Marca, other.Marca)
				&& Objects.equals(Modello, other.Modello) && costo == other.costo
				&& Objects.equals(dataora, other.dataora) && id_acquisto == other.id_acquisto
				&& id_strumento == other.id_strumento && id_utente == other.id_utente
				&& Objects.equals(username, other.username);
	}
	public Acquisto(String username, String famiglia, String marca,String modello,int costo) {
		super();
		this.username = username;
		Famiglia = famiglia;
		Marca = marca;
		Modello = modello;
		this.costo=costo;
	}

	
}
