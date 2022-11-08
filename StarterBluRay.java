package lezione9Adecco;

import java.util.Scanner;

public class StarterBluRay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);

		
		System.out.println("titolo");
		String titolo = key.next();
		
		
		System.out.println("INSERISCI UN GENERE");
		String genere = key.next();
		
		System.out.println("INSERISCI durata");
		double durata = key.nextDouble();
		
		System.out.println("is for family ?");
		boolean isForF = key.nextBoolean();

		
		BluRay bluRay = new BluRay(titolo, durata, genere, isForF);
		
		System.out.println(bluRay);
		System.out.println(bluRay.toString());
		
		key.close();
	}

}
