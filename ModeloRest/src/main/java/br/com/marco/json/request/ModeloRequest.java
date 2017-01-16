package br.com.marco.json.request;

import java.io.Serializable;

public class ModeloRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String zipCode;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String codigoPedido) {
		this.zipCode = codigoPedido;
	}
	
}
