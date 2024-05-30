package debari.muscatelli.webapp.model;

import java.util.Objects;

public class Carrello {
	int id_oggetto;
    String Famiglia;
    String Marca;
    String Modello; 
    int costo;
	int id_utente;
	int id_strumento;
	public int getId_oggetto() {
		return id_oggetto;
	}
	public void setId_oggetto(int id_oggetto) {
		this.id_oggetto = id_oggetto;
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
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
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
	@Override
	public int hashCode() {
		return Objects.hash(Famiglia, Marca, Modello, costo, id_oggetto, id_strumento, id_utente);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrello other = (Carrello) obj;
		return Objects.equals(Famiglia, other.Famiglia) && Objects.equals(Marca, other.Marca)
				&& Objects.equals(Modello, other.Modello) && costo == other.costo && id_oggetto == other.id_oggetto
				&& id_strumento == other.id_strumento && id_utente == other.id_utente;
	}
	public Carrello(int id_oggetto,String famiglia, String marca, String modello, int costo) {
		super();
		this.id_oggetto=id_oggetto;
		Famiglia = famiglia;
		Marca = marca;
		Modello = modello;
		this.costo = costo;
	}
}
