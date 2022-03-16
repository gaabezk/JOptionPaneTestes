package src;
import javax.swing.JOptionPane;

public class Imprimir {
    public static void main(String[] args) throws Exception {


    int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "3 * 3 é igual a: "));
        if (valor != 9)
            JOptionPane.showMessageDialog(null, "errou!");
        else
            JOptionPane.showMessageDialog(null, "acertou miseravi!!!");

    }
    
}
