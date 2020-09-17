package com.practice_4_1;

public class dishLoader {

    public static void main(String[] args) {
        Plate a = new Plate("Ceramic", 0.7f, "Round", 8f, 1f);
        Fork b = new Fork("Steel", 0.1f, "Oblong", 4, 13f);
        Spoon c = new Spoon("Wood", 0.07f, "Oblong", 4f, 2f, 12f);

        System.out.println(a.forOutput());
        System.out.println(b.forOutput());
        System.out.println(c.forOutput());
    }
}
