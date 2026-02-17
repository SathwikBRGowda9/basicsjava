package com.classmethods;

public class AllGlobalMembers {

    static int value;

    int num = 45;

    void run() {
        System.out.println("Not static method");
    }

  
    static void execute() {
        System.out.println("Static execute method");
    }

    public static void main(String[] args) {

        
        int num = 3;

        System.out.println("Local Variable: " + num);
        System.out.println("===================");

        System.out.println("Global static value: " + value);
        execute();

        System.out.println("===================");

        AllGlobalMembers object = new AllGlobalMembers();

        System.out.println("Non-static num: " + object.num);
        object.run();
    }
}
