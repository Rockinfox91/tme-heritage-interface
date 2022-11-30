package exoForet;

public class Champignon implements Ramassable{
	private String nom;
	private double poids;
	
	public Champignon(String nom) {
		this.nom = nom;
		this.poids = (Math.random()*3);
	}
	
	public double getPoids() {
		return poids;
	}
	
	@Override
	public String toString() {
		return this.nom + " " + Math.round(this.poids*10.0)/10.0 + "kg";
	}
}
