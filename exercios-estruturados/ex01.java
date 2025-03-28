import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        System.out.println("Digite uma temperatura em celsius: ");


//        Criando um objeto scanner e declarando variavel
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();

//        Declarando as formulas
        double fahrenheit = (celsius * 1.8 + 32);
        double kelvin = (celsius + 273.15);


        System.out.println(celsius + "celsius em fahrenheit é: " + fahrenheit);
        System.out.println(celsius + "celsius em kelvin é: " + kelvin);


    }
}