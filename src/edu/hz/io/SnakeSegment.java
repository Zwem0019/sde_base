package edu.hz.io;

public class SnakeSegment implements Moveable {
    private int x;
    private int y;

    public SnakeSegment(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }

    @Override
    public void moveUp() {
        this.y--;
    }

    @Override
    public void moveDown() {
        this.y++;
    }

    @Override
    public int getHeadX() {
        return this.x;
    }
    @Override
    public int getHeadY() {
        return this.y;
    }
}
