package edu.hz.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

    public String readLine() {
        try {
            String line = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            return line;
        } catch (IOException var2) {
            return "Gibberish input detected";
        }
    }

    public String readLineTimeLimited(int seconds){
        int x = seconds; // wait 2 seconds at most

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long startTime = System.currentTimeMillis();
        while (true) {
            try {
                if (!((System.currentTimeMillis() - startTime) < x * 1000
                                && !in.ready())) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            if (in.ready()) {
                return in.readLine();
            } else {
                return null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}