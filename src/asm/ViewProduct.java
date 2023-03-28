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
    
public class ViewProduct {
    public static void run(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}

