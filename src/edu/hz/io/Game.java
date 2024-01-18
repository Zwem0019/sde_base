package edu.hz.io;

public class Game {

    private GameStates State;

    public Game(GameStates State) {
        this.State = State;
    }

    public void changeState(GameStates State){
        this.State = State;
    }





    public void run(){
    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader reader = new ConsoleReader();

    Bitmap bitmap = new Bitmap(50, 20);
    Snake snake = Snake.getInstance(5, 7, 8, Direction.DOWN, bitmap.getWidth(), bitmap.getHeight());
        snake.moveRight();


        while (this.State instanceof RunningState) {
            writer.clearScreen();
            int x = snake.getHeadX();
            int y = snake.getHeadY();
            if (bitmap.getObjectType(x, y) == 9) {
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
                    break;
                default:
                    writer.write("Invalid input");
                    break;
            }
        }
    }
}
