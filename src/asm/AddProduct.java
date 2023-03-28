/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */


public class AddProduct {
    public static void run(List<Product> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        products.add(new Product(name, price));

        System.out.println("Product added successfully.");
    }
}
