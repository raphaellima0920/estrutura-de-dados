
public class NoProduto {
    NoProduto proximo;
    Produto produto;
    
    NoProduto(Produto produto){
        this.produto=produto;
        this.proximo=null;
    }
}
