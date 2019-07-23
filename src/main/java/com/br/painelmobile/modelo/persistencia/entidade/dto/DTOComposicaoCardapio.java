package com.br.painelmobile.modelo.persistencia.entidade.dto;

import java.io.Serializable;
import java.util.List;

import com.br.painelmobile.modelo.persistencia.entidade.mapeadas.Cardapio;

public class DTOComposicaoCardapio implements Serializable {

	private static final long serialVersionUID = -8863989366948427335L;

	private String opcao;
	private String itens;
		
	
	public DTOComposicaoCardapio() {
		
	}


	public String getOpcao() {
		return opcao;
	}


	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}


	public String getItens() {
		return itens;
	}


	public void setItens(String itens) {
		this.itens = itens;
	}	
 
		
	

}
