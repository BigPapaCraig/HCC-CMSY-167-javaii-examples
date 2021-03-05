package edu.howardcc.javaii.examples.collections.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Static convenience methods for working with Cards
 */
public class CardUtils {

    /**
     * Create a new deck of cards
      * @return a List<Card> representing a standard deck of 52 cards
     */
    public static List<Card> createDeck(){
        List<Card> cards = new ArrayList<>(52);

        // Populate
        for(Card.Suit suit: Card.Suit.values()) {
            for (Card.Face face: Card.Face.values()) {
                cards.add(new Card(face, suit));
            }
        }

        Collections.shuffle(cards);
        return cards;
    }

    /**
     * Print a list of cards in four columns
     */
    public static void printCards(List<Card> deck) {
        for (int i = 0; i < deck.size(); i++) {
            System.out.printf("%-19s%s", deck.get(i),
                    ((i+1)%4 == 0) ? System.lineSeparator() : "");
        }
    }

}
