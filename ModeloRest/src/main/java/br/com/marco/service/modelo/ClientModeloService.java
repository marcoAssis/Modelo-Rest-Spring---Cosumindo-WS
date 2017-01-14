package br.com.marco.service.modelo;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import br.com.marco.json.request.ModeloRequest;
import br.com.modelo.json.response.ModeloResponse;

@Service
public class ClientModeloService extends WebServiceGatewaySupport{
	
	public ModeloResponse getCidadePorCep(String cep) {

		ModeloRequest request = new ModeloRequest();
		request.setCodigoPedido(cep);

		ModeloResponse response = (ModeloResponse) getWebServiceTemplate().marshalSendAndReceive(
				"http://www.byjg.com.br/site/webservice.php/ws/cep",		
				request,
				new SoapActionCallback("http://www.byjg.com.br/site/webservice.php/ws/cep?wsdl"));

		return response;
}

}
