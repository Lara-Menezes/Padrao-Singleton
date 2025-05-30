package org.example.usuarioAtivo;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = Usuario.getInstance("Thallyta");
        Usuario usuario2 = Usuario.getInstance("Maria");

        usuario1.exibirInformacoes();
        usuario2.exibirInformacoes();

        System.out.println("Instância única? " + (usuario1 == usuario2)); // Deve retornar true
    }
}