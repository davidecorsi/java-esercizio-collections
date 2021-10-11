/*
 * Creare una classe contatto. Ogni contatto ha i seguenti campi: nome, cognome e telefono
 */
public class Contatto {
	String nome;
	String cognome;
	String numero;
	
	public Contatto(String nome, String cognome, String numero) {
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String toString() {
		return this.nome + " " + this.cognome + ": " + this.numero;
	}
}
