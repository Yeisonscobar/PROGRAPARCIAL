package edu.pizza;


import edu.Formularios.frmPizza;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("frmPizza");
        frame.setContentPane(new frmPizza().getjPanelPrincipal());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 680);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //ejercicio 1
//        Pizza pizza = new Pizza("Pizza Margherita");
//        pizza.addTopping(new Topping("Champiñones", 10));
//        pizza.addTopping(new Topping("Mozzarella", 20));
//        pizza.addTopping(new Topping("Cebolla", 30 ));
//        pizza.addTopping(new Topping("Tomate", 40));
//        pizza.prepare();

        //quiten la mozarella
        //vuelvan a preparar
        //pizza.removeTopping(1);
        //pizza.prepare();










//        Ejercicio 2 heredar
//        Creamos una instancia de la clase PizzaItaliana y agregamos varios toppings
//        a ella utilizando
//        el método "agregar" de la clase Topping.
//        PizzaItaliana pizzaItaliana =
//                new PizzaItaliana("Pizza Italiana", 10.99, "Salsa de tomate", new Topping("Tomato"), new Topping("Mozzarella"), new Topping("Basil"));
//        pizzaItaliana.prepare();


//        Ejercicio 3
//        Topping pepperoni = new Topping("Pepperoni");
//        pepperoni.agregarIngrediente("queso");
//        pepperoni.agregarIngrediente("champiñones");
//        System.out.println(pepperoni); // Salida: Topping{nombre='Pepperoni', ingredientes=['queso']}


    }
}
