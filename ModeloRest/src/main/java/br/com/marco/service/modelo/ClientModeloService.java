package br.com.marco.service.modelo;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import br.com.marco.json.request.ModeloRequest;
import br.com.modelo.json.response.ModeloResponse;

@Service
public class ClientModeloService extends WebServiceGatewaySupport{
	
	public Object getCidadePorCep(String cep) {

		ModeloRequest request = new ModeloRequest();
		request.setZipCode("94304");

		Object response = (ModeloResponse) getWebServiceTemplate().marshalSendAndReceive(
				"http://wsf.cdyne.com/WeatherWS/Weather.asmx",		
				request,
				new SoapActionCallback("http://argentumws.caelum.com.br/negociacoes"));

		return response;
}

}
