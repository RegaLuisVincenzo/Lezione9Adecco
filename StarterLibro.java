package lezione9Adecco;

import java.util.Scanner;

public class StarterLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		
		System.out.print("Titolo");
		String titolo=key.next();
		
		System.out.print("Autore");
		String autore=key.next();
		
		System.out.print("Numero Pagine");
		int numPaginie=key.nextInt();
		
		Libro book=new Libro(titolo, autore, numPaginie);
		
		System.out.println("Il Libro è "+book.toString()+", scritto da "+book.toString1()+" ed è  costituito da "+book.toString2()+"pagine");
		
		key.close();
	}

}
