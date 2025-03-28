import java.util.Scanner;

public class Ex02{
    public static void main(String[] args) {
        int qtd_mulheres = 0;
        int qtd_homens = 0;
        double altura_mulheres = 0;
        double altura_homens = 0;
        int sexo;

        for (int i = 0; i < 10; i++){
            System.out.println("Escolha o sexo da pessoa: (1 - Mulher, 2 - Homem): ");
            Scanner scanner = new Scanner(System.in);
            sexo = scanner.nextInt();

            System.out.println("Digite a altura: ");
            altura = scanner.nextDouble();

            if (sexo == 1){
                qtd_mulheres++;
            } else if (sexo == 2){
                qtd_homens++;
            }
            else{
                System.out.println("Entrada Inválida");
            }


        }
    }
}