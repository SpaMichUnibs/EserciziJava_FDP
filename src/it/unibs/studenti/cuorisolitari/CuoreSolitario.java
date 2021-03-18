package it.unibs.studenti.cuorisolitari;

public class CuoreSolitario {
	
	private static final int MAX_DIFF = 100;
	
	private static final String DESCRIZIONE = "Nome: %s, Sesso: %s, Eta': %s";
	
	private String alias;
	
	private char sesso;
	
	private int eta;
	
	public CuoreSolitario(String alias, char sesso, int eta) {
		this.alias = alias;
		this.sesso = sesso;
		this.eta = eta;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public char getSesso() {
		return sesso;
	}

	public void setSesso(char sesso) {
		this.sesso = sesso;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public String toString() {
		return String.format(DESCRIZIONE, alias, sesso, eta);
	}
	
	public boolean isAffine(CuoreSolitario cuoreSolitario) {
		return (this.sesso != cuoreSolitario.getSesso() && (Math.abs(this.eta - cuoreSolitario.getEta()) < MAX_DIFF)) ? true : false;
	}	
	
}
