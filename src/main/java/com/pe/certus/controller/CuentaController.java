package com.pe.certus.controller;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.pe.certus.service.CuentaService;
import com.pe.certus.service.CuentaServiceImp;

@Path("v1/cuenta") //RUTA BASE
public class CuentaController {


	//INTANCIAS
	private CuentaService cuentaService = new CuentaServiceImp();
	
	//SE GENERA EL METODO	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)//comes es para la peticion 
	@Produces(MediaType.APPLICATION_JSON)//FORMATO QUE VA CONTEPLAR EL API
	public Response getAllCuenta(){// me devolver respons responde con los estados en un nivel de api
		cuentaService.listarCuentas();//para que responda el cuerpo 
		return Response.ok(cuentaService.listarCuentas()).build();
	}
	

}
