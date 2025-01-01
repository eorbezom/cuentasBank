package com.pe.certus.service;

import javax.ws.rs.core.Response;

import com.pe.certus.dao.CuentaDao;
import com.pe.certus.model.ApiResponse;
import com.pe.certus.model.CuentaRequest;
import com.pe.certus.util.ResponseUtil;

public class CuentaServiceImpl implements CuentaService {

	private CuentaDao cuentaDao = new CuentaDao();
	
	@Override
	public Response listarCuentas() {
		return ResponseUtil.responseApiCuentas("0", "Consulta exitosa", cuentaDao.listarCuentas());
	}

	@Override
	public Response crearCuenta(CuentaRequest cuentaRequest) {
		ApiResponse response = cuentaDao.insertarCuenta(cuentaRequest);
		return ResponseUtil.responseApiCuentas(response.getCodigo(), response.getMensaje(), null);
	}

}
