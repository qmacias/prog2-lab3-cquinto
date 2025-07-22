package org.cquinto;

import org.cquinto.domain.Card;
import org.cquinto.domain.Deck;
import org.cquinto.domain.Suit;
import org.cquinto.domain.Value;

/**
 * Cristian Ezequiel Quinto
 */
public class MainApplication {
    public static void main(String[] args) {
        int index = 0;
        Card[] cards = new Card[52];

        Suit[] suitSymbols = Suit.values();
        Value[] valueTypes = Value.values();

        for (Suit symbol : suitSymbols) {
            for (Value value : valueTypes) {
                cards[index] = new Card(symbol, value);
                index++;
            }
        }

        Deck deck = new Deck(cards);

        System.out.println(deck);
    }

}
