package br.edu.ufabc.balancadeimpedancia.modelo;

import java.io.Serializable;

/**
 * Created by newtonangelini on 27/11/17.
 */

public class Medicao implements Serializable {

    private Pessoa pessoa;

    private Double resistencia;

    private Double reatancia;

    public Medicao(Pessoa pessoa, Double resistencia, Double reatancia) {
        this.pessoa = pessoa;
        this.resistencia = resistencia;
        this.reatancia = reatancia;
    }

    public Double getQuantidadeDeMassaMagra() {
        int sexo = 1;
        if (pessoa.getSexo() == Pessoa.Sexo.FEMININO) {
            sexo = 0;
        }
        return -4.104 + 0.508 * (Math.pow(pessoa.getAltura(), 2) / resistencia) + 0.231 * pessoa.getPeso() + 0.130 * reatancia + 4.229 * sexo;
    }

    public Double getPorcentagemDeMassaMagra() {
        return getQuantidadeDeMassaMagra() / pessoa.getPeso() * 100;
    }

    public Double getQuantidadeDeGordura() {
        return pessoa.getPeso() - getQuantidadeDeMassaMagra();
    }

    public Double getPorcentagemDeGordura() {
        return getQuantidadeDeGordura() / pessoa.getPeso() * 100;
    }

    public Double getQuantidadeDeAgua() {
        return 0.73 * getQuantidadeDeMassaMagra();
    }

    public Double getPorcentagemDeAgua() {
        return getQuantidadeDeAgua() / pessoa.getPeso() * 100;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
