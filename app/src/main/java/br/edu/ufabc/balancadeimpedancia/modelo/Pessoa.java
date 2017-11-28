package br.edu.ufabc.balancadeimpedancia.modelo;

import java.io.Serializable;

/**
 * Created by newtonangelini on 27/11/17.
 */

public class Pessoa implements Serializable {

    public enum Sexo {
        MASCULINO, FEMININO;
    }

    private String nome;

    private Sexo sexo;

    private Integer idade;

    private Double peso;

    private Double altura;

    public Pessoa(String nome, Sexo sexo, Integer idade, Double peso, Double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }
}
