package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.SelectEvent;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.PlanoFidelidade;
import br.com.sispan.model.Produto;
import br.com.sispan.model.Promocao;


@ViewScoped
@ManagedBean
public class PromocaoMB extends GenericMB {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7098925733370087276L;
	
	private Promocao promocao = new Promocao();
	private List<Promocao>listaPromocoes = new ArrayList<Promocao>();
	private PlanoFidelidade plano = new PlanoFidelidade();
	private Produto produto = new Produto();
	
	public Promocao getPromocao() {
		return promocao;
	}

	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}

	public List<Promocao> getListaPromocoes() {
		return listaPromocoes;
	}

	public void setListaPromocoes(List<Promocao> listaPromocoes) {
		this.listaPromocoes = listaPromocoes;
	}

	@Override
	protected Bean getBean() {
		return this.promocao;
	}

	@Override
	protected void setBean(Bean b) {
		this.setPromocao((Promocao) b);
	}

	@Override
	public void setLista(List  lista) {
		this.listaPromocoes = new ArrayList<Promocao>(lista);
	}
	
	
	public PlanoFidelidade getPlano() {
		return plano;
	}

	public void setPlano(PlanoFidelidade plano) {
		this.plano = plano;
	}
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void onItemSelect(SelectEvent event) {
		PlanoFidelidade p = (PlanoFidelidade) event.getObject();
		List<PlanoFidelidade> lista = promocao.getPublicoAlvo();
		if(!lista.contains(p)){
			lista.add(p);
			p.setPromocao(promocao);
		} 
	}
	public void onItemSelectProduto(SelectEvent event) {
		Produto p = (Produto) event.getObject();
		List<Produto> lista = promocao.getProdutosParticipantes();
		if(!lista.contains(p)){
			lista.add(p);
		} 
	}
	public void excluirPublico(){
		promocao.getPublicoAlvo().remove(plano);
	}
	public void excluirProduto(){
		promocao.getProdutosParticipantes().remove(produto);
	}
}