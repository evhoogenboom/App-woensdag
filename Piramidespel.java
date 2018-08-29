
public class Piramidespel {
	public static void main(String[] args) {
		Deck deck = new Deck();
		//System.out.println(deck.deckAsList);
		//System.out.println(deck.deckAsList.get(51).type);
		Piramide pi = new Piramide();
		//pi.makePiramid(deck);
		//System.out.println(pi.makePiramid()[2][3].type);
		Spel spel = new Spel();
		//spel.beginSpel(deck);
		spel.print(pi.makePiramid(deck));
		
	}
}
