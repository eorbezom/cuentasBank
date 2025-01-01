package com.pe.certus.service;

import javax.ws.rs.core.Response;

import com.pe.certus.model.CuentaRequest;

public interface CuentaService {

	public Response listarCuentas();
	public Response crearCuenta(CuentaRequest cuentaRequest);
}
