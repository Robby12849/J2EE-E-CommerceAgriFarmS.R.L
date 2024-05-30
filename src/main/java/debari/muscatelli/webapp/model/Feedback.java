package debari.muscatelli.webapp.model;

import java.util.Objects;

public class Feedback {
	int ID;
	String contenuto;
	String nome;
	String cognome;
	String acquisto;
	String dataora;
	public Feedback(String dataora,String contenuto, String nome, String cognome, String acquisto) {
		super();
		this.contenuto = contenuto;
		this.nome = nome;
		this.cognome = cognome;
		this.acquisto = acquisto;
		this.dataora=dataora;
	}
	public Feedback(String contenuto, String nome, String cognome, String acquisto) {
		super();
		this.contenuto = contenuto;
		this.nome = nome;
		this.cognome = cognome;
		this.acquisto = acquisto;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getContenuto() {
		return contenuto;
	}
	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getAcquisto() {
		return acquisto;
	}
	public void setAcquisto(String acquisto) {
		this.acquisto = acquisto;
	}
	public String getDataora() {
		return dataora;
	}
	public void setDataora(String dataora) {
		this.dataora = dataora;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ID, acquisto, cognome, contenuto, dataora, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feedback other = (Feedback) obj;
		return ID == other.ID && Objects.equals(acquisto, other.acquisto) && Objects.equals(cognome, other.cognome)
				&& Objects.equals(contenuto, other.contenuto) && Objects.equals(dataora, other.dataora)
				&& Objects.equals(nome, other.nome);
	}	
}
