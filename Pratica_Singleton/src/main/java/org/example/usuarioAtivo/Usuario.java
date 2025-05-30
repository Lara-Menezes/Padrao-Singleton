package org.example.usuarioAtivo;


//Eu usei o padrão Singleton na classe Usuario para garantir que apenas um usuário fique logado por vez.
//Tornei o construtor privado e criei o método getInstance(), que cria o usuário só se ainda não existir.
//Também adicionei um método logout() para permitir trocar de usuário. No Main, usei getInstance()
// em vez de new para manter apenas uma instância ativa.

public class Usuario {

    private static Usuario instanciaUnica;

    private String nome;

    private Usuario(String nome) {
        this.nome = nome;
    }

    public static Usuario getInstance(String nome) {
        if (instanciaUnica == null) {
            instanciaUnica = new Usuario(nome);
        } else {
            System.out.println("Já existe um usuário logado: " + instanciaUnica.nome);
        }
        return instanciaUnica;
    }

    public void exibirInformacoes() {
        System.out.println("Usuário logado: " + nome);
    }

    public static void logout() {
        instanciaUnica = null;
    }
}
