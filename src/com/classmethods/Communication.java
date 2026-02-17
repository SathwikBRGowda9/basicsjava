package com.classmethods;

public class Communication {

    public static void main(String[] args) {

        Communication.call("Anushka", "Karthikeya");
        Communication.call("Rashika", "Surjan");
    }

    private static void call(String heroine, String hero) {
        System.out.println(heroine + " is calling " + hero);
    }
}
