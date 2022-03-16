import java.util.Locale;
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) throws Exception {

       
        int idade;
        double altura;
        String time;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();

        System.out.print("Digite nome do time:");
        time = sc.next();

        if((idade >= 18 || altura >= 1.80) && time.equals("flamengo")){
            System.out.println("Candidato qualificado!");
        }else{
            System.out.println("Candidato nao qualificado!");
        }

        
     



        }
}
