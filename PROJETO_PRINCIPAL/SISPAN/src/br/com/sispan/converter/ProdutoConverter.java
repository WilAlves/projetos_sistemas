package br.com.sispan.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.sispan.dao.GenericDAO;
import br.com.sispan.model.Produto;

@FacesConverter(value = "produtoConverter")
public class ProdutoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if (arg2.isEmpty() || arg2 == null) {
			return null;
		}
		List lista = new GenericDAO( ).listar("FROM Produto where descricao='" + arg2 + "'");
		return lista.size() > 0 ? lista.get(0) : null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		Produto produto = (Produto) arg2;
		return String.valueOf(produto.getId());
	}

}
