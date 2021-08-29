import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private List<Vertice> grafo = new ArrayList<Vertice>();

    public List<Vertice> getVertices() {
        return grafo;
    }

    public void addVertices(List<Vertice> grafo) {
        this.grafo = grafo;
    }

    public void addVertice(Vertice v){
        this.grafo.add(v);
    }

    public Vertice getVerticesByName(int identificador) {
        for (int i = 0; i < this.getVertices().size(); i++) {
            if (identificador == this.getVertices().get(i).getIdentificador()){
                return this.getVertices().get(i);
            }
        }
        return null;
    }

    public int qtdArestas(){
        int qtd = 0;
        for (int i = 0; i < grafo.size(); i++) {
            qtd += grafo.get(i).getArestas().size();
        }
        return qtd;
    }
}
