package exoForet;

public class TestForet {

	public static void main(String[] args) {
		Foret f = new Foret(10);
		
		for(int i = 0 ; i<10 ; i++) {
			Object obj;
			if(Math.random()<0.7) {
				obj = new Champignon("Cèpe");
			}
			else {
				obj = new Arbre("Pins");
			}
			
			while(!f.placer(obj)) {}
		}
		
		System.out.println(f.toString());
		System.out.println(f.ramasserChampignon());

	}

}
