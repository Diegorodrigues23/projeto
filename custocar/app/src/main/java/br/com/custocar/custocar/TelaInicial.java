package br.com.custocar.custocar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;


public class TelaInicial extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_inicial);

        Handler handler = new Handler();
        handler.postDelayed(this,3000);

    }
    public void run(){
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }


}