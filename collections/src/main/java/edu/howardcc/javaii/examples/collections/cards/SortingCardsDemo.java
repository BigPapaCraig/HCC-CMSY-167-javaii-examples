package edu.howardcc.javaii.examples.collections.cards;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates sorting
 */
public class SortingCardsDemo {

    public static void main(String[] args) {

        // Create and print a shuffled deck of cards
        List<Card> deckOfCards = CardUtils.createDeck();
        System.out.println("Shuffled Cards:");
        CardUtils.printCards(deckOfCards);

        // Sort using natural ordering (compareTo)
        Collections.sort(deckOfCards);
        System.out.println("\n\nNatural Ordering (compareTo):");
        CardUtils.printCards(deckOfCards);

        // Sort using custom comparator (suit, then rank)
        Collections.sort(deckOfCards, new Comparator<Card>(){
            public int compare(Card card1, Card card2) {

                // If suits are identical, compare ranks
                if (card1.getSuit().equals(card2.getSuit())) {
                    return Integer.valueOf(card1.getFace().getValue())
                            .compareTo(card2.getFace().getValue());
                }

                // Otherwise, compare suits
                return card1.getSuit().compareTo(card2.getSuit());
            }
        });
        System.out.println("\n\nSpecific Comparator:");
        CardUtils.printCards(deckOfCards);
    }

}
