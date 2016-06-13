package br.com.sispan.controller;


	import java.util.ArrayList;
	import java.util.List;
	import javax.faces.bean.ManagedBean;
	import javax.faces.bean.ViewScoped;
	import br.com.sispan.interfaces.Bean;
	import br.com.sispan.model.Ingrediente;

	@ViewScoped
	@ManagedBean
	public class IngredienteMB extends GenericMB {

		/**
		 * 
		 */
		private static final long serialVersionUID = 2194919161836237152L;
		private Ingrediente ingrediente = new Ingrediente();
		private List<Ingrediente> listaIngredientes = new ArrayList();
				
		public Ingrediente getIngrediente() {
			return ingrediente;
		}

		public void setingrediente(Ingrediente ingrediente) {
			this.ingrediente = ingrediente;
		}

		@Override
		protected Bean getBean() {	 
			return getIngrediente();
		}

		@Override
		protected void setBean(Bean b) {
			setingrediente((Ingrediente)b);
		}

		@Override
		public void setLista(List lista) {
			System.out.println("setando lista: ");
			this.listaIngredientes = new ArrayList<Ingrediente>(lista);
		}
		
			
		public List<Ingrediente> getListaIngrediente() {
			return listaIngredientes;
		}

		public void setListaIngrediente(List<Ingrediente> listaIngrediente) {
			this.listaIngredientes = listaIngrediente;
		}
	}