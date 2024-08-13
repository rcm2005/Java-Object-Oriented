package br.com.fiap.main;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<String, String>();
        do{
            try {
                String sigla, estado;

                do {
                    sigla = JOptionPane.showInputDialog("Digite a UF (unidade federal) do estado ou digite \"Fim\" para encerrar").toUpperCase();

                    if (!sigla.equals("FIM")) {
                        estado = JOptionPane.showInputDialog("Digite o nome completo do Estado informado anteriormente");
                        if (mapa.containsKey(sigla)) {
                            JOptionPane.showInputDialog("Estado já foi cadastrado bixo");
                            
                        } else {
                            mapa.put(sigla, estado);
                        }
                    }
                } while (!sigla.equals("FIM"));
                String escolha = JOptionPane.showInputDialog("Digite a UF de um estado de sua escolha: ");
                if (mapa.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "O nome completo deste estado é: " + mapa.get(escolha));
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Estado ainda não cadastrado");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }while(JOptionPane.showConfirmDialog(null, "Deseja continuar", "Atenção", JOptionPane.YES_NO_OPTION) == 0);
    JOptionPane.showMessageDialog(null, "fim do programa");
    }
}
