
public class NoVendedor {
    Vendedor vendedor;
    NoVendedor proximo;
    NoVendedor anterior;

    public NoVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        this.proximo = null;
        this.anterior = null;
    }
}
