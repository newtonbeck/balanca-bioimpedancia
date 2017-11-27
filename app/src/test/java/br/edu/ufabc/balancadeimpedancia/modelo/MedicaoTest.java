package br.edu.ufabc.balancadeimpedancia.modelo;

import org.junit.Assert;
import org.junit.Test;

public class MedicaoTest {

    @Test
    public void deveCalcularMedicoesCorretamente() {
        Pessoa pessoa = new Pessoa("Mariana Campos", Pessoa.Sexo.FEMININO, 25, 60.0, 1.6);
        Medicao medicao = new Medicao(pessoa, 500.0, 212.21);

        Assert.assertEquals(37.35, medicao.getQuantidadeDeMassaMagra(), 0.1);
        Assert.assertEquals(62.25, medicao.getPorcentagemDeMassaMagra(), 0.1);
        Assert.assertEquals(27.26, medicao.getQuantidadeDeAgua(), 0.1);
        Assert.assertEquals(45.43, medicao.getPorcentagemDeAgua(), 0.1);
        Assert.assertEquals(22.65, medicao.getQuantidadeDeGordura(), 0.1);
        Assert.assertEquals(37.75, medicao.getPorcentagemDeGordura(), 0.1);
    }

}
