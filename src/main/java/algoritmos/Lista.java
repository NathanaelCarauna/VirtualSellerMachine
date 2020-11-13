/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import static algoritmos.BuscaBinaria.buscaBinaria;
import classes.Produto;

/**
 *
 * @author Nathanael
 */
public class Lista {

    private Produto[] elementos;
    private int tamanho;
    private int capacidade;

    public Lista(int capacidade) {
        this.elementos = new Produto[capacidade];
        this.tamanho = 0;
    }

    public boolean adicionar(Produto elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Produto[] elementosNovos = new Produto[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remover(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public Produto busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].getNome().equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public Produto pegar(String produto) {
        return buscaBinaria(elementos, busca(produto));
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void limpar() {
        this.elementos = new Produto[capacidade];
        this.tamanho = 0;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
