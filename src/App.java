public class App {
    public static void main(String[] args) {
        Produto produto = new Produto("Mouse Logitech", "ML123");
        ItemPedido item = new ItemPedido(produto, 2, 15990); // R$159,90 cada

        System.out.println("Pedido:");
        System.out.println(item);
    }
}