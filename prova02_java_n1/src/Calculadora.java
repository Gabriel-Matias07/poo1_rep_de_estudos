public class Calculadora {
    private double total;

    public Calculadora(double total) {
        this.total = total;
    }

    public void somar(double valor){
        total += valor;
    }

    public void subtrair(double valor){
        total -= valor;
    }

    public void multiplicar(double valor){
        total *= valor;
    }

    public void dividir(double valor){
        if(valor == 0){
            System.out.println("Não é possivel dividr por zero!");
            return;
        }
        total /= valor;
    }

    public double getTotal() {
        return total;
    }
}
