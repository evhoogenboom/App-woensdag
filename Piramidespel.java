
public class Piramidespel {
	public static void main(String[] args) {
		Deck deck = new Deck();
		//System.out.println(deck.deckAsList);
		//System.out.println(deck.deckAsList.get(51).type);
		Piramide pi = new Piramide();
		pi.makePiramid();
		System.out.println(pi.makePiramid()[2][3].type);
		
		
	}
}
