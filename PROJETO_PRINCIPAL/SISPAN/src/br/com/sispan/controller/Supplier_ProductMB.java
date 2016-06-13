package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Supplier_Product;

@ViewScoped
@ManagedBean
public class Supplier_ProductMB extends GenericMB {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5614961461170613159L;
	private Supplier_Product sup_pro = new Supplier_Product();
	private List<Supplier_Product> listaSupplier_Products = new ArrayList();
		
	public Supplier_Product getSupplier_Product() {
		return sup_pro;
	}

	public void setSupplier_Product(Supplier_Product sup_pro) {
		this.sup_pro = sup_pro;
	}

	@Override
	protected Bean getBean() {	 
		return getSupplier_Product();
	}

	@Override
	protected void setBean(Bean b) {
		setSupplier_Product((Supplier_Product) b);
	}
	
	@Override
	public void setLista(List lista) {
		System.out.println("setando lista: ");
		this.listaSupplier_Products = new ArrayList<Supplier_Product>(lista);
	}
	
		
	public List<Supplier_Product> getListaSupplier_Products() {
		return listaSupplier_Products;
	}

	public void setListaSupplier_Products(List<Supplier_Product> listaSupplier_Products) {
		this.listaSupplier_Products = listaSupplier_Products;
	}

}
