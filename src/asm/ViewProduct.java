/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ASUS
 */
    
public class ViewProduct {
     private static final Map<String, String> Product = new HashMap<>();
     static {
    // Add some sample Product credentials and roles to the map
    Product.put("Bike", "200");
    Product.put("Motor", "1000");
}
     
    public static void run(List<Product> products) {
//        for (Product product : products) {
            System.out.println(Product);
        }
//    }
}

