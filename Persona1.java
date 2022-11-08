package lezione9Adecco;

public class Persona1 {
	
//	abbiamo due atributi 
	private String nome;
	private int eta;

	
//  questo metodo ci chiede di riprendere il nome 
	public String getNome() {
		return nome;
	}
//	andiamo a riprendere l'eta 
	public int getEta() {
		return eta;
	}
// andiamo a modificare il primo nome con il seondo nome utilizzando il secondo nome 	
	public void setNome(String nuovoNome) {
		nome=nuovoNome;
		
		if (nuovoNome.length()<3) {
			nome="";
			
		} else {
			nome=nuovoNome;

		}
		
	}
// modifichiamoanche l'eta 	
	public void setEta(int nuovaEta) {
		eta = nuovaEta >0 ? nuovaEta : -  nuovaEta ; // controllare il sinbolo - 
	}
	
	
	
//	andiamo a costruire la prima funzione 
	
	public void salutami() {
		System.out.println("ciao mi chiamo"+nome+"eta"+eta);
		
	}

}
