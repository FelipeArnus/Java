package br.com.fiap.bean;

import javax.swing.*;
import java.io.File;

public class ExcluiDiretorio {
    public static void main(String[] args) {
        try {
            String path = JOptionPane.showInputDialog("Digite o caminho da pasta (utilize / entre as pastas)");
            File dir = new File("d:/"+ path);
            String msg = "";
            if(dir.isDirectory()){
                if (dir.delete()) {
                    msg = dir.getName() + " excluido com sucesso!";
                } else {
                    if(excluirFilhos(dir)){
                        msg = dir.getName() + " excluido com sucesso!";
                    }else{
                        msg = "Falha ao excluir a pasta: " + dir.getName();
                    }
                }
                System.out.println(msg);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static boolean excluirFilhos(File dir){
        if(dir.isDirectory()){
            String[] arquivos = dir.list();
            for (String item : arquivos) {
                boolean sucesso = excluirFilhos(new File(dir, item));

                if (sucesso){
                    System.out.println("Excluido: " + item);
                }else{
                    System.out.println("Incapaz de excluir: " + item);
                    return false ;
                }
            }
        }
        return dir.delete();
    }
}