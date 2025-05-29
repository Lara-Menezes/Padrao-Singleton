package org.example.usuarioAtivo;

//TODO: Problema - O sistema age como se os dois usuários estivessem logados ao mesmo tempo,
// o que não faz sentido num contexto de usuário único ativo.


public class Usuario {


    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("Usuário logado: " + nome);
    }
}
