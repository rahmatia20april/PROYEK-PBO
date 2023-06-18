package com.layout;

import java.util.Scanner;

import com.controllers.DbController;

public class Read {
    public static void showReadData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Product Data");
        System.out.println("================================");
        DbController.getDatabase();
        System.out.println("================================");

        System.out.println("1. Menu");
        System.out.println("2. Exit");
        System.out.print("Pilihan: ");
        try {
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                    Menu.showMenu();
                    break;
                case 2:
                    System.out.println("================================");
                    System.out.println("Thank you...");
                    System.out.println("--------------------------------");
                    System.exit(0);
                default:
                    System.out.println("================================");
                    System.out.println("Sorry, the selected menu does not exist");
                    System.out.println("--------------------------------");
                    Menu.showMenu();
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            System.out.println("================================");
            System.out.println("Sorry Input Error");
            System.out.println("--------------------------------");
            System.exit(0);
        }

        System.out.println("--------------------------------");
        Menu.showMenu();

        sc.close();
    }
}

