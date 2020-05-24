// -*- mode: java; coding: utf-8 -*-
// file: Singleton.java
//     Created:       <2020/05/24 18:37:33>
//     Last Modified: <2020/05/24 18:48:14>

public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("インスタンスを生成しました。");
        slowdown();
    }
    public static synchronized Singleton getInstance() {
        if ( singleton == null ) {
            singleton = new Singleton();
        }
        return singleton;
    }
    private void slowdown() {
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
        }
    }
}
