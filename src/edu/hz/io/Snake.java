package edu.hz.io;
import java.lang.*;
import java.util.*;

public class Snake implements Moveable {

    private int xHead;
    private int yHead;
    Stack<int[]> tailPositions;
    private int length;
    private int[][] snake;
    private Direction dir;

    private int width;
    private int height;

    public static Snake instance;

    public static Snake getInstance(int x, int y, int length, Direction dir, int width, int height) {
        if(Snake.instance == null) {
            Snake.instance = new Snake(x, y, length, dir, width, height);
        }
        return Snake.instance;
    }
    private Snake(int x, int y, int length, Direction dir, int width, int height) {
        snake = new int[height][width];
        switch (dir) {
            case UP:
                for (int i = 0; i < length; i++) {
                    snake[y + i][x] = 2;
                }
                break;
            case DOWN:
                for (int i = 0; i < length; i++) {
                    snake[y - i][x] = 2;
                }
                break;
            case LEFT:
                for (int i = 0; i < length; i++) {
                    snake[y][x + i] = 2;
                }
                break;
            case RIGHT:
                for (int i = 0; i < length; i++) {
                    snake[y][x - i] = 2;
                }
                break;
        }
        this.length = length;
        this.tailPositions = new Stack<int[]>();
        for (int i = 0; i < length; i++) {
            tailPositions.push(new int[]{x, y});
        }
        this.width = width;
        this.height = height;

        this.dir = dir;
        this.xHead = x;
        this.yHead = y;
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

    public int[][] getSnake() {
        snake = new int[height][width];
        snake[this.yHead][this.xHead] = 2;
        for (int[] tailPosition : tailPositions) {
            snake[tailPosition[1]][tailPosition[0]] = 2;
        }
        return snake;
    }
}
