package org.cquinto;

import org.cquinto.domain.Card;
import org.cquinto.domain.Deck;
import org.cquinto.domain.Value;

/**
 * Cristian Ezequiel Quinto
 */
public class MainApplication {
    public static void main(String[] args) {
        Deck deck = new Deck(new Card[52]);

        deck.initialize();

        Card computerCard = deck.getRandomCard();
        Card playerCard = deck.getRandomCard();

        System.out.printf("Computer: %s, Player: %s\n", computerCard, playerCard);

        int computerValue = getCardValue(computerCard.getValue());
        int playerValue = getCardValue(playerCard.getValue());

        if (computerValue > playerValue) {
            System.out.println("Perdiste");
        } else if (computerValue < playerValue) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Empate");
        }
    }

    private static int getCardValue(Value value) {
        int result;

        String currentValue = value.getType();

        switch (currentValue) {
            case "J":
                result = 11;
                break;
            case "Q":
                result = 12;
                break;
            case "K":
                result = 13;
                break;
            case "A":
                result = 14;
                break;
            default:
                result = Integer.parseInt(currentValue);
        }

        return result;
    }


}
