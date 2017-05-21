package br.com.custocar.custocar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {
    private Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setContentView(R.layout.activity_login);
        Button bntAcessar = (Button) findViewById(R.id.button_acessar);
        Button bntCadastro = (Button) findViewById(R.id.button_cadastro);

        bntAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(c, CadastroActivity.class);
                startActivity(intent);
            }
        });

        bntCadastro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(c, UsuarioActivity.class );
                startActivity(intent);

            }
        });
    }
}
