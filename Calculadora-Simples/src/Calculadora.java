public class Calculadora {
    
    double numero1;
    double numero2;
    double resultado;

    void opcoes(){
        System.out.println("------");
        System.out.println("1) + => SOMAR");
        System.out.println("2) - => SUBTRAIR");
        System.out.println("3) * => MULTIPLICAR");
        System.out.println("4) / => DIVIDIR");
        System.out.println("5) -exit => SAIR DO PROGRAMA");
        System.out.println("------");
    }

    void computador(String escolha){
        switch(escolha){
            case "+":
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
            break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
            break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
            break;
            case "/":
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
            break;
            default:
                System.out.println("Escolha uma das opções disponíveis!");
            break;
        }
    }
}
