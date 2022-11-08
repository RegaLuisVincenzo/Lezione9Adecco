package lezione9Adecco;

public class starter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona1 persona=new Persona1();
		
		/*
		 * CHE COSE' L'INCAPSULAMENTO . GLI ATTRIBUTI  DIVENTATO PRIMAVATI , PERTANTO DOBBIAMO USARE DUE FUNZIONI
		 * 
		 * BIGHET - FARMELO  DIRE ---OTTONERE IL VALORE 
		 * SETT- METODI DI MODIFICARE IL VOLUME 
		 * QUESTI METODI SONO SEMPRE VOID
		 * I VOID HANNO SEMPRE DEI PARAMETRI 
		 * 
		 */
		
		System.out.println("################");
		System.out.println("Nome:"+ persona.getNome());
		System.out.println("Eta:"+ persona.getEta());
		System.out.println("################");
		persona.setNome("Mario");
		
		int eta= 18;
		
		persona.setEta(eta);
		
		
		System.out.println("Nome:"+ persona.getNome());
		System.out.println("Eta:"+ persona.getEta());
		
		System.out.println();
		
		persona.setEta(persona.getEta()+1);
		
	}

}
