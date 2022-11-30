package exoForet;

import java.util.ArrayList;

public class Panier extends ArrayList<Ramassable>{
	private double poidsMax;
	
	public Panier(double poidsMax) {
		this.poidsMax = poidsMax;
	}
	
	public double getPoids() {
		double total=  0;
		for(Ramassable r : this) {
			total += r.getPoids();
		}
		
		return total;
	}
	
	@Override
	public boolean add(Ramassable r) {
		if(this.getPoids() + r.getPoids() > poidsMax) {
			System.out.println(r.toString()+" n'est pas rajouté au panier.");
			return false;
		}
		else {
			System.out.println(r.toString()+" est ajouté au panier.");
			super.add(r);
			return true;
		}
	}
	
	public int compterToxique() {
		int total = 0;
		for(Ramassable r : this) {
			if(r instanceof Toxique) {
				total ++;
			}
		}
		return total;
	}
	
	@Override
	public String toString() {
		return "Panier contenant " + this.size() + " objets, dont " + this.compterToxique()
		+" toxique (" + Math.round(this.getPoids()*10.0)/10.0 + "kg sur " + this.poidsMax + "kg).";
	}
}
