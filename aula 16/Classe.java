import javax.swing.JOptionPane;

public class Classe {
    
    private String frase;
    private String palavra1;
    private String palavra2;


    public void usaFrase(){
        frase = JOptionPane.showInputDialog("Digite uma frase: ");

        System.out.println(frase.length());
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());

        palavra1 = JOptionPane.showInputDialog("Digite uma palavra que está na frase anterior: ");
        palavra2 = JOptionPane.showInputDialog("Digite uma palavra para substituí-la: ");
        System.out.println(frase.replace(palavra1,palavra2));
        System.out.println((frase.length()));

        
        
    
    }


}
