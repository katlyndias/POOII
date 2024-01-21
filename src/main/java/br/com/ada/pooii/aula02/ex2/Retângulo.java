package br.com.ada.pooii.aula02;

public class Retângulo implements Shape{
    private double comprimento;
    private double largura;
    public Retângulo (double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }
    @Override
    public double calcularÁrea() {
        return comprimento * largura;
    }
}
