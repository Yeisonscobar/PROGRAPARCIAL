package edu.pizza.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Pizza {
    private String nombre;
    private ArrayList<Ingrediente> ingredientes;

    public Pizza(){
        nombre="";
        ingredientes= new ArrayList<>();
        ingredientes.add(new Ingrediente("Salsa de Tomate",11));
        ingredientes.add(new Ingrediente("Queso",12));
    }

    public Pizza(String nombre, ArrayList<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public void quitarIngrediente(int i){
        ingredientes.remove(i);
    }

    @Override
    public String toString() {
        return  nombre ;
    }
}
