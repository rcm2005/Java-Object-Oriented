//Rafael Carvalho Mattos RM99874
package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.DragonBallSuper;

/**
 * Classe principal do programa que interage com o usuário para realizar operações de cadastro e consulta de personagens do Dragon Ball Super.
 * 
 * @author Rafael Carvalho Mattos - 99874
 */
public class UsaDBSuper {
    /**
     * Método main do programa.
     * 
     * @param args argumentos da linha de comando (não utilizados)
     * @author Rafael Carvalho Mattos - 99874
     */
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Dragon Ball Super", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Cadastrar Personagem", "Consultar Personagem", "Sair"}, null);
            switch (opcao) {
                case 0:
                    cadastrarPersonagem();
                    break;
                case 1:
                    consultarPersonagem();
                    break;
                case 2:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Obrigado por usar o programa!");
                    break;
            }
        }
    }

    /**
     * Método para cadastrar um personagem do Dragon Ball Super.
     * 
     * @author Rafael Carvalho Mattos - 99874
     */
    private static void cadastrarPersonagem() {
        String nomeChar = JOptionPane.showInputDialog("Informe o nome do personagem:");
        int ki = Integer.parseInt(JOptionPane.showInputDialog("Informe o nível de ki do personagem:"));
        int transformacoes = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de transformações do personagem:"));
        int tecnicas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de técnicas do personagem:"));
        int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade do personagem:"));
        String path = JOptionPane.showInputDialog("Informe o caminho da pasta para gravar o arquivo:");

        DragonBallSuper personagem = new DragonBallSuper();
        personagem.setNomeChar(nomeChar);
        personagem.setKi(ki);
        personagem.setTransformacoes(transformacoes);
        personagem.setTecnicas(tecnicas);
        personagem.setVelocidade(velocidade);

        String resultado = personagem.gravar(path);
        JOptionPane.showMessageDialog(null, resultado);
    }

    /**
     * Método para consultar um personagem do Dragon Ball Super.
     * 
     * @author Rafael Carvalho Mattos - 99874
     */
    private static void consultarPersonagem() {
        String nomeChar = JOptionPane.showInputDialog("Informe o nome do personagem:");
        String path = JOptionPane.showInputDialog("Informe o caminho da pasta para ler o arquivo:");

        DragonBallSuper personagem = new DragonBallSuper();
        personagem.setNomeChar(nomeChar);

        try {
            personagem.ler(path);
            JOptionPane.showMessageDialog(null, "Nome: " + personagem.getNomeChar() + "\nKi: " + personagem.getKi() + "\nTransformações: " + personagem.getTransformacoes() + "\nTécnicas: " + personagem.getTecnicas() + "\nVelocidade: " + personagem.getVelocidade());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo: " + e.getMessage());
        }
    }
}