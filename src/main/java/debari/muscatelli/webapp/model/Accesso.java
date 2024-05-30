package debari.muscatelli.webapp.model;

import java.util.Objects;

public class Accesso {
		int id_accesso;
		String data; 
		int id_utente;
		public int getId_accesso() {
			return id_accesso;
		}
		public void setId_accesso(int id_accesso) {
			this.id_accesso = id_accesso;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public int getId_utente() {
			return id_utente;
		}
		public void setId_utente(int id_utente) {
			this.id_utente = id_utente;
		}
		@Override
		public int hashCode() {
			return Objects.hash(data, id_accesso, id_utente);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Accesso other = (Accesso) obj;
			return Objects.equals(data, other.data) && id_accesso == other.id_accesso && id_utente == other.id_utente;
		}
		public Accesso(int id_accesso, String data, int id_utente) {
			super();
			this.id_accesso = id_accesso;
			this.data = data;
			this.id_utente = id_utente;
		}
		public Accesso(int id_utente) {
			super();
			this.id_utente = id_utente;
		}
		
		
}
