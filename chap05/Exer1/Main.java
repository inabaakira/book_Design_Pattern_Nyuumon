// -*- mode: java; coding: utf-8 -*-
// file: Main.java
//     Created:       <2020/05/24 13:42:16>
//     Last Modified: <2020/05/24 16:24:43>

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End.");
    }
}
