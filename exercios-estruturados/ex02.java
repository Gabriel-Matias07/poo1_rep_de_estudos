import java.util.Scanner;

public class Ex02{
    public static void main(String[] args) {
        int qtd_mulheres = 0;
        // int qtd_homens = 0;
        double altura_mulheres = 0;
        double altura_homens = 0;
        int sexo;

        for (i = 5; i < 5; i++){
            System.out.println("Escolha o sexo da pessoa: (1 - Mulher, 2 - Homem): ");
            Scanner scanner = new Scanner(System.in);
            sexo = scanner.nextInt();

            if (sexo == 1){
                qtd_mulheres++;
            }
            if (sexo == 2){
                qtd_homens++;
            }
            else{
                System.out.println("Entrada Inválida");
            }
        }
    }
}