import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        System.out.println("Digite uma temperatura em celsius: ");
//        Declarando as variaveis
        double celsius = 0.0;

//        Declarando as formulas

        double fahrenheit = (celsius * 1.8 + 32);
        double kelvin = (celsius + 273.15);


//        Criando um objeto scanner
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();


    }
}