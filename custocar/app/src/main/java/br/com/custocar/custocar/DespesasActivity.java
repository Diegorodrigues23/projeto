package br.com.custocar.custocar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class DespesasActivity extends AppCompatActivity {
    private Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despesas);
        Toolbar myToolbar= (Toolbar) findViewById(R.id.toolbar);

        Button btnCombustivel = (Button) findViewById(R.id.button_combustivel);
        Button bntRevisao =(Button) findViewById(R.id.button_revisao);
        Button bntImprevisto = (Button) findViewById(R.id.button_imprevistos);


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

        bntImprevisto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //utilizamos o intent para navegar até a outra tela
                Intent intent = new Intent(c, ImprevistosActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        tb.inflateMenu(R.menu.menu);
        tb.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return onOptionsItemSelected(item);
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if (item.getItemId() == R.id.idgasolina){
            Intent intent = new Intent(c, CombustivelActivity.class);
            startActivity(intent);
            return true;

        }else {
            return super.onOptionsItemSelected(item);
        }


    }




}
