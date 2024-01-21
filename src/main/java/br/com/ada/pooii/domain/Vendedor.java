package br.com.ada.pooii.aula01;

public class Vendedor extends Funcionario implements Autentica {
    private String senha;
    // construtor
    public Vendedor (String nome, double salario){
        super(nome, salario);
    }

    //implementação do metodo (obrigatorio)
    @Override
    public double getBonus() {
        return this.salario * 0.2;
    }
    //implementando o metodo autentica da interface
    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }

    public String getSenha() {
        return senha;
    }
}
