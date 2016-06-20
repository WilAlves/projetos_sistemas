package br.com.sispan.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.sispan.dao.GenericDAO;
import br.com.sispan.model.PlanoFidelidade;
@FacesConverter(value = "planoConverter")
public class PlanoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if (arg2.isEmpty() || arg2 == null) {
			return null;
		}
		System.out.println("Convertering: " +arg2);
		List lista = new GenericDAO( ).listar("FROM PlanoFidelidade where nome_plano='" + arg2 + "'");
		return lista.size() > 0 ? lista.get(0) : null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		System.out.println("arg: " + arg2.getClass());
		PlanoFidelidade plano = (PlanoFidelidade) arg2;
		return plano.getNomePlano();
	}
}
