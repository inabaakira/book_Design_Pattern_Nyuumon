// -*- mode: java; coding: utf-8 -*-
// file: Triple.java
//     Created:       <2020/05/24 14:32:46>
//     Last Modified: <2020/05/24 16:33:58>

public class Triple {
    private static Triple[] triple = new Triple[] {
        new Triple(0),
        new Triple(1),
        new Triple(2),
    };
    private int id;
    private Triple(int id) {
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }
    public static Triple getInstance(int id) {
        return triple[id];
    }
    public String toString() {
        return "[Triple id=" + id + "]";
    }
}
