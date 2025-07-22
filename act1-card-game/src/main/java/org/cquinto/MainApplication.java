package org.cquinto;

import org.cquinto.domain.Card;
import org.cquinto.domain.Suit;
import org.cquinto.domain.Value;

/**
 * Cristian Ezequiel Quinto
 */
public class MainApplication {
    public static void main(String[] args) {
        Card card = new Card(Suit.DIAMONDS, Value.AS);

        System.out.println(card);
    }

}
