package org.cquinto.domain;

public enum Suit {
    CLOVER('C'),
    DIAMONDS('D'),
    HEARTS('H'),
    SWORDS('S');

    private final char symbol;

    Suit(char symbol) {
        this.symbol = symbol;
    }

    public Character getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.format("Suit(symbol='%s')", symbol);
    }

}
