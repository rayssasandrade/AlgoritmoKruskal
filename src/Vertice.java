import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vertice implements Comparable<Vertice>{

    private int identificador;
    private int distancia;
    private boolean visitado = false;
    private Vertice pai;
    private ArrayList<Aresta> arestas = new ArrayList<Aresta>();
    private ArrayList<Vertice> adjacentes = new ArrayList<Vertice>();

    public Vertice(int identificador){
        this.identificador = identificador;
        this.adjacentes = new ArrayList<Vertice>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public Vertice getPai() {
        return pai;
    }

    public void setPai(Vertice pai) {
        this.pai = pai;
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(ArrayList<Aresta> arestas) {
        this.arestas = arestas;
    }

    public ArrayList<Vertice> getAdjacentes() {
        return adjacentes;
    }

    public void setAdjacentes(ArrayList<Vertice> adjacentes) {
        this.adjacentes = adjacentes;
    }

    @Override
    public int compareTo(Vertice vertice) {
        if(this.getDistancia() < vertice.getDistancia()) return -1;
        else if(this.getDistancia() == vertice.getDistancia()) return 0;
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertice)) return false;
        Vertice vertice = (Vertice) o;
        return identificador == vertice.identificador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public String toString() {
        String s = "";
        s+= this.getIdentificador();
        return s;
    }

    public void vinculaAdjacente(Vertice v) {
        adjacentes.add(v);
    }
}