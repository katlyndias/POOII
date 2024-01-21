package br.com.ada.pooii.aula02;

public interface Veículo {
    //Integer VELOCIDADE_MAXIMA_PERMITIDA = 230; CODIGO INVALIDO POIS SERIA ATRIBUIDA A TODOS OS VEICULOS;
    oid ligar();
    void desligar();
    void acelerar(int velocidade);
    void frear();
    Integer getVelocidadeMaxPermitida();

}
