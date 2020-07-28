package o9;

public class Patience {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        int counting = 1;
        double fails = 0;
        int n = 100000;
        int tries = 0;
        while (tries != n) {
            deck.shuffle();
            while (deck.moreCards()) {
                if (counting > 3) {
                    counting = 1;
                }
                Card card = deck.getCard();
                if (counting == card.getRank()) {
                    fails++;
                    counting = 1;
                    break;
                }
                counting++;
            }
            tries++;
        }
        System.out.println("Fails = " + fails);
        System.out.println("P(fails) = " + (fails / n)/100);
        System.out.println("Correct P(fails) = 0.008165");
    }
}
