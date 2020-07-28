package o9;

import java.util.Random;

public class CardDeck {

    Card[] cards = new Card[52];
    int cardIndex = 0;

    public CardDeck() {
        for (int i = 0; i < 13; i++) {
            cards[i] = new Card(Card.SPADES, i + 1);
            cards[i + 13] = new Card(Card.HEARTS, i + 1);
            cards[i + 26] = new Card(Card.DIAMONDS, i + 1);
            cards[i + 39] = new Card(Card.CLUBS, i + 1);
        }
    }

    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        while (deck.moreCards()) {
            System.out.println(deck.getCard());
        }
    }

    /**
     * Blandar kortleken
     */
    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            Card temp = cards[i];
            int randomIndex = random.nextInt(51);
            cards[i] = cards[randomIndex];
            cards[randomIndex] = temp;
        }
    }

    /**
     * Undersoker om det finns fler kort i kortleken
     */
    boolean moreCards() {
        int oldIndex = cardIndex;
        if (cardIndex > 51) {
            cardIndex = 0;
        }
        return oldIndex < 52;
    }

    /**
     * Drar det oversta kortet i leken
     */
    public Card getCard() {
        if (cardIndex >= cards.length) {
            return null;
        }
        Card card = cards[cardIndex];
        cardIndex++;
        return card;
    }

    public Card[] getCards() {
        return cards;
    }
}
