package edu.hz.io;

public class Food {
    private static int x;
    private static int y;
    private static int foodPoints;

    private static Food instance;

    public static Food getInstance(int x, int y, char symbol, int points){
        if(Food.instance == null) {
            Food.instance = new Food(x, y, symbol, points);
        } else {
            Food.x = x;
            Food.y = y;
            foodPoints = points;
        }
        return Food.instance;
    }

    private Food(int x, int y, char symbol, int points){
        Food.x = x;
        Food.y = y;
        foodPoints = points;
    }

    public static int getX(){
        return x;
    }

    public static int getY(){
        return y;
    }

    public static int getPoints(){
        return foodPoints;
    }



}
