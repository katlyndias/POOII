package br.com.ada.pooii.aula02;

public class Bicicleta implements Veículo {


    @Override
    public void ligar() {
        System.out.println("Bicileta não possui motor para ligar");
    }

    @Override
    public void desligar() {
        System.out.println("Bicileta não possui motor para desligar");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Bicileta acelerando a " + velocidade + "km/h");
    }

    @Override
    public void frear() {
        System.out.println("Bicileta freando");
    }

}
