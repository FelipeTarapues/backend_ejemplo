package org.example;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addNumeros(1);
        manager.addNumeros(2);
        manager.addNumeros(3);
        System.out.println("La suma es : " + manager.getSuma());




    }
}