/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ASM {

    private static final Map<String, String> users = new HashMap<>();

     private static final List<Product> products = new ArrayList<>();
    static {
    // Add some sample user credentials and roles to the map
    users.put("admin", "admin");
    users.put("guest", "guest");
}


    public static void main(String[] args) {
        // Prompt the user to log in
       
    String username = promptUser("Enter username:");
    String password = promptUser("Enter password:");

    // Check if the login is valid
    String role = getRole(username,password);

    if (role != null) {
            // Display the use case based on the user's role
            System.out.println("Welcome, " + username + "!");
            System.out.println("Here is the use case for " + role + "s:");

            switch (role) {
                case "admin" -> Admin.run(products);
//                case "guest" -> Guest.run(products);
                default -> System.out.println("Invalid role.");
            }
        } else {
            System.out.println("Invalid login.");
        }
    }

   private static String getRole(String username, String password) {
    // Check if the username and password are valid
    // This could involve checking a database or some other data store
    // For simplicity, we're using a Map to store user credentials and roles
    String storedPassword = users.get(username);
    if (storedPassword != null && storedPassword.equals(password)) {
        return username;
    } else {
        return null;    
    }
}
    private static String promptUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message + " ");
        return scanner.nextLine();
    }
//    private static void generateRandomProducts(int numProducts) {
//        Random rand = new Random();
//
//        for (int i = 0; i < numProducts; i++) {
//            String name = "Product " + (i + 1);
//            double price = rand.nextDouble() * 100.0;
//            int stock = rand.nextInt(100);
//
//            products.add(new Product(name, price, stock));
//        }
//    
    }
    
    


