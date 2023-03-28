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

public class DeleteProduct {
    public static void run(List<Product> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name to delete: ");
        String name = scanner.nextLine();

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                System.out.println("Product deleted successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }
}