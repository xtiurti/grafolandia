/* 
 * Classe que contêm as Estações do Metrô da Grafolândia
 * Vértices pertencentes ao Grafo
 */
import java.util.ArrayList;
import java.util.List;

public class Grafo {
	 // Lista de vértices do Grafo, ou seja, as estações ao Metrô da Grafolândia
	 private List<Point> vertices = new ArrayList<Point>();
	 // Lista das arestas do Grafo
	 private List<Aresta> arestas = new ArrayList<Aresta>();   
     // Adiciona os vértices ao Grafo
     public void setVertice(Point novoVertice){
             this.vertices.add(novoVertice);
     }
     // Retorna a lista de vértices, estações do Metrô
     public List<Point> getVertices() {
             return this.vertices;
     }
     //Método que retorna o vértice cuja descrição é igual à procurada.
     public Point encontrarVertice(String nome){
         for (int i = 0; i < this.getVertices().size() ; i++){
             if (nome.equalsIgnoreCase(this.getVertices().get(i).getDescricao())){
                 return this.getVertices().get(i);
             }
         }
         return null;
     }
     // Adiciona todas as Arestas dos Vértices ao Grafo
     public void setArestas(){
    	 for (int i = 0; i < this.getVertices().size() ; i++){
    		 for (int j = 0; j < this.getVertices().get(i).getArestas().size(); j++) {
    			 this.arestas.add(this.getVertices().get(i).getArestas().get(j));
    		 }
    	 }
     }
     // Retorna a aresta a apartir dos vértices de origem e destino
     public Aresta encontrarAresta(Point origem, Point destino){
    	 for (int i = 0; i < this.arestas.size() ; i++){
    		 if ((arestas.get(i).getOrigem() == origem) && (arestas.get(i).getDestino() == destino))
    			 return arestas.get(i);
    	 }
    	 return null;
     }
}
