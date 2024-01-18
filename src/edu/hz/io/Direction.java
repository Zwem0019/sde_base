package edu.hz.io;

public enum Direction {

    UP,
    DOWN,
    LEFT,
    RIGHT;

    public static Direction getDirection(String direction) {
        return switch (direction) {
            case "w" -> UP;
            case "s" -> DOWN;
            case "a" -> LEFT;
            case "d" -> RIGHT;
            default -> null;
        };
    }
}
