package br.com.ada.pooii.aula02;

public class MainEx1 {
    public static void main(String[] args) {
        Veículo carro = new Carro();
        Veículo moto = new Moto();
        Veículo bicicleta = new Bicicleta();

        // Chamadas polimórficas
        carro.ligar();
        carro.acelerar(60);
        carro.frear();
        carro.desligar();

        System.out.println();

        moto.ligar();
        moto.acelerar(80);
        moto.frear();
        moto.desligar();

        System.out.println();

        bicicleta.ligar();
        bicicleta.acelerar(20);
        bicicleta.frear();
        bicicleta.desligar();
    }
}
