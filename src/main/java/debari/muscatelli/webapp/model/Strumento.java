package debari.muscatelli.webapp.model;

import java.util.Objects;

public class Strumento {
	// marca,famiglia,costo,foto,potenza
	int id_strumento;
	String marca;
	String famiglia;
	int costo;
	String linkfoto;
	int potenza;
	String modello;
	public int getId_strumento() {
		return id_strumento;
	}
	public void setId_strumento(int id_strumento) {
		this.id_strumento = id_strumento;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getFamiglia() {
		return famiglia;
	}
	public void setFamiglia(String famiglia) {
		this.famiglia = famiglia;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public String getLinkfoto() {
		return linkfoto;
	}
	public void setLinkfoto(String linkfoto) {
		this.linkfoto = linkfoto;
	}
	public int getPotenza() {
		return potenza;
	}
	public void setPotenza(int potenza) {
		this.potenza = potenza;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	@Override
	public int hashCode() {
		return Objects.hash(costo, famiglia, id_strumento, linkfoto, marca, modello, potenza);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Strumento other = (Strumento) obj;
		return costo == other.costo && Objects.equals(famiglia, other.famiglia) && id_strumento == other.id_strumento
				&& Objects.equals(linkfoto, other.linkfoto) && Objects.equals(marca, other.marca)
				&& Objects.equals(modello, other.modello) && potenza == other.potenza;
	}
	public Strumento(int id_strumento,String marca, String famiglia, int costo, String linkfoto, int potenza, String modello) {
		super();
		this.id_strumento=id_strumento;
		this.marca = marca;
		this.famiglia = famiglia;
		this.costo = costo;
		this.linkfoto = linkfoto;
		this.potenza = potenza;
		this.modello = modello;
	}
	
}
