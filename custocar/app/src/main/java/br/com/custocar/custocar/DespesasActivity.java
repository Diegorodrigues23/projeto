package br.com.custocar.custocar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DespesasActivity extends AppCompatActivity {
    private Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despesas);
        Button btnCombustivel = (Button) findViewById(R.id.button_combustivel);
        Button bntRevisao =(Button) findViewById(R.id.button_revisao);


        btnCombustivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //utilizamos o intent para navegar até a outra tela
                Intent intent = new Intent(c, CombustivelActivity.class);
                startActivity(intent);
            }
        });

        bntRevisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(c, RevisaoActivity.class);
                startActivity(intent);
            }
        });
    }
}
