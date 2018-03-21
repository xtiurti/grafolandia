
import java.util.ArrayList;
import java.util.List;

public class Point implements Comparable<Point>{
        
        private String descricao;
        private String linha;
        private int distancia;
        private boolean visitado = false;
        private boolean terminal =  false;
        private Point pai;
        private List<Aresta> arestas = new ArrayList<Aresta>();
        
        public Point(String nome, String linha, boolean terminal) {
        	  this.descricao = nome;
        	  this.linha = linha;
        	  this.setTerminal(terminal);
		}
        
        public Point(String nome, String linha) {
      	  this.descricao = nome;
      	  this.linha = linha;
		}

        public String getLinha() {
			return linha;
		}

		public void setLinha(String linha) {
			this.linha = linha;
		}

		public String getDescricao(){
        	return descricao;
        }
        
        public void visitar(){
        	this.visitado = true;
        }
        
        public boolean verificarVisita(){
        	return visitado;
        }
        
        public void setDistancia(int distancia){
        	this.distancia = distancia;
        }
        
        public int getDistancia(){
        	return this.distancia;
        }
        
        public void setPai(Point pai){
        	this.pai = pai;
        }
        
        public Point getPai(){
        	return this.pai;
        }

        public void setAresta(Aresta aresta){
        	this.arestas.add(aresta);
        }        
        
        public List<Aresta> getArestas() {
        	return arestas;
        }

        @Override
        public int compareTo(Point vertice) {
                  if(this.getDistancia() < vertice.getDistancia()) return -1;
          else if(this.getDistancia() == vertice.getDistancia()) return 0;
          
          return 1;
        }
        
        @Override
        public boolean equals(Object obj) {
                if(obj instanceof Point){
                        Point vRef = (Point) obj;
                        if(this.getDescricao().equals(vRef.getDescricao())) return true;
                }
                return false;
        }
        
        @Override
        public String toString() {
                String s = " ";
                s+= this.getDescricao();
                return s;
        }

		public boolean getTerminal() {
			return terminal;
		}

		public void setTerminal(boolean terminal) {
			this.terminal = terminal;
		}
}