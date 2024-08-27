package br.com.fiap.bean;

import java.io.File;

public class Manipula {
    // Contadores para arquivos e diretórios
    private static int directoryCount = 0;

    public static void main(String[] args) {
        String path = "d:/loja";
        File root = new File(path);

        conta(root);

        // Imprime o número total de diretórios
        System.out.println("Total de diretórios: " + directoryCount);
    }

    // Método recursivo para contar os diretórios
    private static void conta(File file) {
        directoryCount++;
        File[] files = file.listFiles();//Dentro de File[] crie uma lista (files)

        if (files != null) {//Se "files" não estiver vazio
            for (File f : files) {//directoryCount++ faz um furo na regra return
                System.out.println(f);
                conta(f);
            }
        }

    }
}
