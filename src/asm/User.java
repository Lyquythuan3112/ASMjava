///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package asm;
//
///**
// *
// * @author ASUS
// */
//public class User{
//    private String username;
//
//    public User(String username) {
//        this.username = username;
//    }
//
//    @Override
//    public String getRole() {
//        return "guest";
//    }
//
//    @Override
//    public void displayMenu() {
//        System.out.println("1. View products");
//        System.out.println("2. Add products to cart");
//        System.out.println("3. Checkout");
//    }
//
//    public static boolean isValidUser(String username, String password) {
//        // Check if the username and password are valid for a guest user
//        // This could involve checking a database or some other data store
//        // For simplicity, we're using hardcoded values
//        return username.equals("guest") && password.equals("guestpass");
//    }
//}
