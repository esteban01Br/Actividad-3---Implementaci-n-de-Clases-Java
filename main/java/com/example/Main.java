package com.example;

public class Main {

    public static void main(String[] args) {

        // Crear dos objetos
        Product product1 = new Product("P001", "Laptop", 1200.0, 10);
        Product product2 = new Product("P002", "Mouse", 25.5, 50);

        // Modificar atributos
        product1.setPrice(1100.0);
        product2.setStock(40);

        // Usar getters
        System.out.println("Product 1 Name: " + product1.getName());
        System.out.println("Product 1 Price: " + product1.getPrice());

        System.out.println("Product 2 Name: " + product2.getName());
        System.out.println("Product 2 Stock: " + product2.getStock());

        // Mostrar objeto completo
        System.out.println(product1);
        System.out.println(product2);
    }
}