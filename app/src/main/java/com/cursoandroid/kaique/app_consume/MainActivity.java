package com.cursoandroid.kaique.app_consume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.cursoandroid.kaique.app_consume.facades.CategoriaFacade;
import com.cursoandroid.kaique.app_consume.model.Categoria;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            List<Categoria> categorias = CategoriaFacade.getInstance().findAll();

            Log.i("MainActivity", categorias.toString());

        } catch (Exception e){
            Log.i("Error", e.getMessage());
        }
    }
}
