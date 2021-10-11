import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Creare una classe Rubrica che al suo interno raccoglie una lista di contatti. La classe memorizza i 
 * contatti nella lista. Definire i vari metodi.
 */

public class Rubrica {
	
	private List<Contatto> contatti;
	
	public Rubrica() {
		this.contatti = new ArrayList<Contatto>();
	}
	
	void aggiungiContatto(String nome, String cognome, String telefono) {
		this.contatti.add(new Contatto(nome, cognome, telefono));
	}
	
	void rimuoviContatto(String nome, String cognome) {
		Iterator<Contatto> it = this.contatti.iterator();
		while(it.hasNext()){
			Contatto c = it.next();
			if(c.getNome().equals(nome)&& c.getCognome().equals(cognome)) {
				it.remove();
			}
		}
	}
	
	public String cerca(String nome, String cognome) {
		String numero = null;
		Iterator<Contatto> it = this.contatti.iterator();
		while(it.hasNext() && numero == null) {
			Contatto c = it.next();
			if(c.getNome().equals(nome) && c.getCognome().equals(cognome)) {
				numero = c.getNumero();
			}
		}
		return numero;
	}
	
	public String toString() {
		String s = "Rubrica\n";
		s += "---------------------------\n";
		Iterator<Contatto> it = this.contatti.iterator();
		while(it.hasNext()) {
			Contatto c = it.next();
			s += c.toString() + "\n";
		}
		return s;
	}
}
