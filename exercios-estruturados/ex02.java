import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int qtd_mulheres = 0;
        int qtd_homens = 0;
        double altura_mulheres = 0;
        double altura_homens = 0;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        int sexo;
        double altura;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha o sexo da pessoa (1 - Mulher, 2 - Homem): ");
            sexo = scanner.nextInt();

            System.out.println("Digite a altura: ");
            altura = scanner.nextDouble();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (sexo == 1) {
                qtd_mulheres++;
                altura_mulheres += altura;
            } else if (sexo == 2) {
                qtd_homens++;
                altura_homens += altura;
            } else {
                System.out.println("Entrada Inválida");
            }
        }

        double mediaHomens = (qtd_homens > 0) ? altura_homens / qtd_homens : 0;

        // Exibindo os resultados
        System.out.println("A maior altura do grupo é: " + maiorAltura);
        System.out.println("A menor altura do grupo é: " + menorAltura);
        System.out.println("A média de altura dos homens é: " + mediaHomens);
        System.out.println("O número de mulheres é: " + qtd_mulheres);
    }
}