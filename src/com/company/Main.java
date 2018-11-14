package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Grid grid = new Grid();
        int width, height;
        Scanner scanner = new Scanner(System.in);
        boolean validInputEntered = false;
        try{
            while(!validInputEntered) {
                System.out.print("Enter width: ");
                width = scanner.nextInt();
                System.out.print("Enter height: ");
                height = scanner.nextInt();
                System.out.println("");

                if(width > 0 && height > 0){
                    validInputEntered = true;
                    grid.createGrid(height,width);
                }else{
                    System.out.println("Please enter a value above 0");
                    System.out.println("");
                }
            }
        }catch(InputMismatchException e) {
            System.out.println("Invalid input entered from user");
        }
    }

}
