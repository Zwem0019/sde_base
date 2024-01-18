package edu.hz.io;

public class FoodBuilder implements FoodBuilderInterface{
    private int x;
    private int y;
    private char symbol;
    private int points;

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }


    @Override
    public void setCheap() {
        this.points = 1;
    }

    @Override
    public void setExpensive() {
        this.points = 5;
    }

    public Food getResults() {
        return Food.getInstance(x, y, symbol, points);
    }

    @Override
    public void reset() {

        this.x = 0;
        this.y = 0;
        this.symbol = ' ';
        this.points = 0;
    }
}
