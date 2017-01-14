package br.com.marco.json.request;

import java.io.Serializable;

public class ModeloRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String codigoPedido;

	public String getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	
}
