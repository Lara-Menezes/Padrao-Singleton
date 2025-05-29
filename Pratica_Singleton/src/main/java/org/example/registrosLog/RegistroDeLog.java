package org.example.registrosLog;

import java.io.FileWriter;
import java.io.IOException;

public class RegistroDeLog {

    private static RegistroDeLog instancia;
    private FileWriter escrever;

    private RegistroDeLog() {
        try {
            escrever = new FileWriter("registro.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void registrar(String mensagem) {
        try {
            escrever.write(mensagem + "\n");
            escrever.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static RegistroDeLog getInstancia() {
        if (instancia == null) {
            instancia = new RegistroDeLog();
        }
        return instancia;
    }
}

