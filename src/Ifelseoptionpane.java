import java.util.Locale;
import javax.swing.JOptionPane;
//import java.util.Scanner;

public class Ifelseoptionpane {
    public static void main(String[] args) throws Exception {
     
        int idade;
        double altura;
        String time;
        Locale.setDefault(Locale.US);
        //Scanner sc = new Scanner(System.in);
        
        //System.out.print("Digite sua idade: ");
        //idade = sc.nextInt();
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Sua idade "));
        
        //System.out.print("Digite sua altura: ");
        //altura = sc.nextDouble();
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura: "));

        //System.out.print("Digite nome do time:");
        //time = sc.next();
        time = JOptionPane.showInputDialog(null, "Digite seu time: ");

        if((idade >= 18 || altura >= 1.80) && time.equals("flamengo")){
            JOptionPane.showMessageDialog(null, "Candidato Qualificado!");
        }else{
            JOptionPane.showMessageDialog(null, "Candidato nao Qualificado!");
            
        }
        //sc.close();
        }
}
