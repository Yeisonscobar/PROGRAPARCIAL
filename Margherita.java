package edu.pizza.especialidades;

import edu.pizza.base.Ingrediente;
import edu.pizza.base.Pizza;

public class Margherita extends Pizza {
    public Margherita(){
        super();
        setNombre("Margherita");
        agregarIngrediente(new Ingrediente("Albahaca",10));
        agregarIngrediente(new Ingrediente("Aceite de Oliva",3));
    }
}
