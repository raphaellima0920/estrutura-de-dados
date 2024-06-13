import java.util.concurrent.atomic.AtomicInteger;

    public class Vendas {
    private static final AtomicInteger count = new AtomicInteger(0); 
    int id;
    Cliente cliente;
    Vendedor vendedor;
    Produto produto;
    int quantVendida;
    
    
    public Vendas(Cliente cliente, Produto produto, int quantVendida) {
        this.id = count.incrementAndGet(); 
        this.cliente = cliente;
        this.produto = produto;
        this.quantVendida = quantVendida;
    }

    public int getId() {
        return id;
    }
    
    
    

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", cliente=" + cliente.getNome() + ", produto=" + produto.getNome() + ", quantidadeComprada=" + quantVendida + '}';
}
    }