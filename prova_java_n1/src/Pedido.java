public class Pedido {
    private String itens = "";
    private double total;

    public void adicionar(Sorvete sorvete) {
        itens += sorvete.getSabor() + " ";
        total += sorvete.getValor();
    }

    public String exibirTotal() {
        return "Pedido: " + itens + "\nTotal: R$ " + total;
    }
}