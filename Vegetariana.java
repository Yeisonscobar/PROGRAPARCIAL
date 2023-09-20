package edu.pizza.especialidades;

import edu.pizza.base.Ingrediente;
import edu.pizza.base.Pizza;

public class Vegetariana extends Pizza {
    public Vegetariana(){
        super();
        setNombre("Vegetariana");
        agregarIngrediente(new Ingrediente("Champiñones",12));
        agregarIngrediente(new Ingrediente("Pimientos",7));
        agregarIngrediente(new Ingrediente("Cebolla",4));
        agregarIngrediente(new Ingrediente("Espinaca",7));
        agregarIngrediente(new Ingrediente("Aceituna",8));
        agregarIngrediente(new Ingrediente("Tomates cherry",5));
        agregarIngrediente(new Ingrediente("Albahaca",6));
        agregarIngrediente(new Ingrediente("Aceite de oliva",3));
    }
}
