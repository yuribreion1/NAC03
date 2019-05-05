package br.com.fiap.nac03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirCarrosPotentes(View view) {
        Intent it = new Intent(this, CarrosPotentesActivity.class);
        startActivity(it);
    }

    public void abrirCarrosEconomicos(View view) {
    }

    public void abrirCarrosBaratos(View view) {
    }

    public void abrirCarrosConceito(View view) {
    }
}
