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

        Card computerCard = deck.getRandomCard();
        Card playerCard = deck.getRandomCard();

        System.out.printf("Computer: %s, Player: %s", computerCard, playerCard);
    }

}
