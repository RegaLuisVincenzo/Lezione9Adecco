package lezione9Adecco;
/**
 * 
 * TITOLO
 * AUTORE 
 * NUMERO DI PAGINE
 * 
 * 
 * 
 * @author SVILU
 *
 */

public class Libro {

	private String titolo;
	private String autore;
	private int numPagine;
	
	public Libro() {
		settitolo("");
		setautore("");
		setnumPagine(0);
	}

	@Override
	public String toString() {
		return titolo;
	}
	public String toString1() {
		return autore;
	}
	public int toString2() {
		return numPagine;
	}

	public Libro(String titolo,String autore, int numPagine) {

		settitolo(titolo);
		setautore(autore);
		setnumPagine(numPagine);
	}
	
//	GET
	public String gettitolo() {
		return titolo;
	}
	public String getautore() {
		return autore ;
	}
	public int getnumPagine() {
		return numPagine;
	}
// SET 
	public void settitolo(String titolo) {
		this.titolo=titolo;
	}
	public void setautore(String autore) {
		this.autore=autore;
	}
	public void setnumPagine(int numPagine){
		this.numPagine= numPagine > 0 ? numPagine : - numPagine;
	}

}
