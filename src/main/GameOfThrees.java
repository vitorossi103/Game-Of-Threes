package main;

import java.util.Scanner;

public class GameOfThrees {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int x = in.nextInt();

        while (x != 1) {
            if (x % 3 == 0) {
                x /= 3;
                System.out.println(x + " 0");
            } else if ((x - 1) % 3 == 0){
                System.out.println(x + " -1");
                x -= 1;
            } else if ((x + 1) % 3 == 0) {
                System.out.println(x + " +1");
                x += 1;
            } else {
                System.out.println(x + " -1");
                x -= 1;
            }
        }
        System.out.println(x);
    }
}
