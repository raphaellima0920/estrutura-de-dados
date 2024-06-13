
public class PilhaProduto {
    private NoProduto topo;
    private int tamanho;
    
    public void empilhar(Produto produto){
        NoProduto no = new NoProduto(produto);
        if(topo==null){
            topo=no;
        }else{
            no.proximo=topo;
            topo=no;
            
        }
        tamanho++;
    }
    public Produto desempilhar(){
        if(topo==null){
            System.out.println("a pilha esta vazia");
            return null;
        }else {
            Produto prodRemovido=topo.produto;
            topo=topo.proximo;
            tamanho--;
            return prodRemovido;
        }
    }
    
    public Produto verTopo(){
        if(topo==null){
            System.out.println("A pilha esta vazia, não ha nada para ver aq");
            return null;
        }else{
            return topo.produto;
        }
    }

    public int getTamanho() {
        return tamanho;
    }
   
     public void exibir() {
        NoProduto local = topo;
        while (local != null) {
            System.out.println(local.produto);
            local = local.proximo;
        }
    }
    
}
