package br.edu.ufabc.balancadeimpedancia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InicioDeMedicaoActivity extends AppCompatActivity {

    private EditText resistencia;

    private EditText reatancia;

    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_de_medicao);

        resistencia = (EditText) findViewById(R.id.resistencia);
        reatancia = (EditText) findViewById(R.id.reatancia);
        calcular = (Button) findViewById(R.id.calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaResultados = new Intent(InicioDeMedicaoActivity.this, ResultadoActivity.class);
                startActivity(irParaResultados);
            }
        });
    }
}
