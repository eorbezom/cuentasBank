package com.pe.certus.service;

import java.util.List;

import com.pe.certus.dao.CuentaDao;
import com.pe.certus.model.CuentaResponse;

public class CuentaServiceImp implements CuentaService {
	
	
	private CuentaDao cuentaDao =new CuentaDao();
	@Override
	public List<CuentaResponse> listarCuentas() {
		
		return cuentaDao.listarCuentas();
	}

	@Override
	public void crearCuenta() {
		
		
	}

}
