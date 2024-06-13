
public class NoVendas {
    Vendas vendas;
    NoVendas esquerda;
    NoVendas direita;

    public NoVendas(Vendas vendas) {
        this.vendas = vendas;
        this.esquerda = null;
        this.direita = null;
    }
}
