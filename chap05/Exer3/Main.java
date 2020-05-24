// -*- mode: java; coding: utf-8 -*-
// file: Main.java
//     Created:       <2020/05/24 18:39:57>
//     Last Modified: <2020/05/24 18:45:45>

public class Main extends Thread {
    public static void main(String[] args) {
        System.out.println("Start.");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        System.out.println("end.");
    }
    public void run() {
        Singleton obj = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }
    public Main(String name) {
        super(name);
    }
}
