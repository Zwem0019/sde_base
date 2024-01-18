package edu.hz.io;

public class Game {

    private GameStates State;

    private Game(GameStates State) {
        this.State = State;
    }

    public void changeState(GameStates State){
        this.State = State;
    }

    public static Game instance;

    public static Game getInstance(GameStates State) {
        if(Game.instance == null) {
            Game.instance = new Game(State);
        }
        return Game.instance;
    }


    public void run(){
    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader reader = new ConsoleReader();

    Bitmap bitmap = new Bitmap(50, 20);
    Snake snake = new Snake(5, 7, 8, Direction.DOWN, bitmap.getWidth(), bitmap.getHeight());
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
            String input = reader.readLineTimeLimited(2);
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
                case null:
                    snake.move();
                    break;
                default:
                    writer.write("Invalid input");
                    break;
            }
        }
    }
}
