package br.com.ada.pooii.aula02.ex1;

import br.com.ada.pooii.aula02.ex2.Shape;

public class Círculo implements Shape {
    private double raio;
    //construtor
    public Círculo(double raio){
        this.raio = raio;
    }
    @Override
    public double calcularÁrea() {
        return Math.PI * Math.pow(raio,2);
    }
}
