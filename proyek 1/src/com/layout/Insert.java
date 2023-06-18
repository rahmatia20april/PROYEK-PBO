package com.layout;

import java.util.Scanner;

import com.controllers.DbController;

public class Insert {
    public static void showInsertData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Please Input Product Data");
        System.out.println("================================");

        System.out.print("Product name : ");
        String name = sc.nextLine();
        System.out.print("price : ");
        long harga = sc.nextLong();
        System.out.print("jumlah : ");
        int stok = sc.nextInt();
        System.out.println("================================");

        if (DbController.insertData(name, harga, stok)) {
            System.out.println("Successfully Insert Data");
        } else {
            System.out.println("Failed to Insert Data");
        }

        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}

