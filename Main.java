package main;

import produto.Produto;

public class Main {
    public static void main(String[] args) {

        Produto obj = new Produto(10,200,200);
        System.out.println("Código: " + obj.getCodigo() +
                "\nNota: " + obj.getNota());
    }
}
