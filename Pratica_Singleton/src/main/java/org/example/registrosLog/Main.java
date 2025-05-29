package org.example.registrosLog;

public class Main {
    public static void main(String[] args) {

        RegistroDeLog log1 = RegistroDeLog.getInstancia();
        RegistroDeLog log2 = RegistroDeLog.getInstancia();

        log1.registrar("Iniciando a aplicação.");
        log2.registrar("Conexão com o banco de dados estabelecida.");
        log1.registrar("Processo finalizado com sucesso.");

        System.out.println("Instância única? " + (log1 == log2));

        System.out.println(log1);
        System.out.println(log2);
    }
}
