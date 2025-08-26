package org.example;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Integer> numeros;

    public Manager() {
        this.numeros = new ArrayList<>();
    }
    public void addNumeros (int numero){
        this.numeros.add(numero);
    }

    public int getSuma(){
        int total = 0;
        for (int numero : this.numeros) {
            total += numero;
        }
        return total;
    }
}
