package aulas.exercicios.oo.construtores;

import java.awt.*;

public class Carro {
    private int quantidade;
    private String marca;
    private String modelo;
    private String variante;
    private Integer ano;

    //Construtor implícito em caso de não haver nenhum outro construtor -> public Carro(){}

    //Construtor com parametros, sem o construtor padrão, torna obrigatória a instancia passando os argumentos

    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public String getVariante() {
        return variante;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public Integer getAno(){
        return ano;
    }
}
