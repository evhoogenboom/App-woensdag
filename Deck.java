import java.util.*;


public class Deck {

	Kaart[] deck;
	ArrayList<Kaart> deckAsList;
	
	Deck(){
		makeDeck();
		deckAsList = new ArrayList<Kaart>(Arrays.asList(deck));
		Collections.shuffle(deckAsList);
	}
	 
	void makeDeck() {
		deck = new Kaart[52];
		String[] suits = {"H","S","R","K"};
		String[] types = {"Boer", "Vrouw", "Koning", "Aas"};
		int addition = 0;
		for (String suit : suits) {
			int index = 0;
			for (int i=0, j=2; i<13; i++, j++) {
				String type;
				if (i<9) {
					type = Integer.toString(j);
				} else {
					type = types[index++];
					if (type.equals("Aas")) {
					}
				}
				Kaart card = new Kaart(suit,type);
				deck[i+addition] = card;
			}
			addition += 13;
		}
	} 
}
