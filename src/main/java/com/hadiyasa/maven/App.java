package com.hadiyasa.maven;

import main.java.com.hadiyasa.dependency_example.Hero;
import main.java.com.rrsh.oop.mobile_legends.characters.hero.Marksman;
import main.java.com.rrsh.oop.mobile_legends.characters.monster.Turtle;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Hero miya = new Hero("Miya",2000,5000);
        System.out.println(miya.toString());

        Marksman layla = new Marksman("Layla", 3000, 1000);
        Turtle turtle = new Turtle("Turtle", 2000, 1000);

        System.out.println("Turtle HP: " + turtle.getHp());
        layla.attack(turtle);
    }
}
