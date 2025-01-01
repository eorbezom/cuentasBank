package com.pe.certus.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pe.certus.model.CuentaRequest;
import com.pe.certus.service.CuentaService;
import com.pe.certus.service.CuentaServiceImpl;

@Path("v1/cuenta")
public class CuentaController {

	private CuentaService cuentaService = new CuentaServiceImpl();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllCuentas() {
		return cuentaService.listarCuentas();
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createCuenta(CuentaRequest request) {
		return cuentaService.crearCuenta(request);
	}
}
//   http://localhost:8086/cuentasbank/api/v1/cuenta
//   http://localhost:8086/movimientosBank/api/v1/movimientos