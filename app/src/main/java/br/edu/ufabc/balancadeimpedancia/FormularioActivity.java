package br.edu.ufabc.balancadeimpedancia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormularioActivity extends AppCompatActivity {

    private EditText nome;

    private EditText sexo;

    private EditText peso;

    private EditText altura;

    private EditText idade;

    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        nome = (EditText) findViewById(R.id.nome);
        sexo = (EditText) findViewById(R.id.sexo);
        peso = (EditText) findViewById(R.id.peso);
        altura = (EditText) findViewById(R.id.altura);
        idade = (EditText) findViewById(R.id.idade);
        enviar = (Button) findViewById(R.id.enviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaInicioDaMedicao = new Intent(FormularioActivity.this, InicioDeMedicaoActivity.class);
                startActivity(irParaInicioDaMedicao);
            }
        });
    }
}
