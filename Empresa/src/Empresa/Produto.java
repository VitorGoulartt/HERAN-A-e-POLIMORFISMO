package Empresa;

import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    private String nome;
    private String marca;
    private int codigo;
    private double preço;
    private int quantidade;

    public Produto(String nome, String marca, int codigo, double preço, int quantidade){

        this.nome = nome;
        this.marca = marca;
        this.codigo = codigo;
        this.preço = preço;
        this.quantidade = quantidade;

    }

    public String getnome(){
        return nome;

    }
    public void setnome(String nome){
        this.nome = nome;

    }
    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }
    public int getcodigo(){
        return codigo;
    }
    public void setcodigo(int codigo){
        this.codigo = codigo;
    }
    public double getpreço(){
        return preço;
    }
    public void setpreço(double preço){
        this.preço = preço;

    }
    public int getquantidade(){
        return quantidade;
    }
    public void setquantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void alterarquantidade(int alterar){
        System.out.println("Oque desejar fazer? ");
        System.out.println("1. Adicionar");
        System.out.println("2. Remover ");
        alterar = sc.nextInt();
        switch(alterar){
            
            case 1:

            System.out.println("Qual valor deseja");
            alterar = sc2.nextInt();

            if( alterar != 0 || alterar > 0){
             this.quantidade += alterar ;
             System.out.println(this.quantidade);

            } else {

            System.err.println("Incorreta16");

             }
             break;

            case 2:
             System.out.println("Qual valor deseja");
             alterar = sc2.nextInt();
            
            if(alterar <= this.quantidade && alterar != 0){
                
             this.quantidade -= alterar;
             System.out.println(this.quantidade);

            } else {

            System.err.println("Incorreta16");

             }
             break;

        }
        


        


       
       


    }
    public void Informacoes(){

        System.out.println("Nome: " + this.nome );
        System.out.println("marca: " + this.marca);
        System.out.println("codigo: " + this.codigo );
        System.out.println("Preço: R$" + this.preço);
        System.out.println("Quantidade: " + this.quantidade);
        
        
    }




}
