package br.com.fiap.main;
import java.io.IOException;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Pessoa;


public class UsaPessoa {
    public static void main(String[] args) {
        String aux, Npasta, nome, email, path;
        int opcao;
        Pessoa pessoa;

        do {
            try {
                aux = JOptionPane.showInputDialog("Escolha:\n1- Cadastrar\n2-Consultar");
                opcao = Integer.parseInt(aux);
                path = JOptionPane.showInputDialog("Digite o caminho da pasta.");

                pessoa = new Pessoa();//atalho para o outro

                switch (opcao) {
                    case 1:
                        Npasta = JOptionPane.showInputDialog("Digite nome da Pasta");
                        nome = JOptionPane.showInputDialog("Digite o nome");
                        email = JOptionPane.showInputDialog("Digite o email");

                        pessoa.setNpasta(Npasta);
                        pessoa.setNome(nome);
                        pessoa.setEmail(email);


                        JOptionPane.showMessageDialog(null, pessoa.gravar(path));
                        break;
                    case 2:
                        Npasta = JOptionPane.showInputDialog("Digite o código");
                        pessoa.setNpasta(Npasta);
                        pessoa = pessoa.ler(path);

                        if(pessoa == null){
                            JOptionPane.showMessageDialog(null, "Caminho e/ou informado inexistente!");

                        }else{
                            JOptionPane.showMessageDialog(null, "Exibindo Dados:\nCaminho: " + path + "\nArquivo: " + path + "/" + pessoa.getNpasta() + ".txt" + "\nCódigo: " + pessoa.getNpasta() + "\nNome: " + pessoa.getNome() + "\nEmail: " + pessoa.getEmail());
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha incorreta!");
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro de conversão!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }

            catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar o arquivo!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }

            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de Programa!");
    }
}