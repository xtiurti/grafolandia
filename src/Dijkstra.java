/*
 * Classe para calular o caminho minimo entre dois vértices
 * Usando o algoritmo de Dijkstra
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dijkstra {
    List<Point> menorCaminho = new ArrayList<Point>(); // Lista dos vertices pertencentes ao menor caminho
    Point caminho = new Point("caminho", null);   // Recebe o vertices de menor caminho
    Point atual = new Point("actual", null);    // Guarda o vertice que esta sendo visitado
    Point vizinho = new Point("vizinho", null);   // Marca o vizinho do vertice atualmente visitado
    List<Point> naoVisitados = new ArrayList<Point>(); // Lista dos vertices que ainda nao foram visitados
    int trocarLinha = 10;                       // Valor para acrescentar a cada mudança de linha do caminho 
    
    /*
     * Algoritmo de Dijkstra Modificado
     */
    public List<Point> encontrarMenorCaminhoDijkstra(Grafo grafo, Point v1, Point v2) {
		// Adiciona a origem na lista do menor caminho
        menorCaminho.add(v1);
        // Colocando a distancias iniciais
        for (int i = 0; i < grafo.getVertices().size(); i++) {
                // Vertice atual tem distancia zero, e todos os outros, 9999("infinita")
                if (grafo.getVertices().get(i).getDescricao().equals(v1.getDescricao()))
                        grafo.getVertices().get(i).setDistancia(0);
                else
                        grafo.getVertices().get(i).setDistancia(9999);
                //Insere o vertice na lista de vertices nao visitados 
                this.naoVisitados.add(grafo.getVertices().get(i));
        }
//        Collections.sort(naoVisitados);
        System.out.println(naoVisitados);
        
        
        // O algoritmo continua ate que todos os vertices sejam visitados
        while (!this.naoVisitados.isEmpty()) {
        	// Toma-se sempre o vertice com menor distancia, que eh o primeiro da lista
        	atual = this.naoVisitados.get(0);
        	/*
        	 * Para cada vizinho (cada aresta), calcula-se a sua possivel
        	 * distancia, somando a distancia do vertice atual com a da aresta
        	 * correspondente. Se essa distancia for menor que a distancia do
        	 * vizinho, esta eh atualizada.
        	 */
        	for (int i = 0; i < atual.getArestas().size(); i++) {
        		vizinho = atual.getArestas().get(i).getDestino();
        		if (!vizinho.verificarVisita()){
        			int distancia = atual.getDistancia() + atual.getArestas().get(i).getPeso();
        			
        			// Comparando a distância do vizinho com a possível distância
                    if (vizinho.getDistancia() > distancia) {
                        vizinho.setDistancia(distancia);
                        vizinho.setPai(atual);
           
                        // Se o vizinho eh o vertice procurado, e foi feita uma mudanca na distancia, a lista com o menor caminho
                        // anterior eh apagada, pois existe um caminho menor vertices pais, ateh o vertice origem.
                        if (vizinho == v2) {
                        	menorCaminho.clear();
                            caminho = vizinho;
                            menorCaminho.add(vizinho);
                            while (caminho.getPai() != null) {
                            	menorCaminho.add(caminho.getPai());
                                caminho = caminho.getPai();
                                }
                            // Ordena a lista do menor caminho, para que ele seja exibido da origem ao destino.
                            Collections.sort(menorCaminho);
                            }
                        }
                    }
        		}
        	// Marca o vertice atual como visitado e o retira da lista de nao visitados
        	atual.visitar();
            this.naoVisitados.remove(atual);
            // Ordena a lista, para que o vertice com menor distancia fique na primeira posicao
            Collections.sort(naoVisitados);
            }
        linha(menorCaminho);
        return menorCaminho;
    }
    
 
    
    //lista o caminho
    
    public void linha(List<Point> lista) {
    	Hour a = new Hour();
    	System.out.println("Pegue o Onibus da linha: " + lista.get(1).getArestas().get(1).getLinha() + " as " + a.hora + ":" +a.min);
    	
    	for (int i = 0; i < lista.size() - 1; i++) {
			switch (lista.get(i).getDescricao()) {
			case "01":
				System.out.println("TERMINAL 01 x " + lista.get(i + 1).getLinha());
				break;
			case "02":
				System.out.println("TERMINAL 02 x " + lista.get(i + 1).getLinha());
				break;
			case "03":
				System.out.println("TERMINAL 03 x " + lista.get(i + 1).getLinha());
				break;
			case "04":
				System.out.println("TERMINAL 04 x " + lista.get(i + 1).getLinha());
				break;
			case "05":
				System.out.println("TERMINAL 05 x " + lista.get(i + 1).getLinha());
				break;
			case "06":
				System.out.println("TERMINAL 06 x " + lista.get(i + 1).getLinha());
				break;
			default:
				
				break;
			}
		}
    }
}
