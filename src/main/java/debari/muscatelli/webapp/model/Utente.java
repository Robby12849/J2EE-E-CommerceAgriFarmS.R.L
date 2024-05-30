package debari.muscatelli.webapp.model;

import java.util.Objects;

public class Utente {
	int id_utente;
	String nome;
	String cognome;
	String username;
	String email;
	String pssw;
	String numerotel;
	String ruolo;	
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public int getId_utente() {
		return id_utente;
	}
	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPssw() {
		return pssw;
	}
	public void setPssw(String pssw) {
		this.pssw = pssw;
	}
	public String getNumerotel() {
		return numerotel;
	}
	public void setNumerotel(String numerotel) {
		this.numerotel = numerotel;
	}
	public Utente(String nome, String cognome, String username, String email, String pssw, String numerotel,
			String ruolo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.email = email;
		this.pssw = pssw;
		this.numerotel = numerotel;
		this.ruolo = ruolo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cognome, email, id_utente, nome, numerotel, pssw, ruolo, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		return Objects.equals(cognome, other.cognome) && Objects.equals(email, other.email)
				&& id_utente == other.id_utente && Objects.equals(nome, other.nome) && numerotel == other.numerotel
				&& Objects.equals(pssw, other.pssw) && Objects.equals(ruolo, other.ruolo)
				&& Objects.equals(username, other.username);
	}
	
}
