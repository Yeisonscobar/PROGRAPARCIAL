package edu.pizza.especialidades;

import edu.pizza.base.Ingrediente;
import edu.pizza.base.Pizza;

public class Pepperoni extends Pizza {
    public Pepperoni(){
        super();
        setNombre("Pepperoni");
        agregarIngrediente(new Ingrediente("Pepperoni",15));
        agregarIngrediente(new Ingrediente("Champiñones",12));
        agregarIngrediente(new Ingrediente("Cebolla",4));
        agregarIngrediente(new Ingrediente("Aceituna",8));
    }
}
