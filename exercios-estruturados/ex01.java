import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;

        System.out.println(celsius + " Celsius em Fahrenheit é: " + fahrenheit);
        System.out.println(celsius + " Celsius em Kelvin é: " + kelvin);

        scanner.close();
    }
}