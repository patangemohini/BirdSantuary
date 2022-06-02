package com.bl.brid_sanctury;

import java.util.Scanner;

public class UserInterface {

    int showMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : \n1.Add Bird \n2.Remove Bird \n3.Update Bird \n4.PrintBird \n5.Exit");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        return choice;
    }
}
