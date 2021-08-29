import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    static HashSet<Vertice> vertices = new HashSet<Vertice>();
    static ArrayList<Aresta> arestas = new ArrayList<Aresta>();
    static Scanner input = new Scanner(System.in);

    /*  EXEMPLO DE ENTRADA
    6 10
    1 2 5
    1 4 2
    1 3 4
    2 3 3
    2 5 1
    5 3 2
    3 6 3
    5 6 4
    6 4 5
    3 4 3
     */

    public static void recebeEntrada(){
        System.out.println("Entre com a quantidade de arestas: ");
        int m = input.nextInt();
        for (int i = 0; i < m ; i++) {
            System.out.println("Entre com a origem, o destino e o peso da aresta: ");
            int x = input.nextInt();
            int y = input.nextInt();
            int peso = input.nextInt();
            Vertice r = verificaSeJaExiste(x);
            if (r == null) {
                r = new Vertice(x);
                vertices.add(r);
            }
            Vertice r2 = verificaSeJaExiste(y);
            if (r2 == null) {
                r2 = new Vertice(y);
                vertices.add(r2);
            }
            r.vinculaAdjacente(r2);
            r2.vinculaAdjacente(r);
            Aresta a = new Aresta(peso,r2,r);
            arestas.add(a);
        }
    }
    private  static Vertice verificaSeJaExiste(int identificador){
        for (Vertice aux : vertices) {
            if (aux.getIdentificador() == identificador)
                return aux;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Entre com a quantidade de vertices: ");
        int n = input.nextInt();
        recebeEntrada();
        Collections.sort(arestas);
        AlgoritmoKruskal kruskal = new AlgoritmoKruskal(vertices, arestas);
        ArvoreGeradoraMinima agm = kruskal.criaAGM(n);
        System.out.println("Árvore greadora mínima:");
        agm.printaAGM();
    }
}
