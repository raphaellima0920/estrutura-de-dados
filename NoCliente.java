
public class NoCliente {
    Cliente cliente;
    NoCliente proximo;
    NoCliente anterior;

    public NoCliente(Cliente cliente) {
        this.cliente = cliente;
        this.proximo = null;
        this.anterior = null;
    }
    
    
    
}
