package com.layout;

import java.util.Scanner;

import com.controllers.DbController;
import com.models.Produk;

public class Edit {
    public static void showEditData(String nama) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Please Select the Data You Want to Edit");
        System.out.println("================================");
        DbController.getDatabase();
        System.out.println("================================");
        System.out.println("**Note: Enter the product name correctly!!!");
        System.out.print("Select Product Name: ");
        nama = sc.nextLine();

        System.out.println("================================");
        System.out.println("Please Select Menu Update Data");
        System.out.println("================================");
        System.out.println("1. Update NAMA");
        System.out.println("2. Update HARGA");
        System.out.println("3. Update JUMLAH");
        System.out.println("4. Back to Menu");

        System.out.println("================================");
        System.out.print("Choice: ");
        try {
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                    showEditNama(nama);
                    break;
                case 2:
                    showEditHarga(nama);
                    break;
                case 3:
                    showEditJumlah(nama);
                    break;
                case 4:
                    Menu.showMenu();
                    break;
                default:
                    System.out.println("================================");
                    System.out.println("Sorry, the product name or menu selected does not exist");
                    System.out.println("--------------------------------");
                    Menu.showMenu();
            }
        } catch (Exception e) {
            System.out.println("================================");
            System.out.println("Sorry, the product name or menu selected does not exist");
            System.out.println("--------------------------------");
            Menu.showMenu();
        }
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditNama(String nama) {
        Scanner sc = new Scanner(System.in);
        Produk produk = DbController.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("Edit Name");
        System.out.println("================================");
        System.out.println("First name: " + produk.getNama());
        System.out.println("--------------------------------");
        System.out.print("New Name: ");
        String namaBaru = sc.nextLine();
        DbController.updateNama(produk.getId(), namaBaru);

        System.out.println("================================");
        System.out.println("Successfully Update Name Data");
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditHarga(String nama) {
        Scanner sc = new Scanner(System.in);
        Produk produk = DbController.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("Edit price");
        System.out.println("================================");
        System.out.println("Initial Price: " + produk.getHarga());
        System.out.println("--------------------------------");
        System.out.print("New price: ");
        long hargaBaru = sc.nextLong();
        DbController.updateHarga(produk.getId(), hargaBaru);

        System.out.println("================================");
        System.out.println("Price Data Update Successfully");
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditJumlah(String nama) {
        Scanner sc = new Scanner(System.in);
        Produk produk = DbController.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("edit amount");
        System.out.println("================================");
        System.out.println("Initial Amount: " + produk.getjumlah());
        System.out.println("--------------------------------");
        System.out.print("Jnew Amount: ");
        int jumlahBaru = sc.nextInt();
        DbController.updateStok(produk.getId(), jumlahBaru);

        System.out.println("================================");
        System.out.println("Successfully Update Stock Data");
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}

