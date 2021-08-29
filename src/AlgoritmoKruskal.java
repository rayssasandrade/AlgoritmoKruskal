import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class AlgoritmoKruskal {

    private HashSet<Vertice> vertices;
    private ArrayList<Aresta> arestas;
    private ArvoreGeradoraMinima agm;

    public AlgoritmoKruskal(HashSet  vertices2, ArrayList<Aresta> arestas2){
        this.vertices = vertices2;
        this.arestas = arestas2;
        agm = new ArvoreGeradoraMinima();
    }

    public ArvoreGeradoraMinima criaAGM(int n){
        for (int i = 0; i < n; i++) {
            if (!formaCiclo(arestas.get(i))){
                agm.addAresta(arestas.get(i));
            }
        }
        return  agm;
    }

    public boolean formaCiclo(Aresta candidata){
        boolean r = false;
        ArrayList<Vertice> avO = candidata.getOrigem().getAdjacentes();
        for (Vertice v: avO) {
            if (agm.contem(v)){
                if(agm.contemAresta(v,candidata.getDestino()) && agm.contemAresta(v,candidata.getOrigem())){
                    r = true;
                    break;
                }
            }
        }
        ArrayList<Vertice> avD = candidata.getDestino().getAdjacentes();
        for (Vertice v: avD) {
            if (agm.contem(v)) {
                if(agm.contemAresta(v,candidata.getDestino()) && agm.contemAresta(candidata.getOrigem(),candidata.getDestino())){
                    r = true;
                    break;
                }
            }
        }

        return r;
    }

}