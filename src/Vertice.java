import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vertice{

    private int identificador;
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

    public ArrayList<Vertice> getAdjacentes() {
        return adjacentes;
    }

    public void setAdjacentes(ArrayList<Vertice> adjacentes) {
        this.adjacentes = adjacentes;
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