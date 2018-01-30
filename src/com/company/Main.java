package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sveiki, iveskite nuvaziuotus km");

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();

        System.out.println("Iveskite sunaudotu degalu kieki");

        float b = sc.nextFloat();

        System.out.println("Jusu vidurkis");

        System.out.println(b*100/a);
    }
}
