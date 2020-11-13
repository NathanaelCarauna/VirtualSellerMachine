/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import classes.Produto;

/**
 *
 * @author Nathanael
 */
public class BuscaBinaria {

    static Produto buscaBinaria(Produto[] L, int x) { 
        int inicio = 0; 
        int fim = L.length - 1; 

        while (inicio <= fim) { 
            int meio = inicio + (fim - inicio) / 2; 
  
            int res = x; 
            
 
            if (res == (L[meio].getCodigo())) 
                return L[meio];
            if (res > (L[meio].getCodigo())) 
                inicio = meio + 1; 
            else
                fim = meio - 1; 
        } 
  
        return null; 
    } 
  
}
