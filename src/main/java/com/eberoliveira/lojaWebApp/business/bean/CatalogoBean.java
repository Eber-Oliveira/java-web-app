package com.eberoliveira.lojaWebApp.business.bean;

import java.util.ArrayList;
import java.util.List;

public class CatalogoBean {
	private List<RoupaBean> roupas;
	
	public CatalogoBean() {
		roupas = new ArrayList<>();
		
		roupas.add(novaRoupa("Agasalho Infantil", "Roupas Infantis", 199.99f));
		roupas.add(novaRoupa("Agasalho Feminino", "Roupas Femininas", 299.99f));
		roupas.add(novaRoupa("Boot Preto", "Sapatos Femininos", 499f));
		roupas.add(novaRoupa("Calça Feminina", "Roupas Femininas", 129.99f));
		roupas.add(novaRoupa("Camisa Floral", "Roupas Masculinas", 49.9f));
		roupas.add(novaRoupa("Camisa Manga Comprida", "Roupas Masculinas", 55f));
		roupas.add(novaRoupa("Camiseta Preta", "Roupas Masculinas", 50f));
		roupas.add(novaRoupa("Camisa Varias Cores", "Roupas Masculinas", 99.9f));
		roupas.add(novaRoupa("Camisa Vermelha", "Roupas Masculinas", 70f));
		roupas.add(novaRoupa("Camiseta Feminina", "Roupas Femininas", 69f));
		roupas.add(novaRoupa("Conjunto Feminino", "Roupas Femininas", 88.99f));
		roupas.add(novaRoupa("Cinto Marron", "         Cintos Masculinos", 299.99f));
		roupas.add(novaRoupa("Kit Terno e Revólver", "Roupas Masculinas", 4599.89f));
		roupas.add(novaRoupa("Sapato Marron", "Sapatos Masculinos", 329.99f));
		roupas.add(novaRoupa("Sapato Preto", "Sapatos Masculinos", 299.99f));
		roupas.add(novaRoupa("Tênis Preto", "Sapatos Masculinos", 299.99f));
		roupas.add(novaRoupa("Terno Cinza", "Roupas Masculinas", 580f));
		roupas.add(novaRoupa("Terno Preto", "Roupas Masculinas", 590f));
		roupas.add(novaRoupa("Terno Vermelho", "Roupas Masculinas", 790f));
		roupas.add(novaRoupa("Vestido Preto", "Roupas Femininas", 189.99f));
		

	}
	
	private RoupaBean novaRoupa(String nome, String categoria, Float preco) {
		
		Integer codigo = roupas.size();
		
		RoupaBean roupaBean = new RoupaBean();
		roupaBean.setCodigo(codigo);
		roupaBean.setNome(nome);
		roupaBean.setCategoria(categoria);
		roupaBean.setPreco(preco);
		
		return roupaBean;
		
	}

	public List<RoupaBean> getRoupas() {
		return roupas;
	}

	public void setRoupas(List<RoupaBean> roupas) {
		this.roupas = roupas;
	}
	

}
