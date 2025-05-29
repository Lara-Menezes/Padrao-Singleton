package org.example.usuarioAtivo;


public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Thallyta");
        Usuario usuario2 = new Usuario("Maria");

        usuario1.exibirInformacoes();
        usuario2.exibirInformacoes();

        System.out.println("Instância única? " + (usuario1 == usuario2));
    }
}