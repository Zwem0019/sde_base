package edu.hz.io;

public class ConsoleWriter {

    private int counter = 0;

    public void writeBitmapFrame(Bitmap bitmap) {
        System.out.println("Bitmap: " + bitmap.getWidth() + "x" + bitmap.getHeight());
        for (int i = 0; i < bitmap.getHeight(); i++) {
            System.out.println();
            for (int j = 0; j < bitmap.getWidth(); j++) {
                System.out.print(resolveChar(bitmap.getBitmap()[i][j]));
                counter++;
            }
        }
    }

    public void write(String text) {
        System.out.println(text);
    }

    public String resolveChar(int charCode) {
        return switch (charCode) {
            case 0 -> ("_");
            case 1 -> ("E");
            case 2 -> ("S");
            case 9 -> ("#");
            default -> (" ");
        };
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }



}