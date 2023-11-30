package edu.hz.io;

public class ConsoleWriter {

    public String[] Text;

    public void writeLine(String line) {
        System.out.println(line);
    }

    public void writeLines(String[] lines) {
        for (String line : lines)
            System.out.println(line);
    }

    // this will store the text in the Text variable
    public void storeText(String[] text) {
        this.Text = text;
    }

    // this will write the stored text to the console
    public void writeText() {
        System.out.println(this.Text.toString());
    }

}