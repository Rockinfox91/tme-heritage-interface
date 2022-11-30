package exoForet;

public class TestForet {

	public static void main(String[] args) {
		Foret f = new Foret(10);
		
		for(int i = 0 ; i<10 ; i++) {
			Object obj;
			double x = Math.random();
			if(x<0.3) {
				obj = new Champignon("Cèpe");
			}
			else if(x<0.7){
				obj = new Arbre("Pins");
			}
			else if(x<0.9){
				obj = new Baie("Framboise");
			}
			else {
				obj = new ChampignonToxique("Amanite");
			}
			
			while(!f.placer(obj)) {}
		}
		
		System.out.println(f.toString());
		
		Panier p = new Panier(8);
		f.ramasser(p);

	}

}
