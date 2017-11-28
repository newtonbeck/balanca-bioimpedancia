package br.edu.ufabc.balancadeimpedancia;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.Serializable;

import br.edu.ufabc.balancadeimpedancia.modelo.Medicao;

public class ResultadoActivity extends AppCompatActivity {

    private TextView nome;

    private TextView gordura;

    private TextView massaMagra;

    private TextView agua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        nome = (TextView) findViewById(R.id.nome);
        gordura = (TextView) findViewById(R.id.gordura);
        massaMagra = (TextView) findViewById(R.id.massaMagra);
        agua = (TextView) findViewById(R.id.agua);

        Medicao medicao = (Medicao) getIntent().getSerializableExtra("medicao");

        nome.setText(medicao.getPessoa().getNome());
        gordura.setText(String.format("%,.2f", medicao.getPorcentagemDeGordura()) + "%");
        massaMagra.setText(String.format("%,.2f", medicao.getPorcentagemDeMassaMagra()) + "%");
        agua.setText(String.format("%,.2f", medicao.getPorcentagemDeAgua()) + "%");
    }

}
