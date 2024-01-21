package br.com.ada.pooii.aula02;

public class MainEx2 {
    public static void main(String[] args) {

    Círculo circulo = new Círculo(5);
    Retângulo retangulo = new Retângulo(4, 6);
    Triângulo triangulo = new Triângulo(3, 8);

        System.out.println("Área do Círculo: " + circulo.calcularÁrea());
        System.out.println("Área do Retângulo: " + retangulo.calcularÁrea());
        System.out.println("Área do Triângulo: " + triangulo.calcularÁrea());

    }
}
