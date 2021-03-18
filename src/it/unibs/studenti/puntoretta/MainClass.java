package it.unibs.studenti.puntoretta;
import java.util.Scanner;

public class MainClass {
	
	private static final String MSG_X = "Inserire la coordinata X del punto %d: ";
	private static final String MSG_Y = "Inserire la coordinata Y del punto %d: ";
	private static final String MSG_DISTANZA = "Distanza: %.2f";

	public static void main(String[] args) {
		var read = new Scanner(System.in);
		double x1, y1, x2, y2, x3, y3;
		Punto p1, p2, p3;
		Retta retta;
		double distanza;
		
		System.out.print(String.format(MSG_X, 1));
		x1 = read.nextDouble();
		
		System.out.print(String.format(MSG_Y, 1));
		y1 = read.nextDouble();
		
		System.out.print(String.format(MSG_X, 2));
		x2 = read.nextDouble();	
		
		System.out.print(String.format(MSG_Y, 2));
		y2 = read.nextDouble();
		
		p1 = new Punto(x1, y1);
		p2 = new Punto(x2, y2);		
		retta = new Retta(p1, p2);
		
		distanza = p1.distanzaDa(p2);
		
		System.out.println(String.format(MSG_DISTANZA, distanza));
		
		System.out.println(retta.toString());
		
		System.out.print(String.format(MSG_X, 3));
		x3 = read.nextDouble();		
		System.out.print(String.format(MSG_Y, 3));
		y3 = read.nextDouble();
		
		p3 = new Punto(x3, y3);
		
		if(retta.isAppartenente(p3)) {
			System.out.println("Il punto appartiene alla retta!");
		} else {
			System.out.println("Il punto non appartiene alla retta!");
		}
			
		read.close();
	}

}
