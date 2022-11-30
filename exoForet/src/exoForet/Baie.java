package exoForet;

public class Baie implements Ramassable {
	private double poids;
	private String name;
	
	public Baie(String nom) {
		this.name = nom;
		this.poids = (Math.random());
	}
	
	@Override
	public String toString() {
		return this.name + " " + Math.round(this.poids*10.0)/10.0 + "kg";
	}

	@Override
	public double getPoids() {
		return this.poids;
	}

}
