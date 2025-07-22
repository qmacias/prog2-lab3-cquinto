package org.cquinto.domain;

public enum Suit {
    CLUBS('C'),
    DIAMONDS('D'),
    HEARTS('H'),
    SPADES('S');

    private final char symbol;

    Suit(char symbol) {
        this.symbol = symbol;
    }

    public Character getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.format("%s", symbol);
    }

}
