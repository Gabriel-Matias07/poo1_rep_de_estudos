public class Teste {
    public static void main(String[] args) {
        Pedido meuPedido = new Pedido();
        Sorvete bola1 = new Sorvete("chocolate", 5);
        Sorvete bola2 = new Sorvete("morango", 8.5);
        Sorvete bola3 = new Sorvete("flocos", 10);

        meuPedido.adicionar(bola1);
        meuPedido.adicionar(bola2);
        meuPedido.adicionar(bola3);
        // meuPedido.adicionar(new Sorvete("baunilha", 3));

        System.out.println(meuPedido.exibirTotal());
    }
}