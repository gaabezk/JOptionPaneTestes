import javax.swing.JOptionPane;

public class Calc {
    public static void main(String[] args) throws Exception {
        
        String operador;
        double num1,num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero "));

        operador = JOptionPane.showInputDialog(null, "Digite um Operador: ");

        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro numero "));

       switch (operador){
            case "+":
                JOptionPane.showMessageDialog(null,"Resultado da Soma: "+(num1 + num2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null,"Resultado da Subtração: "+(num1 - num2));
                break;
            case "*":
                JOptionPane.showMessageDialog(null,"Resultado da Multiplicação: "+(num1 * num2));
                break;
            case "/":
                JOptionPane.showMessageDialog(null,"Resultado da Divisão: "+(num1 / num2));
                break;
            default:
                JOptionPane.showMessageDialog(null,"Operação Invalida!");
        }
    }
}