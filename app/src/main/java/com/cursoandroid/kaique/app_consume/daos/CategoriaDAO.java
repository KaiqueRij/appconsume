package com.cursoandroid.kaique.app_consume.daos;

import com.cursoandroid.kaique.app_consume.assyntasks.CategoriaAsynTask;
import com.cursoandroid.kaique.app_consume.model.Categoria;

import java.util.List;


public class CategoriaDAO {
	
	public List<Categoria> findAll() throws Exception{
		
		List<Categoria> categorias = null;
		
		categorias = new CategoriaAsynTask().execute().get();
		
		return categorias;		
	}
	
	public static CategoriaDAO getInstance(){
		return new CategoriaDAO();
	}
}
