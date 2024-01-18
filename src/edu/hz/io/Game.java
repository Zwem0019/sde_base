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

    private int points = 0;

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
    FoodBuilder foodBuilder = new FoodBuilder();
    foodBuilder.reset();
    foodBuilder.setX((int) (Math.random() * bitmap.getWidth()));
    foodBuilder.setY((int) (Math.random() * bitmap.getHeight()));
    foodBuilder.setCheap();
    Food Food = foodBuilder.getResults();
    writer.write("What snake do you want to play with? Press 1 for slow snake, 2 for fast snake");
    String inputTypeSnake = reader.readLine();
    Snake snake;
    switch (inputTypeSnake) {
        case "1":
             snake = new SlowSnake(10, 10, 8, Direction.UP, bitmap.getWidth(), bitmap.getHeight());
            break;
        case "2":
             snake = new FastSnake(10, 10, 8, Direction.UP, bitmap.getWidth(), bitmap.getHeight());
            break;
        default:
            writer.write("Invalid input");
            return;
    }



        while (this.State instanceof RunningState) {
            writer.clearScreen();
            int x = snake.getHeadX();
            int y = snake.getHeadY();
            if (bitmap.getObjectType(x, y) == 9) {
                writer.write("Game over");
                break;
            } else if (bitmap.getObjectType(x, y) == 1) {
                points += Food.getPoints();
                foodBuilder.reset();
                foodBuilder.setX((int) (Math.random() * bitmap.getWidth()));
                foodBuilder.setY((int) (Math.random() * bitmap.getHeight()));
                if (Math.random() > 0.5) {
                    foodBuilder.setExpensive();
                } else {
                    foodBuilder.setCheap();
                }
                Food = foodBuilder.getResults();
            }
            writer.write("Points: " + points);
            bitmap.ClearBitmap();
            bitmap.setFoodPosition(Food.getX(), Food.getY());
            bitmap.setSnakePosition(snake.getSnake());
            bitmap.setWalls();
            writer.writeBitmapFrame(bitmap);
            String input = reader.readLineTimeLimited(snake.getSpeed());
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
                    this.changeState(new StoppedState(this));
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
