package br.com.fiap.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Pessoa {
    private String Npasta;
    private String nome;
    private String email;

    public Pessoa(){}

    public String getNpasta() {
        return Npasta;
    }

    public void setNpasta(String npasta) {
        this.Npasta = npasta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoa ler(String path) throws IOException{
        //criando um arquivo txt no endereçamento path e adicionando um arquivo txt. Em seguida br esta encarregado do endereço do txt
        BufferedReader br = new BufferedReader(new FileReader(path + "/" + Npasta + ".txt"));

        Npasta = br.readLine();
        nome = br.readLine();
        email = br.readLine();
        br.close(); // Necessario para liberar espaço na maquina, evitar erros e por segurança.
        return this;
    }

    public String gravar(String path){
        try {
            File dir = new File(path);
            if(!dir.exists()){
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + Npasta + ".txt");
            pw.println(Npasta);
            pw.println(nome);
            pw.println(email);
            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso!";
        } catch (IOException e) {
            return "Falha ao gravar arquivo!\n" + e.getMessage();
        }
    }

}