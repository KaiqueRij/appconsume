package com.cursoandroid.kaique.app_consume.facades;

import com.cursoandroid.kaique.app_consume.business.CategoriaBusiness;
import com.cursoandroid.kaique.app_consume.model.Categoria;

import java.util.List;

public class CategoriaFacade {
	
	public List<Categoria> findAll() throws Exception{
		
		List<Categoria> categorias = CategoriaBusiness.getInstance().findAll();
		return categorias;		
	}
	
	public static CategoriaFacade getInstance(){
		return new CategoriaFacade();
	}
}
