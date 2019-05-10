package br.com.fiap.nac03;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class CarrosEconomicosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economicos);

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

    public void FragmentCarroEconomicos1(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerEconomicos, new CarrosEconomicosFragment1())
                .addToBackStack(null)
                .commit();
    }

    public void FragmentCarroEconomicos2(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerEconomicos, new CarrosEconomicosFragment2())
                .addToBackStack(null)
                .commit();
    }

    public void FragmentCarroEconomicos3(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerEconomicos, new CarrosEconomicosFragment3())
                .addToBackStack(null)
                .commit();
    }
}
