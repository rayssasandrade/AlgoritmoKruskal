public class Aresta implements Comparable<Aresta> {

    private int peso;
    private Vertice origem;
    private Vertice destino;

    public Aresta(int peso, Vertice v1, Vertice v2) {
        this.peso = peso;
        this.origem = v1;
        this.destino = v2;

    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    @Override
    public int compareTo(Aresta aresta) {
        return peso - aresta.peso;
    }
}