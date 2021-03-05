package edu.howardcc.javaii.examples.collections.cards;

import java.util.Objects;

/**
 * Represents a playing PlayingCard
 */
public class Card implements Comparable<Card> {

    public enum Face {Ace(1), Deuce(2), Three(3), Four(4), Five(5), Six(6),
        Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13);

        private final int value;

        private Face(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    public enum Suit {Clubs, Diamonds, Hearts, Spades}

    private final Face face;
    private final Suit suit;

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", face, suit);
    }

    @Override
    /**
     * Compare two cards, first by face (ACE is low), 
     * then by suit (low to high: CLUBS, DIAMONDS, HEARTS, SPADES)
     */
    public int compareTo(Card other) {

        // If face values are identical, compare suit
        if (this.getFace().equals(other.getFace())){
            return this.getSuit().toString().compareTo(other.getSuit().toString());
        }

        // Otherwise, compare face
        Integer faceValueAsInteger = this.getFace().getValue();
        return faceValueAsInteger.compareTo(other.getFace().getValue());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.face);
        hash = 43 * hash + Objects.hashCode(this.suit);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        return true;
    }


}
