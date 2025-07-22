package org.cquinto.domain;

import java.util.Arrays;
import java.util.Random;

public final class Deck {
    private final Card[] cards;
    private final Random generator = new Random();

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

    public Card getRandomCard() {
        shuffle();

        return cards[generate()];
    }

    private void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int randomIndex = generate();

            Card temp = cards[i];

            cards[i] = cards[randomIndex];

            cards[randomIndex] = temp;
        }
    }

    private int generate() {
        return generator.nextInt(cards.length);
    }

    @Override
    public String toString() {
        return String.format("Deck(cards='%s')", Arrays.toString(cards));
    }

}
