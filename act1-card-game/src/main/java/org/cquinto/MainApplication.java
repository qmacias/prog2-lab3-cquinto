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

        System.out.printf("Computer: %s\nPlayer: %s\n\n", computerCard, playerCard);

        int computerValue = getCardValue(computerCard);
        int playerValue = getCardValue(playerCard);

        if (computerValue > playerValue) {
            System.out.println("Perdiste");
        } else if (computerValue < playerValue) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Empate");
        }
    }

    private static int getCardValue(Card card) {
        int result;

        switch (card.getValue()) {
            case JACK:
                result = 11;
                break;
            case QUEEN:
                result = 12;
                break;
            case KING:
                result = 13;
                break;
            case AS:
                result = 14;
                break;
            default:
                result = Integer.parseInt(card.getValue().getType());
        }

        return result;
    }


}
