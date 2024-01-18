package edu.hz.io;

public interface Moveable {
    public void moveLeft();
    public void moveRight();
    public void moveUp();
    public void moveDown();
    public void move();
    public int getHeadX();
    public int getHeadY();

    public int getSpeed();
}
