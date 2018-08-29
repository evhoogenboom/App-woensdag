import java.util.ArrayList;

public class Piramide {
	Kaart[][] piramide;
	
	
	Kaart[][] makePiramid(Deck deck) {
		ArrayList cards = deck.deckAsList;
		
		Kaart[][] piramide = new Kaart[6][];
		for(int i=0, j= 6;i<6;i++,j--) {
			//piramide[i]=   (Kaart[]) cards.subList(0, j).toArray();
			//cards=(ArrayList) cards.subList(j, cards.size());
			//piramide[i]=new Kaart[j];	
			piramide[i]=new Kaart[j];
			for(int x=0;x<piramide[i].length;x++) {
				piramide[i][x]= (Kaart) cards.get(0);
				cards.remove(0);
				
				
			}
			}
		return piramide;
			
	}
	
	
}
