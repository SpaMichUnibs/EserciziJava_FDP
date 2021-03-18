package it.unibs.studenti.puntoretta;

public class Punto {
	
	private double x;
	
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double distanzaDa(Punto punto) {
		return Math.sqrt(( Math.pow(this.x - punto.x, 2) + Math.pow(this.y - punto.y, 2) ));
	}
	
}