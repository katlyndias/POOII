package br.com.ada.pooii.aula01;

public class Gerente extends Funcionario implements Comparable<Gerente>{
    // construtor
    public Gerente (String nome, double salario){
        super(nome, salario);
    }

    //implementação do método (obrigatorio)
    @Override
    public double getBonus() {
        return this.salario * 0.3;
    }

    @Override
    public int compareTo(Gerente o) {
        return Double.compare(o.getBonus(),this.getBonus()); // posso usar isso em vez do codigo abaixo
//        return Double.compare(this.getBonus(),o.getBonus()); // retorna invertido
//        double resultado = o.getBonus() - this.getBonus();
//        return Double.valueOf(resultado).intValue(); // transformando o double em int
    }

    @Override
    public String toString(){
        return this.nome + ": salario: " + this.salario + " bonus: " + this.getBonus(); // para não usar o toString da classe object preciso reescrever
    }

}
