public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private int procoUnitarioEmCentavos;

    public ItemPedido(Produto produto, int quantidade, int precoUnitarioEmCentavos) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.procoUnitarioEmCentavos = precoUnitarioEmCentavos;
    }

    public int valor() {
        return quantidade * procoUnitarioEmCentavos;
    }   

    @Override
    public String toString() {
        return produto.getNome() + " - " + quantidade + " unidades - R$ " + (valor() / 100.0);
    }
}