package org.cquinto.domain;

public enum Suit {
    CLOVER('C'),
    DIAMONDS('D'),
    HEARTS('H'),
    SWORDS('S');

    private final Character symbol;

    Suit(Character symbol) {
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
