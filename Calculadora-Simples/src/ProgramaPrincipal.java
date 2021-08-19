import java.util.Scanner;

public class ProgramaPrincipal {
    
    public static void main(String args[]){

        Calculadora calc = new Calculadora();
        Scanner input = new Scanner(System.in);

        // Calculadora[] calcu;

        boolean looping = true;

        while(looping){

            calc.opcoes();
            String escolha = input.next();
            
            System.out.println("Número 1");
            calc.numero1 = input.nextDouble();
            System.out.println("Número 2");
            calc.numero2 = input.nextDouble();
            
            calc.computador(escolha);
            
            if(escolha == "-exit"){
                break;
            }
        }


    }
}
