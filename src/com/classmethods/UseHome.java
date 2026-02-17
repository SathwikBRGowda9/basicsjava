package com.classmethods;

public class UseHome {

    public static void main(String[] args) {

        UseHome.kitchen();
        UseHome.dining();
        UseHome.bedroom();
    }

    private static void kitchen() {
        System.out.println("Preparing food in kitchen");
    }

    private static void dining() {
        System.out.println("Eating food in dining room");
    }

    private static void bedroom() {
        System.out.println("Sleeping in bedroom");
    }
}
