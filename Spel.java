
public class Spel {
	
	//Deck deck = new Deck();
	
	void beginSpel(Deck deck) {
		Piramide piramide = new Piramide();
		piramide.makePiramid(deck);
	}
	
	void print(Kaart [][] piramide) {
		for(Kaart[] kaartarray : piramide) {
			for(Kaart kaart :kaartarray) {
				System.out.print(kaart.type+kaart.suit+" ");
				
			}System.out.println();
		}
	}
	
}
