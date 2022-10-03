package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(concat(20, -100));
        System.out.println(concat(20, 20));
        System.out.println(concat(10, 15));
        System.out.println(concat(47, 5));
        System.out.println(concat(13, 35));
    }

    public static String concat(int age, int temperature) {
        if (age >= 20 && age < 45 && temperature > -20 && temperature < 30) {
            return ("Mojno idti gulyat");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return ("Mojno idti gulyat");
        } else if (age > 45 && temperature >= -10 && temperature < 25) {
            return ("Mojno idti gulyat");
        } else {
            return ("Ostavaites doma");
        }
    }
}

