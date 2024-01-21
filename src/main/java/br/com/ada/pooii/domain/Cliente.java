package br.com.ada.pooii.aula01;

public class Cliente implements Autentica {

    private String senha;
    @Override
    public boolean autentica(String senha) {
        int range = Autentica.TAMANHO_MAX_SENHA;

        if(senha != null && senha.length() > range){
            return false;
        }
       // Autentica.autenticaStatico(senha); só consigo usar metodo estatico da interface se for assim (ISSO É INSTANCIAR)
        return this.senha.equals(senha);
    }
}
