package edu.hz.io;

public class Bitmap {
    private int[][] bitmap;
    private int width, height;

    public Bitmap(int width, int height) {
        this.width = width;
        this.height = height;
        this.bitmap = new int[height][width];
    }


    public void setWalls() {
        for (int i = 0; i < this.height; i++) {
            this.bitmap[i][0] = 9;
        }
        for (int i = 0; i < this.width; i++) {
            this.bitmap[0][i] = 9;
        }
        for (int i = 0; i < this.height; i++) {
            this.bitmap[i][this.width - 1] = 9;
        }
        for (int i = 0; i < this.width; i++) {
            this.bitmap[this.height - 1][i] = 9;
        }

    }

    public void ClearBitmapPosition(int x, int y) {
        this.bitmap[y][x] = 0;
    }
    public void ClearBitmap() {
        this.bitmap = new int[height][width];
    }


    public void setSnakePosition(int[][] snake) {
        for (int i = 0; i < snake.length; i++) {
            for (int j = 0; j < snake[i].length; j++) {
                if (snake[i][j] == 2) {
                    this.bitmap[i][j] = 2;
                }
            }
        }

    }


    public void setFoodPosition(int x, int y) {
        this.bitmap[y][x] = 1;
    }

    public int getObjectType(int x, int y) {
        return this.bitmap[y][x];
    }

    public int[][] getBitmap() {
        return this.bitmap;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }



}
