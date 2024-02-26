import javax.swing.JOptionPane;
import java.util.ArrayList;

public class bingo {
    public static void main(String[] args) {
        String aux;
        int ncarelas, njogadores;
        ArrayList<String> p1,p2,p3,p4,p5 = new ArrayList<String>();
        ArrayList<Integer> c1,c2,c3,c4,c5 = new ArrayList<Integer>();


        
        
        try {
            aux = JOptionPane.showInputDialog("Informe o número de jogadores: ");
            njogadores = Integer.parseInt(aux);

            for(int i = 0;i < njogadores; i++){
                
                
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
