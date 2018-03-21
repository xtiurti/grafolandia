/*
 *  Exemplo retirado de http://fr.wikipedia.org/wiki/Algorithme_de_Dijkstra
 *  					https://code.google.com/p/projeto-algoritmos-em-grafos-java/source/browse/#svn%2Ftrunk%2FAlgoritmosEmGrafos-J%C3%BAlia%2Fsrc%2Falgoritmos
 */
import java.util.ArrayList;
import java.util.List;


public class Grafolandia {
	/*
	 * Criar o Grafo conforme o SMG - Sistema de Metrô da Grafolândia
	 */
	public static Grafo criarGrafo(){
        Grafo novoGrafo = new Grafo();
        //Criar vértices - Cada Estação do Metrô e Inserir vértices no grafo
        Point e01 = new Point("01","TERMINAL 1", true); novoGrafo.setVertice(e01); 
        Point e02 = new Point("02","TERMINAL 2", true); novoGrafo.setVertice(e02);
        Point e03 = new Point("03","TERMINAL 3", true); novoGrafo.setVertice(e03);
        Point e04 = new Point("04","TERMINAL 4", true); novoGrafo.setVertice(e04);
        Point e05 = new Point("05","TERMINAL 5", true); novoGrafo.setVertice(e05);
        Point e06 = new Point("06","TERMINAL 6", true); novoGrafo.setVertice(e06);
        Point e07 = new Point("07","PONTO 7"); novoGrafo.setVertice(e07);
        Point e08 = new Point("08","PONTO 8"); novoGrafo.setVertice(e08);
        Point e09 = new Point("09","PONTO 9"); novoGrafo.setVertice(e09);
        Point e10 = new Point("10","PONTO 10"); novoGrafo.setVertice(e10);
        Point e11 = new Point("11","PONTO 11"); novoGrafo.setVertice(e11);
        Point e12 = new Point("12","PONTO 12"); novoGrafo.setVertice(e12);
        Point e13 = new Point("13","PONTO 13"); novoGrafo.setVertice(e13);
        Point e14 = new Point("14","PONTO 14"); novoGrafo.setVertice(e14);
        Point e15 = new Point("15","PONTO 15"); novoGrafo.setVertice(e15);
        Point e16 = new Point("16","PONTO 16"); novoGrafo.setVertice(e16);
        Point e17 = new Point("17","PONTO 17"); novoGrafo.setVertice(e17);
        Point e18 = new Point("18","PONTO 18"); novoGrafo.setVertice(e18);
        Point e19 = new Point("19","PONTO 19"); novoGrafo.setVertice(e19);
        Point e20 = new Point("20","PONTO 20"); novoGrafo.setVertice(e20);
        Point e21 = new Point("21","PONTO 21"); novoGrafo.setVertice(e21);
        Point e61 = new Point("61","PONTO 21"); novoGrafo.setVertice(e61);
       
        
        //LINHA TERMINAL 
        e01.setAresta(new Aresta(e01, e02, "TERMINAIS", 8));
        e02.setAresta(new Aresta(e02, e01, "TERMINAIS",8));
        e02.setAresta(new Aresta(e02, e03, "TERMINAIS",5));
        e03.setAresta(new Aresta(e03, e02, "TERMINAIS",5));
        e03.setAresta(new Aresta(e03, e04, "TERMINAIS",14));
        e04.setAresta(new Aresta(e04, e03, "TERMINAIS",14));
        e04.setAresta(new Aresta(e04, e05, "TERMINAIS",6));
        e05.setAresta(new Aresta(e05, e04, "TERMINAIS",6));
        e05.setAresta(new Aresta(e05, e06, "TERMINAIS",7));
        e06.setAresta(new Aresta(e06, e05, "TERMINAIS",7));
        //LINHA UTFPR
        e02.setAresta(new Aresta(e02, e15, "UTFPR",9));
        e15.setAresta(new Aresta(e15, e02, "UTFPR",9));
        e15.setAresta(new Aresta(e15, e16, "UTFPR",2));
        e16.setAresta(new Aresta(e16, e15, "UTFPR",2));
        e16.setAresta(new Aresta(e16, e19, "UTFPR",3));
        e19.setAresta(new Aresta(e19, e16, "UTFPR",3));
        e19.setAresta(new Aresta(e19, e20, "UTFPR",4));
        e20.setAresta(new Aresta(e20, e19, "UTFPR",4));
        e20.setAresta(new Aresta(e20, e18, "UTFPR", 3));
        e18.setAresta(new Aresta(e18, e17, "UTFPR", 2));
        e17.setAresta(new Aresta(e17, e02, "UTFPR", 14));
        //LINHA UNICENTRO
        e03.setAresta(new Aresta(e03, e13, "UNICENTRO",5));
        e13.setAresta(new Aresta(e13, e10, "UNICENTRO",2));
        e10.setAresta(new Aresta(e10, e11, "UNICENTRO",6));
        e11.setAresta(new Aresta(e11, e21, "UNICENTRO",12));
        e21.setAresta(new Aresta(e21, e61, "UNICENTRO",5));
        e61.setAresta(new Aresta(e61, e17, "UNICENTRO", 10));
        e17.setAresta(new Aresta(e17, e03, "UNICENTRO", 3));
        //LINHA JORDAO
        e02.setAresta(new Aresta(e02, e08, "JORDAO",7));
        e08.setAresta(new Aresta(e08, e09, "JORDAO",6));
        e09.setAresta(new Aresta(e09, e13, "JORDAO",8));
        e13.setAresta(new Aresta(e13, e10, "JORDAO",7));
        e10.setAresta(new Aresta(e10, e11, "JORDAO",5));
        e11.setAresta(new Aresta(e11, e61, "JORDAO",8));
        e06.setAresta(new Aresta(e61, e02, "JORDAO",20));
        
        novoGrafo.setArestas();
        // Retorna o grafo 
        return novoGrafo;
	}

	/*
	 * Método main - Apresenta o caminho mínimo entre duas estações (vértices) do Metrô da Grafolândia
	 */
	public static void main(String args[]){
	     //
	     Grafo novoGrafo = criarGrafo();
	     List<Point> menorCaminho = new ArrayList<Point>();
	     Dijkstra algoritmoDijkstra = new Dijkstra();
         // Estação de Origem 	     
	     Point origem  = novoGrafo.encontrarVertice("61");
	     // Estação de Destino 0
	     Point destino = novoGrafo.encontrarVertice("05");
	     // Cálcular o caminho minimo
	     menorCaminho = algoritmoDijkstra.encontrarMenorCaminhoDijkstra(novoGrafo, origem, destino);
	     // Mostrar o caminho mínimo
	    
	     for (int i=0; i < menorCaminho.size(); i++){
	    	 if (i == menorCaminho.size()-1)
	    		 System.out.print(menorCaminho.get(i).getDescricao());
	    	 else
	    		 System.out.print(menorCaminho.get(i).getDescricao()+ " ->  ");
	     }
	}
}
