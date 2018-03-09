package com.cursoandroid.kaique.app_consume.assyntasks;

import android.os.AsyncTask;
import android.util.Log;

import com.cursoandroid.kaique.app_consume.model.Categoria;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kaique on 09/03/18.
 */

public class CategoriaAsynTask extends AsyncTask<Void, Void, List<Categoria>> {


    @Override
    protected List<Categoria> doInBackground(Void... voids) {

        List<Categoria> categorias = new ArrayList<>();

        try {

            final String url = "https://kr-app-estabelecimento.herokuapp.com/categorias";
            RestTemplate restTemplate = new RestTemplate();

            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            Categoria[] response = restTemplate.getForObject(url, Categoria[].class);

            categorias.addAll(Arrays.asList(response));

        } catch (Exception e) {
            Log.e("Erro", e.getMessage(), e);
        }

        return categorias;
    }
}
