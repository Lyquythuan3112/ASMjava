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

public class EditProduct {
    public static void run(List<Product> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name to edit: ");
        String name = scanner.nextLine();

        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.print("Enter new product name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter new product price: ");
                double newPrice = scanner.nextDouble();

                product.setName(newName);
                product.setPrice(newPrice);

                System.out.println("Product edited successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }
}
