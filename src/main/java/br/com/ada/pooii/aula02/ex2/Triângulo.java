package br.com.ada.pooii.aula02;

public class Triângulo implements Shape{
    private double base;
    private double altura;

    public Triângulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularÁrea() {
        return (base * altura) / 2;
    }
}
