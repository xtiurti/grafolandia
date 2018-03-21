/* 
 * Classe que cont�m as Esta��es do Metr� da Grafol�ndia
 * V�rtices pertencentes ao Grafo
 */
import java.util.ArrayList;
import java.util.List;

public class Grafo {
	 // Lista de v�rtices do Grafo, ou seja, as esta��es ao Metr� da Grafol�ndia
	 private List<Point> vertices = new ArrayList<Point>();
	 // Lista das arestas do Grafo
	 private List<Aresta> arestas = new ArrayList<Aresta>();   
     // Adiciona os v�rtices ao Grafo
     public void setVertice(Point novoVertice){
             this.vertices.add(novoVertice);
     }
     // Retorna a lista de v�rtices, esta��es do Metr�
     public List<Point> getVertices() {
             return this.vertices;
     }
     //M�todo que retorna o v�rtice cuja descri��o � igual � procurada.
     public Point encontrarVertice(String nome){
         for (int i = 0; i < this.getVertices().size() ; i++){
             if (nome.equalsIgnoreCase(this.getVertices().get(i).getDescricao())){
                 return this.getVertices().get(i);
             }
         }
         return null;
     }
     // Adiciona todas as Arestas dos V�rtices ao Grafo
     public void setArestas(){
    	 for (int i = 0; i < this.getVertices().size() ; i++){
    		 for (int j = 0; j < this.getVertices().get(i).getArestas().size(); j++) {
    			 this.arestas.add(this.getVertices().get(i).getArestas().get(j));
    		 }
    	 }
     }
     // Retorna a aresta a apartir dos v�rtices de origem e destino
     public Aresta encontrarAresta(Point origem, Point destino){
    	 for (int i = 0; i < this.arestas.size() ; i++){
    		 if ((arestas.get(i).getOrigem() == origem) && (arestas.get(i).getDestino() == destino))
    			 return arestas.get(i);
    	 }
    	 return null;
     }
}
