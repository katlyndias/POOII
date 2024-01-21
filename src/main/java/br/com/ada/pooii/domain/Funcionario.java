package br.com.ada.pooii.aula01;
//exemplo comum para falar de interface
public abstract class Funcionario{ // mudou de pulic para abstract
    protected String nome;
    protected double salario;
//    private String cargo; // 1 = verndedor 2 = gerente ... -> removido quando criei as classes

    //construtor:
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    // quando crio a classe vendedor e gerente, o metodo getBonus tem que ser abstract e quem implementá-lo colocara as especificidades em vez de usar esse if
    public abstract double getBonus();
//                            {
//        double resultado = 0.0;
//
//        if (this.cargo.equals("vendedor")){ // se nao soubesse se é maiusculo ou minusculo poderia colocar equalsIgnoreCase ou transformar para maiuscula ou minuscula o q recebeu antes de comparar com o que tá no if
//            resultado = this.salario * 0.2;
//        } else if(this.cargo.equals("gerente")){
//            resultado = this.salario * 0.3;
//        }
//        // posso criar subclasse
//        return resultado;
//
//    }


}
