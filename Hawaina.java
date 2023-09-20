package edu.pizza.especialidades;

import edu.pizza.base.Ingrediente;
import edu.pizza.base.Pizza;

public class Hawaina extends Pizza {
    public Hawaina(){
        super();
        setNombre("Hawaina");
        agregarIngrediente(new Ingrediente("Jamón",8));
        agregarIngrediente(new Ingrediente("Piña",12));
        agregarIngrediente(new Ingrediente("Cebolla",4));
        agregarIngrediente(new Ingrediente("Pimientos",7));
        agregarIngrediente(new Ingrediente("Aceituna",8));
    }
}
