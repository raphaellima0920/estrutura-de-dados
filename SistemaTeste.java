public class SistemaTeste {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Raphael", 123456789, "raphael@gmail.com");
        Cliente cliente2 = new Cliente("Igor", 987654321, "igor@gmail.com");
        Cliente cliente3 = new Cliente("Ramon", 192837465, "ramon@gmail.com");
        
        ListaDupla listaClientes = new ListaDupla();
        listaClientes.inserirInicio(cliente1);
        listaClientes.inserirFim(cliente2);
        listaClientes.inserirMeio(cliente3, 1);
        
        System.out.println("Lista de Clientes:");
        listaClientes.exibir();
        listaClientes.removerInicio();
        System.out.println("\nApós remover do início:");

        listaClientes.exibir();        
        listaClientes.removerFim();
        System.out.println("\nApós remover do fim:");
        listaClientes.exibir();
        

        Produto produto1 = new Produto("Maça",30,10.0);
        Produto produto2 = new Produto("Cacau",5,10.0);
        Produto produto3 = new Produto("Manga",23,10.0);

        PilhaProduto pilhaProdutos = new PilhaProduto();
        pilhaProdutos.empilhar(produto1);
        pilhaProdutos.empilhar(produto2);
        pilhaProdutos.empilhar(produto3);
        
        System.out.println("\nPilha de Produtos:");
        pilhaProdutos.exibir();
        pilhaProdutos.desempilhar();
        System.out.println("\nApós desempilhar:");
        pilhaProdutos.exibir();
        
        System.out.println("\nProduto no topo da pilha: " + pilhaProdutos.verTopo());
        
        Vendedor vendedor1 = new Vendedor("Lucas", 111222333, "Lucas@gmail.com");
        Vendedor vendedor2 = new Vendedor("Daniel", 444555666, "daniel@gmail.com");
        Vendedor vendedor3 = new Vendedor("Mario", 777888999, "mario@gmail.com");
        
        VendedorLista listaVendedores = new VendedorLista();
        listaVendedores.inserirInicio(vendedor1);
        listaVendedores.inserirFim(vendedor2);
        listaVendedores.inserirMeio(vendedor3, 1);
        
        System.out.println("\nLista de Vendedores:");
        listaVendedores.exibir();
        
        listaVendedores.removerInicio();
        System.out.println("\nApós remover do início:");
        listaVendedores.exibir();
        
        listaVendedores.removerFim();
        System.out.println("\nApós remover do fim:");
        listaVendedores.exibir();
        
        ArvoreVendas arvoreVendas = new ArvoreVendas();

    
        Vendas venda1 = new Vendas(cliente1, produto1, 3);
        Vendas venda2 = new Vendas(cliente2, produto2, 5);
        Vendas venda3 = new Vendas(cliente3, produto3, 7);

        arvoreVendas.inserir(venda1);
        arvoreVendas.inserir(venda2);
        arvoreVendas.inserir(venda3);

       
        System.out.println("\nVendas em ordem:");
        arvoreVendas.exibirVendas();

 
        int idParaBuscar = 2;
        Vendas vendaBuscada = arvoreVendas.buscar(idParaBuscar);
        if (vendaBuscada != null) {
            System.out.println("\nVenda encontrada para o ID " + idParaBuscar + ":");
            System.out.println(vendaBuscada);
        } else {
            System.out.println("\nNenhuma venda encontrada para o ID " + idParaBuscar);
        }

        
        arvoreVendas.subtrairQuantidade();
        
        Avaliacao avaliacao1=new Avaliacao(5,"O melhor da região");
        Avaliacao avaliacao2 = new Avaliacao(5, "Excelente serviço!");
        Avaliacao avaliacao3 = new Avaliacao(3, "Poderia ser melhor.");

        FilaAvaliacoes filaAvaliacoes = new FilaAvaliacoes();
        filaAvaliacoes.adicionarAvaliacao(avaliacao1);
        filaAvaliacoes.adicionarAvaliacao(avaliacao2);
        filaAvaliacoes.adicionarAvaliacao(avaliacao3);

        System.out.println();
        filaAvaliacoes.exibirAvaliacoes();

        System.out.println("\nRemovendo uma avaliação:");
        filaAvaliacoes.removerAvaliacao();

        System.out.println("\nApós remover:");
        filaAvaliacoes.exibirAvaliacoes();
    }
    }
    
    

