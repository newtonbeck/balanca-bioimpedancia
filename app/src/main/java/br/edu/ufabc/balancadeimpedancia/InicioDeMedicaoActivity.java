package br.edu.ufabc.balancadeimpedancia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.edu.ufabc.balancadeimpedancia.modelo.Medicao;
import br.edu.ufabc.balancadeimpedancia.modelo.Pessoa;

public class InicioDeMedicaoActivity extends AppCompatActivity {

    private EditText resistencia;

    private EditText reatancia;

    private Button calcular;

    private Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_de_medicao);

        resistencia = (EditText) findViewById(R.id.resistencia);
        reatancia = (EditText) findViewById(R.id.reatancia);
        calcular = (Button) findViewById(R.id.calcular);

        pessoa = (Pessoa) getIntent().getSerializableExtra("pessoa");

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double resistencia = Double.valueOf(InicioDeMedicaoActivity.this.resistencia.getText().toString());
                Double reatancia = Double.valueOf(InicioDeMedicaoActivity.this.reatancia.getText().toString());
                Medicao medicao = new Medicao(pessoa, resistencia, reatancia);

                Intent irParaResultados = new Intent(InicioDeMedicaoActivity.this, ResultadoActivity.class);
                irParaResultados.putExtra("medicao", medicao);
                startActivity(irParaResultados);
            }
        });
    }
}
