public class Teste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10);

        calc.somar(5);
        calc.subtrair(10);
        calc.multiplicar(3);
        calc.dividir(0);

        System.out.println("Resultado: " + calc.getTotal());
    }
}