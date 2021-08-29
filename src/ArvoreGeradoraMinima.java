import java.util.ArrayList;
import java.util.HashSet;

class ArvoreGeradoraMinima {

    private ArrayList<Aresta> aresta;
    private HashSet vertices;

    public ArvoreGeradoraMinima(){
        aresta = new ArrayList<Aresta>();
        vertices = new HashSet();
    }

    public  void addAresta(Aresta a){
        vertices.add(a.getOrigem());
        vertices.add(a.getDestino());
        aresta.add(a);
    }
    public  boolean contem(Vertice n){
        return vertices.contains(n);
    }
    public boolean contemAresta(Vertice o, Vertice d){
        for (Aresta a: aresta) {
            if (a.getOrigem()==o && a.getDestino()==d){
                return true;
            }
            if (a.getDestino() == o && a.getOrigem() ==d){
                return true;
            }
        }
        return false;
    }
    public void printaAGM(){
        for (Aresta a: aresta) {
            System.out.print("Origem: " + a.getOrigem().getIdentificador());
            System.out.println(", Destino:"+ a.getDestino().getIdentificador());
        }
    }
}
