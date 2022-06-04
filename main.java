package main;

import arbitrage.BellmanFord;
import bean.Graph;
import io.ReadFile;


public class Main {
    public static void main(String[] args) {
        ReadFile rf = new ReadFile("arbi.txt");
        Graph g = rf.makeGraph();
//        for(int i : g.getVertices()){
//           BellmanFord bl = new BellmanFord(g, i-1); 
//        }
        BellmanFord bl = new BellmanFord(g, 0);
    }
}