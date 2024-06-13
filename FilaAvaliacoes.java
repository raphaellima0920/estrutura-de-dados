 
import java.util.LinkedList;
import java.util.Queue;

public class FilaAvaliacoes {
    private Queue<Avaliacao> fila;

    public FilaAvaliacoes() {
        this.fila = new LinkedList<>();
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        fila.offer(avaliacao);
    }

    public Avaliacao removerAvaliacao() {
        return fila.poll();
    }

    public void exibirAvaliacoes() {
        System.out.println("Avaliações:");
        for (Avaliacao avaliacao : fila) {
            System.out.println(avaliacao);
        }
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }
}
