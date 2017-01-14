package br.com.marco.controller.modelo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import br.com.marco.service.modelo.ModeloService;
import br.com.modelo.json.response.ModeloResponse;

@RestController
public class ModeloController {
	
	@Autowired
	private ModeloService modeloService;

//	@Autowired
//	public ModeloController(ModeloService consumidorService) {
//		super();
//		this.modeloService = consumidorService;
//	}
	

	@RequestMapping(value="/modelo", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	private ModeloResponse retorno() {
		return modeloService.retornaModeloEntity();
	}
	
	
	
}
