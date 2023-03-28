/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;
/**
 *
 * @author ASUS
 */


import java.util.List;
import java.util.Scanner;

public class Admin {
    public static void run(List<Product> products) {
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. View products");
            System.out.println("2. Add product");
            System.out.println("3. Edit product");
            System.out.println("4. Delete product");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> ViewProduct.run(products);
                case 2 -> AddProduct.run(products);
                case 3 -> EditProduct.run(products);
                case 4 -> DeleteProduct.run(products);
                case 5 -> {
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
