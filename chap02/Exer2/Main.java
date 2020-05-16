// -*- mode: java; coding: utf-8 -*-
// file: Main.java
//     Created:       <2020/05/16 14:37:40>
//     Last Modified: <2020/05/16 14:40:24>

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
