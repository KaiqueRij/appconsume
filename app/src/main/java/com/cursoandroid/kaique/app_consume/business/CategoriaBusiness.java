package com.cursoandroid.kaique.app_consume.business;

import com.cursoandroid.kaique.app_consume.daos.CategoriaDAO;
import com.cursoandroid.kaique.app_consume.model.Categoria;

import java.util.List;

public class CategoriaBusiness {
	
	public List<Categoria> findAll() throws Exception{
		
		List<Categoria> categorias = CategoriaDAO.getInstance().findAll();
		return categorias;		
	}
	
	public static CategoriaBusiness getInstance(){
		return new CategoriaBusiness();
	}
}
