
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private List<Product> products = new ArrayList<>();

     public Product() {
        // Add some sample products
        products.add(new Product("Product 1", 10.0));
        products.add(new Product("Product 2", 20.0));
        products.add(new Product("Product 3", 30.0));
    }
     
     public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void editProduct(int index, Product product) {
        products.set(index, product);
    }

    public void deleteProduct(int index) {
        products.remove(index);
    }  
}
