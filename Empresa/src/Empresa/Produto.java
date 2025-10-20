package Empresa;

import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
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
        return nome;
    }
    public void setmarca(String nome){
        this.nome = nome;
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
            if( alterar != 0 || alterar > 0){
             alterar += this.quantidade;
             System.out.println("deu certo");

            } else {

            System.err.println("Incorreta16");

             }

            case 2:
            if(alterar <= this.quantidade && alterar != 0){
             alterar -= this.quantidade;
             System.out.println("deu certo");

            } else {

            System.err.println("Incorreta16");

             }

        }


        


        sc.close();
       


    }
    




}
