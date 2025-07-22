package org.cquinto.domain;

import java.util.Arrays;

public final class Deck {
    private final Card[] cards;

    public Deck(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return String.format("Deck(cards='%s')", Arrays.toString(cards));
    }

}
