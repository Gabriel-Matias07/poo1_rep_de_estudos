public class Sorvete {
    private String sabor;
    private double valor;

    public Sorvete(String sabor, double valor) {
        this.valor = valor;
        this.sabor = sabor;
    }

    public double getValor(){
        return valor;
    }

    public String getSabor(){
        return sabor;
    }
}
