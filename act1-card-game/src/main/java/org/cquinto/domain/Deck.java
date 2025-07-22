package org.cquinto.domain;

import java.util.Arrays;
import java.util.Random;

public final class Deck {
    private final Card[] cards;

    public Deck(Card[] cards) {
        this.cards = cards;
    }

    public void initialize() {
        int index = 0;

        Suit[] suitSymbols = Suit.values();

        Value[] valueTypes = Value.values();

        for (Suit symbol : suitSymbols) {
            for (Value value : valueTypes) {
                cards[index] = new Card(symbol, value);

                index++;
            }
        }
    }

    public void shuffle() {
        Random random = new Random();

        for (int i = 0; i < cards.length; i++) {
            int randomIndex = random.nextInt(cards.length);

            Card temp = cards[i];

            cards[i] = cards[randomIndex];

            cards[randomIndex] = temp;
        }
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return String.format("Deck(cards='%s')", Arrays.toString(cards));
    }

}
