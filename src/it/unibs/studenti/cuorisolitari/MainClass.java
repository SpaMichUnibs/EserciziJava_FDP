package it.unibs.studenti.cuorisolitari;
import it.unibs.fp.mylib.InputDati;

public class MainClass {
	
	//COSTANTI
	public static final String MSG_ALIAS = "Inserire uno pseudonimo: ";
	public static final String MSG_SESSO = "Inserire il sesso(M, F): ";
	public static final String MSG_ETA = "Inserire l'eta': ";
	public static final String MSG_AFFINE = "L'utente %s e' compatibile con l'utente %s, complimenti!";
	public static final String MSG_NON_AFFINE = "L'utente %s non e' compatibile con l'utente %s, mi dispiace...";
	
	//METODI 
	public static void benvenuti() {
		System.out.println("*****************************************  CUORI SOLITARI  *****************************************");
		System.out.println("| Benvenuti in cuori solitari, il programma che vi aiuta a stabilire la vostra affinita' di coppia |");
		System.out.println("****************************************************************************************************");
	}
	
	public static CuoreSolitario creaUtente(int nUtente) {
		System.out.println("<=== UTENTE " + nUtente + " ===>");
		String alias = InputDati.leggiStringaNonVuota(String.format(MSG_ALIAS));
		char sesso = InputDati.leggiUpperChar(String.format(MSG_SESSO), "M, F");
		int eta = InputDati.leggiInteroNonNegativo(String.format(MSG_ETA));
		return new CuoreSolitario(alias, sesso, eta);
	}
	
	public static void horizontalLine() {
		System.out.println("====================================================================================================");
	}
	
	//MAIN 
	public static void main(String[] args) {
		benvenuti();
		CuoreSolitario c1 = creaUtente(1);
		horizontalLine();	
		CuoreSolitario c2 = creaUtente(2);
		horizontalLine();
		
		if(c1.isAffine(c2)) {
			System.out.println(String.format(MSG_AFFINE, c1.getAlias(), c2.getAlias()));
		} else {
			System.out.println(String.format(MSG_NON_AFFINE, c1.getAlias(), c2.getAlias()));
		}
		
	}

}
