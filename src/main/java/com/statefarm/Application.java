package com.statefarm;

public class Application {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(isActive("active"));
        System.out.println(grade(78));
        System.out.println(grade(78));

        int i = 45;
        while (i < 51) {
            System.out.println(i);
            i++;
        }

        for (int j = 1; j < 7; j++) {
            if (j % 2 == 0) System.out.println(j);
        }

    }

    public static boolean isActive(String status) {
        // Implement your solution
        if (status.equals("active")) {
            return true;
        } else {
            return false;
        }
    }

    public static String grade(int input) {
        if (input < 60) return "F";
        else if (input < 70) return "D";
        else if (input < 80) return "C";
        else if (input < 90) return "B";
        else if (input < 100) return "A";
        else return "E";
    }





}