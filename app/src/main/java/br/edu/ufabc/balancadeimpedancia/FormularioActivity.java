package br.edu.ufabc.balancadeimpedancia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import br.edu.ufabc.balancadeimpedancia.modelo.Pessoa;

public class FormularioActivity extends AppCompatActivity {

    private EditText nome;

    private Spinner sexo;

    private EditText peso;

    private EditText altura;

    private EditText idade;

    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        nome = (EditText) findViewById(R.id.nome);
        sexo = (Spinner) findViewById(R.id.sexo);
        peso = (EditText) findViewById(R.id.peso);
        altura = (EditText) findViewById(R.id.altura);
        idade = (EditText) findViewById(R.id.idade);
        enviar = (Button) findViewById(R.id.enviar);

        SpinnerAdapter adapter = ArrayAdapter.createFromResource(this, R.array.sexo, android.R.layout.simple_spinner_dropdown_item);
        sexo.setAdapter(adapter);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = FormularioActivity.this.nome.getText().toString();
                Pessoa.Sexo sexo = Pessoa.Sexo.valueOf(FormularioActivity.this.sexo.getSelectedItem().toString());
                Double peso = Double.valueOf(FormularioActivity.this.peso.getText().toString());
                Double altura = Double.valueOf(FormularioActivity.this.altura.getText().toString());
                Integer idade = Integer.valueOf(FormularioActivity.this.idade.getText().toString());

                Pessoa pessoa = new Pessoa(nome, sexo, idade, peso, altura);
                Intent irParaInicioDaMedicao = new Intent(FormularioActivity.this, InicioDeMedicaoActivity.class);
                irParaInicioDaMedicao.putExtra("pessoa", pessoa);
                startActivity(irParaInicioDaMedicao);
            }
        });
    }
}
