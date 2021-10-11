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
	}
	
	void rimuoviContatto(String nome, String cognome) {
	}
	
	public String cerca(String nome, String cognome) {
	}
	
	public String toString() {
	}
}
