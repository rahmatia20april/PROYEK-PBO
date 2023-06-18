package com.layout;

import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        System.out.println();
        System.out.println("================================");
        System.out.println("WELCOME TO DB - CRUD OPERATIONS");
        System.out.println("================================");
        System.out.println("1.] Read Data");
        System.out.println("2.] Insert Data");
        System.out.println("3.] Edit Data");
        System.out.println("4.] Delete Data");
        System.out.println("5.] Exit");
        System.out.println("================================");
        System.out.print("Pilih: ");
        selectMenu();
    }

    public static void selectMenu() {
        Scanner sc = new Scanner(System.in);

        try {
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    Read.showReadData();
                    break;
                case 2:
                    Insert.showInsertData();
                    break;
                case 3:
                    Edit.showEditData(null);
                    break;
                case 4:
                    Delete.showDeleteData();
                    break;
                case 5:
                    System.out.println("================================");
                    System.out.println("Thank You...");
                    System.out.println("--------------------------------");
                    System.exit(0);
                default:
                    System.out.println("================================");
                    System.out.println("Sorry, the selected menu does not exist");
                    System.out.println("--------------------------------");
                    showMenu();
            }
        } catch (Exception e) {
            System.out.println("================================");
            System.out.println("Sorry Input Error");
            System.out.println("--------------------------------");
            System.exit(0);
        }

        sc.close();
    }
    
}
