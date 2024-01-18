package edu.hz.io;
import java.lang.*;
import java.util.*;

abstract class Snake implements Moveable {

    private int xHead;
    private int yHead;
    Stack<int[]> tailPositions;
    private int length;
    private int[][] snake;
    private Direction dir;
    protected int speed;
    private int width;
    private int height;

    public Snake(int x, int y, int length, Direction dir, int width, int height) {
        snake = new int[height][width];
        this.tailPositions = new Stack<int[]>();
        switch (dir) {
            case UP:
                for (int i = length; i > -1; i--) {
                    tailPositions.push(new int[]{x, y + i});
                }
                break;
            case DOWN:
                for (int i = length; i > -1; i--) {
                    tailPositions.push(new int[]{x, y - i});
                }
                break;
            case LEFT:
                for (int i = length; i > -1; i--) {
                    tailPositions.push(new int[]{x + i, y});
                }
                break;
            case RIGHT:
                for (int i = length; i > -1; i--) {
                    tailPositions.push(new int[]{x - i, y});
                }
                break;
        }
        this.length = length;
        this.width = width;
        this.height = height;
        this.dir = dir;
        this.xHead = x;
        this.yHead = y;
    }
    @Override
    public void move() {
        switch (this.dir) {
            case UP:
                this.moveUp();
                break;
            case DOWN:
                this.moveDown();
                break;
            case LEFT:
                this.moveLeft();
                break;
            case RIGHT:
                this.moveRight();
                break;
        }
    }


    @Override
    public void moveLeft() {
        this.xHead--;
        this.snake[this.yHead][this.xHead] = 2;
        this.tailPositions.push(new int[]{this.xHead, this.yHead});
        this.tailPositions.removeFirst();
        this.dir = Direction.LEFT;
    }

    @Override
    public void moveRight() {
        this.xHead++;
        this.snake[this.yHead][this.xHead] = 2;
        this.tailPositions.push(new int[]{this.xHead, this.yHead});
        this.tailPositions.removeFirst();
        this.dir = Direction.RIGHT;
    }

    @Override
    public void moveUp() {
        this.yHead--;
        this.snake[this.yHead][this.xHead] = 2;
        this.tailPositions.push(new int[]{this.xHead, this.yHead});
        this.tailPositions.removeFirst();
        this.dir = Direction.UP;
    }

    @Override
    public void moveDown() {
        this.yHead++;
        this.snake[this.yHead][this.xHead] = 2;
        this.tailPositions.push(new int[]{this.xHead, this.yHead});
        this.tailPositions.removeFirst();
        this.dir = Direction.DOWN;
    }

    @Override
    public int getHeadX() {
        return this.xHead;
    }

    @Override
    public int getHeadY() {
        return this.yHead;
    }

    @Override
    public int getSpeed(){
        return this.speed;
    }

    public int[][] getSnake() {
        snake = new int[height][width];
        snake[this.yHead][this.xHead] = 2;
        for (int[] tailPosition : tailPositions) {
            snake[tailPosition[1]][tailPosition[0]] = 2;
        }

        return snake;
    }
}
