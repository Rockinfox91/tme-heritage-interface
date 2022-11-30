package exoForet;

import java.util.ArrayList;

public class Foret {
	public Object[][] terrain;
	
	public Foret(int taille) {
		this.terrain = new Object[taille][taille];
	}
	
	public boolean placer(Object obj) {
		int x = (int) (Math.random()*this.terrain.length);
		int y = (int) (Math.random()*this.terrain.length);
		
		if(terrain[x][y] == null) {
			terrain[x][y] = obj;
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String affiche = "";
		for(int i = 0; i<terrain.length ; i++) {
			affiche += "| ";
			for (int y = 0 ; y<terrain.length ; y++) {
				if(terrain[i][y]!=null) {
					affiche += terrain[i][y].toString().charAt(0) + " ";
				}
				else {
					affiche += "  ";
				}
			}
			affiche += "|\n";
		}
		return affiche;
	}
	
	public ArrayList<Champignon> ramasserChampignon(){
		ArrayList<Champignon> clist = new ArrayList<>();
		
		for(int i=0 ; i<terrain.length ; i++) {
			for (int j=0 ; j<terrain.length ; j++) {
				Object obj = terrain[i][j];
				
				if(obj == null) {continue;}
				if(obj instanceof Champignon) {
					clist.add((Champignon) obj);
				}
			}
		}
		
		return clist;
		
	}
	
	public ArrayList<Object> ramasserTout(){
		ArrayList<Object> clist = new ArrayList<>();
		
		for(int i=0 ; i<terrain.length ; i++) {
			for (int j=0 ; j<terrain.length ; j++) {
				Object obj = terrain[i][j];
				
				if(obj == null) {continue;}
				if(obj instanceof Ramassable) {
					clist.add((Champignon) obj);
				}
			}
		}
		
		return clist;
		
	}
}
