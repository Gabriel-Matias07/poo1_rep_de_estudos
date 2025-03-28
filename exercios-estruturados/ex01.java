import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Criando um objeto Scanner e declarando a variável celsius
        Scanner scanner = new Scanner(System.in);

        // Solicitando a temperatura em Celsius
        System.out.print("Digite uma temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Declarando as fórmulas
        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;

        // Mostrando os resultados
        System.out.println(celsius + " Celsius em Fahrenheit é: " + fahrenheit);
        System.out.println(celsius + " Celsius em Kelvin é: " + kelvin);

        // Fechando o scanner
        scanner.close();
    }
}