package edu.hz;

import edu.hz.io.*;

public class Main {

    public static void main(String[] args){
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        Bitmap bitmap = new Bitmap(50, 20);
        Snake snake = new Snake(5, 7, 8, Direction.DOWN, bitmap.getWidth(), bitmap.getHeight());
        snake.moveRight();

        label:
        while (true){
            writer.clearScreen();
            int x = snake.getHeadX();
            int y = snake.getHeadY();
            if (bitmap.getObjectType(x, y) == 9){
                writer.write("Game over");
                break;
            }
            bitmap.ClearBitmap();

            bitmap.setSnakePosition(snake.getSnake());
            writer.writeBitmapFrame(bitmap);
            String input = reader.readLine();
            switch (input) {
                case "a":
                    snake.moveLeft();
                    break;
                case "d":
                    snake.moveRight();
                    break;
                case "w":
                    snake.moveUp();
                    break;
                case "s":
                    snake.moveDown();
                    break;
                case "q":
                    writer.write("Exiting...");
                    break label;
                default:
                    writer.write("Invalid input");
                    break;
            }
        }


    }
}
