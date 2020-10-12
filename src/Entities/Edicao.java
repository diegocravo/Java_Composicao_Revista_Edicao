package Entities;

import java.time.LocalDate;
import java.util.Date;

public class Edicao {

    private int num;
    private LocalDate data;
    private int tiragem;
    private int vendidas;
    private boolean reciclagemAtualizada = false;
    private int revistasRecicladas = 0;

    public int qtdeRecicladas(){
        this.reciclagemAtualizada = true;
        this.revistasRecicladas = tiragem - vendidas;
        return revistasRecicladas;
    }

    public Edicao(int num, int tiragem, int vendidas){
        this.num = num;
        this.data = LocalDate.now();
        this.tiragem = tiragem;
        this.vendidas = vendidas;
    }

    public int getNum() {
        return num;
    }

    public boolean isReciclagemAtualizada() {
        return reciclagemAtualizada;
    }

    @Override
    public String toString() {
        return  "Número Edição: "
                + num
                + ", Data: "
                + data
                + ", Tiragem: "
                + tiragem
                + ", Vendidas"
                + vendidas
                + ", Reciclagem Atualizada: "
                + reciclagemAtualizada
                + ", Quantidade reciclada: "
                + revistasRecicladas;
    }
}
