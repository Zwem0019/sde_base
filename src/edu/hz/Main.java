package edu.hz;

import edu.hz.io.*;
import edu.hz.statement.HZMissionStatement;

public class Main {

    public static void main(String[] args) {

        // define
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        // execute
        HZMissionStatement HzMissionStatement = new HZMissionStatement();
        writer.storeText(HzMissionStatement.getFirstAmbition());
        writer.writeText();
        //        reader.readLine();

    }
}
