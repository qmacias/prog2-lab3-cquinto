package org.cquinto.domain;

public enum Value {
    TWO("2"), THREE("3"), FOUR("4"), FIVE("5"),
    SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"),
    TEN("10"), JACK("J"), QUEEN("Q"), KING("K"), AS("A");

    private final String type;

    Value(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("Value(type='%s')", type);
    }

}
