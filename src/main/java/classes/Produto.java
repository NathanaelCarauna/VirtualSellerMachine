/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Nathanael
 */
public class Produto{
  private String nome;
  private double preço;
  private int codigo;
  private String descrição;

  public Produto(String nome, double preço, int codigo, String descrição){
    this.nome = nome;
    this.preço = preço;
    this.codigo = codigo;
    this.descrição = descrição;
  }

  public String getNome(){
    return this.nome;
  } 

  public double getPreço(){
    return this.preço;
  } 

  public int getCodigo(){
    return this.codigo;
  } 

  public String getDescrição(){
    return this.descrição;
  } 

  
}
