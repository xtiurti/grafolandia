/* 
 * Classe das Linhas entre as Estações
 */
public class Aresta {
	 private int peso;        // Tempo
	 private Point origem;  // Estação de Origem
	 private Point destino; // Estação de Destino
	 private String linha;      // Linha: R- Red; Y-Yellow; G-Green; L-Lilac; B-Blue
	    
	 public Aresta(Point v1, Point v2, String l, int p){
	     this.peso = p;
	     this.origem = v1;
	     this.destino = v2;
	     this.linha = l;
	 }
	 // Retorna a Tempo
	 public int getPeso(){
	     return peso;
	 }
     // Retorna a Estação de Destino
	 public Point getDestino() {
	     return destino;
	 }
     // Retorna a Estação de origem
	 public Point getOrigem() {
	     return origem;
	 }
	 // Retorna o código da Linha
	 public String getLinha() {
	     return linha;
	 }
}
