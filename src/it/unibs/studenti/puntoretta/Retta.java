package it.unibs.studenti.puntoretta;

public class Retta {
	
	private Punto primoPunto;
	
	private Punto secondoPunto;
	
	private boolean isVerticale = false;
	
	private double a;
	
	private double b;
	
	private void definisciRetta() {
		if(this.isVerticale) {
			this.a = 0;
			this.b = primoPunto.getX();	
		} else {
			this.a = (secondoPunto.getY() - primoPunto.getY()) / (secondoPunto.getX() - primoPunto.getX());
			this.b = secondoPunto.getY() - this.a * secondoPunto.getX();
		}
	}
	
	public Retta(Punto primoPunto, Punto secondoPunto) {
		this.primoPunto = primoPunto;
		this.secondoPunto = secondoPunto;	
		if(primoPunto.getX() == secondoPunto.getY())
			this.isVerticale = true;
	}
	
	public String toString() {
		this.definisciRetta();
		
		if(this.isVerticale)
			return ("Equazione retta: y = " + this.b);		
		
		else if(this.a != 0 && this.b == 0)
			return ("Equazione retta: y = " + this.a + "x");	
		
		return ("Equazione retta: y = " + this.a + "x" + " + " + this.b);
	}
	
	public boolean isAppartenente(Punto p) {
		if((p.getY() == this.a * p.getX() + this.b))
			return true;
		return false;			
	}
	
}
