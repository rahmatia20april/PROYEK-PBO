
package com.layout;


import java.util.Scanner;

import com.controllers.DbController;

public class Delete {
    public static void showDeleteData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Please Select the Data You Want to Delete");
        System.out.println("--------------------------------");
        DbController.getDatabase();
        System.out.println("--------------------------------");
        System.out.println("**Note: Enter the product name correctly!!!");
        System.out.print("Select Product Name: ");
        String nama = sc.nextLine();
        System.out.println("================================");

        if (DbController.deleteData(nama)) {
            System.out.println("Successfully Delete Data");
        } else {
            System.out.println("Sorry, Failed to Delete Data");
        }

        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}


