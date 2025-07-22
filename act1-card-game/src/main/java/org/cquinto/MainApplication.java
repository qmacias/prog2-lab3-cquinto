package org.cquinto;

import org.cquinto.domain.Card;
import org.cquinto.domain.Deck;

/**
 * Cristian Ezequiel Quinto
 */
public class MainApplication {
    public static void main(String[] args) {
        Deck deck = new Deck(new Card[52]);

        deck.initialize();

        deck.shuffle();

        System.out.println(deck);
    }

}
