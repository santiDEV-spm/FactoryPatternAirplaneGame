package com.santidev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please select fly 1:Banshee 2:B747 3:A380");
        int type = in.nextInt();

        Fly fly = FlyFactory.create(type);
        fly.shoot();
    }
}
