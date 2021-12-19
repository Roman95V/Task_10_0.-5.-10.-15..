package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 5;
        System.out.println("Result:");
        for (int i = 1; i <= 10; i++){
            result = result - 5;
            System.out.print(result + ", ");
        }
    }
}
