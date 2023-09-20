package edu.pizza.especialidades;

import edu.pizza.base.Pizza;

public class Yo_laArmo extends Pizza {
    public Yo_laArmo(){
        super();
    }
    public Yo_laArmo(String nombre){
        super();
        setNombre(nombre);
    }

    @Override
    public String toString() {
        return  "Yo la Armo" ;
    }
}
