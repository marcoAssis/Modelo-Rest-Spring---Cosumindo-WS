package br.com.marco.service.modelo;

import java.util.List;

import org.apache.logging.log4j.core.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import br.com.marco.json.request.ModeloRequest;
import br.com.modelo.json.response.ModeloResponse;

@Service
public class ModeloService {
	
	@Autowired
	ClientModeloService clientModeloService;
	
	
	@Transactional(readOnly=true)
	public ModeloResponse retornaModeloEntity() {
		ModeloResponse modelo = new ModeloResponse();
		modelo.setNome("Modelo de Oliveira");
		modelo.setValor(89.90);
	
		
		clientModeloService.getCidadePorCep("82300351");
		
		
		return modelo;
	}
	
	

	
	
}
