// -*- mode: java; coding: utf-8 -*-
// file: Main.java
//     Created:       <2020/05/24 16:31:50>
//     Last Modified: <2020/05/24 16:33:20>

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i %3);
            System.out.println(i + ":" + triple);
        }
        System.out.println("End.");
    }
}
