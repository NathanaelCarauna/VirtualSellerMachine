/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Nathanael
 */
public class Troco {
    
    /**
     * 
     * @param listaDeMoedasDisponiveis
     * @param valorTroco
     * @param minimoDeMoedas
     * @param moedasUsadas
     * @return 
     */
    public static int calcularTrocoMoedas(int[] listaDeMoedasDisponiveis, int valorTroco, int[] minimoDeMoedas, int[] moedasUsadas){
        for(int centavo = 0; centavo<= valorTroco; centavo++){
            int contadorDeMoeda = centavo;
            int novaMoeda = 1;
            for(int moeda : listaDeMoedasDisponiveis){
                if(moeda <= centavo){
                    if(minimoDeMoedas[centavo-moeda]+1 < contadorDeMoeda){
                        contadorDeMoeda = minimoDeMoedas[centavo-moeda]+1;
                        novaMoeda = moeda;
                    }
                }
            }
            minimoDeMoedas[centavo] = contadorDeMoeda;
            moedasUsadas[centavo] = novaMoeda;                            
        }
        return minimoDeMoedas[valorTroco];
    }
    
    /**
     * 
     * @param moedasUsadas
     * @param troco
     * @return 
     */
    public static String imprimirMoedas(int[] moedasUsadas, int troco){
        int moeda = troco;
        String strMoedasUsadas = "";
        while(moeda > 0){
            int moedaAtual = moedasUsadas[moeda];
            strMoedasUsadas += moedaAtual;
            strMoedasUsadas += ", ";
            moeda = moeda - moedaAtual;
        }
        strMoedasUsadas = ""+strMoedasUsadas.subSequence(0, strMoedasUsadas.length()-2);
        return strMoedasUsadas;
    }
    
//    public static void main(String[] args) {
//        int valor = 63;
//        int[] listaDeMoedasDisponiveis = {1,5,10,21,25};
//        int[] moedasUsadas = new int[valor+1];
//        int[] contadorDeMoeda = new int[valor+1];
//        
//        System.out.printf("Fazendo troco para %d, requer:\n\r ", valor);
//        System.out.println(calcularTrocoMoedas(listaDeMoedasDisponiveis, valor, contadorDeMoeda, moedasUsadas )+ " moedas");
//        System.out.println("Elas são: ");
//        imprimirMoedas(moedasUsadas, valor);        
//    }
}
