package edu.pizza.especialidades;

import edu.pizza.base.Ingrediente;
import edu.pizza.base.Pizza;

public class Carnivora extends Pizza {
    public Carnivora(){
        super();
        agregarIngrediente(new Ingrediente("Pepperoni",15));
        agregarIngrediente(new Ingrediente("Salchichas",12));
        agregarIngrediente(new Ingrediente("Jamón",12));
        agregarIngrediente(new Ingrediente("Carne molida",10));
        agregarIngrediente(new Ingrediente("Pollo",8));
    }
}
