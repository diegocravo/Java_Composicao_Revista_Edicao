package Entities;

import Main.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Revista {

    private int codigo;
    private String titulo;
    private int reciclagemProduzida;
    public static List<Edicao> listaEdicao = new ArrayList<Edicao>();

    public static List<Revista> listaRevistas = new ArrayList<Revista>();


    public Revista(int codigo, String titulo, int reciclagemProduzida){
        this.codigo = codigo;
        this.titulo = titulo;
        this.reciclagemProduzida = reciclagemProduzida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setReciclagemProduzida(int reciclagemProduzida) {
        this.reciclagemProduzida = reciclagemProduzida;
    }

    public static void adicionarRevistaLista(Revista revista){
        listaRevistas.add(revista);
    }

    public static void adicionarListaEdicao(Edicao edicao){
        listaEdicao.add(edicao);
    }

    public static void adicionaEdicao(){

        AdicionarEdicao.adicionarEdicao();

    }

    public static void removeEdicao(){

        RemoverEdicao.removerEdicao();

    }

    @Override
    public String toString() {
        return  "Código Revista: "
                + codigo
                + "\nTítulo: "
                + titulo
                + "\nReciclagem Produzida: "
                + reciclagemProduzida
                + "\nLista Edição: "
                + listaEdicao
                + "\n";
    }
}
