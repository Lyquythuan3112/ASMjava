/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class Guest {
     public static void main(String[] args) {
        System.out.println("Welcome, guest!");
        System.out.println("Here is the use case for guests:");

        System.out.println("1. View products");
        System.out.println("2. Add products to cart");
        System.out.println("3. Checkout");
    }
Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> ViewProduct.run(products);
                case 2 -> 
                case 3 ->
                case 4 -> 
    return;
                }
                default -> System.out.println("Invalid option.");
            }
}
