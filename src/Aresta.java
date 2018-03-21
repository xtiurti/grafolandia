/* 
 * Classe das Linhas entre as Esta��es
 */
public class Aresta {
	 private int peso;        // Tempo
	 private Point origem;  // Esta��o de Origem
	 private Point destino; // Esta��o de Destino
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
     // Retorna a Esta��o de Destino
	 public Point getDestino() {
	     return destino;
	 }
     // Retorna a Esta��o de origem
	 public Point getOrigem() {
	     return origem;
	 }
	 // Retorna o c�digo da Linha
	 public String getLinha() {
	     return linha;
	 }
}
