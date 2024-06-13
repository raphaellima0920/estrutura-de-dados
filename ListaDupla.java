
public class ListaDupla {
 NoCliente inicio;
    NoCliente fim;
    int tamanho;
    
    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirInicio(Cliente cliente) {
        NoCliente no = new NoCliente(cliente);
        if (inicio == null) {
            inicio = no;
            fim = no;
        } else {
            no.proximo = inicio;
            inicio.anterior = no;
            inicio = no;
        }
        tamanho++;
    }
    
    public void inserirFim(Cliente cliente) {
        NoCliente no = new NoCliente(cliente);
        if (fim == null) {
            fim = no;
            inicio = no;
        } else {
            fim.proximo = no;
            no.anterior = fim;
            fim = no;
        }
        tamanho++;
    }
    
    public void inserirMeio(Cliente cliente, int index) {
        if (index <= 0) {
            inserirInicio(cliente);
            return;
        }
        NoCliente local = inicio;
        int aux = 0;
        while (local != null && aux < index - 1) {
            local = local.proximo;
            aux++;
        }
        
        if (local == null || local.proximo == null) {
            inserirFim(cliente);
        } else {
            NoCliente no = new NoCliente(cliente);
            no.proximo = local.proximo;
            no.anterior = local;
            local.proximo.anterior = no;
            local.proximo = no;
        }
        tamanho++;
    }
    
    public void removerInicio() {
        if (inicio == null) {
            System.out.println("Lista está vazia, não há nada para remover");
        } else if (inicio != null) {
            if (inicio.proximo == null) {
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.proximo;
                inicio.anterior = null;
            }
        }
        tamanho--;
    }
    
    public void removerFim() {
        if (fim == null) {
            System.out.println("A lista está vazia, não há nada para remover");
        } else if (fim != null) {
            if (fim.anterior == null) {
                inicio = null;
                fim = null;
            } else {
                fim = fim.anterior;
                fim.proximo = null;
            }
        }
        tamanho--;
    }
    
    public void removerMeio(int index) {
        if (index <= 0) {
            removerInicio();
            return;
        }
        NoCliente local = inicio;
        int aux = 0;
        while (local != null && aux < index) {
            local = local.proximo;
            aux++;
        }
        if (local == null || local.anterior == null || local.proximo == null) {
            removerFim();
        } else {
            local.anterior.proximo = local.proximo;
            local.proximo.anterior = local.anterior;
        }
        tamanho--;
    }
    
    public void exibir() {
        NoCliente local = inicio;
        while (local != null) {
            System.out.println("Nome:"+local.cliente.getNome()+" CPF:"+local.cliente.getCpf()+" Email:"+local.cliente.getEmail());
            local = local.proximo;
        }
    }
}
