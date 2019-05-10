package br.com.fiap.nac03;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class CarrosPotentesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potentes);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Carros potentes");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, MainActivity.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }

    public void FragmentCarro1(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new CarrosPotentesFragment1())
                .addToBackStack(null)
                .commit();
    }

    public void FragmentCarro2(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new CarrosPotentesFragment2())
                .addToBackStack(null)
                .commit();
    }

    public void FragmentCarro3(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new CarrosPotentesFragment3())
                .addToBackStack(null)
                .commit();
    }
}
