package br.com.custocar.custocar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastroActivity extends AppCompatActivity {
    private Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Button btnRelatorio = (Button) findViewById(R.id.button_relatorio);
        Button btnCadastrar = (Button) findViewById(R.id.button_cadastrar);

        btnRelatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //utilizamos o intent para navegar até a outra tela
                Intent intent = new Intent(c, RelatorioActivity.class);
                startActivity(intent);

            }
        });
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(c, DespesasActivity.class);
                startActivity(intent);
            }
        });


    }
}

