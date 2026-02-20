package com.example;

public class Main {

    public static void main(String[] args) {

        // Crear dos objetos Product
        Product product1 = new Product("P001", "Laptop", 1200.0, 10);
        Product product2 = new Product("P002", "Mouse", 25.5, 100);

        // Modificar al menos un atributo de cada objeto usando setters
        product1.setStock(15);
        product2.setPrice(22.0);

        // Usar getters para imprimir al menos dos atributos de cada objeto
        System.out.println("Producto 1 - Nombre: " + product1.getName());
        System.out.println("Producto 1 - Precio: " + product1.getPrice());

        System.out.println("Producto 2 - Nombre: " + product2.getName());
        System.out.println("Producto 2 - Stock: " + product2.getStock());

        // Mostrar representación completa usando toString()
        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
}

