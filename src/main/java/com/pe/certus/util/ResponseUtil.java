package com.pe.certus.util;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.pe.certus.model.ApiResponse;
import com.pe.certus.model.CuentaResponse;

public class ResponseUtil {

	public static Response responseApiCuentas(String codigo, String mensaje, List<CuentaResponse> data) {
		ApiResponse response = new ApiResponse(codigo, mensaje, data);
		if(data != null) {
			return Response.status(Status.OK).entity(response).build();
		}else{
			return Response.status(Status.CREATED).entity(response).build();
		}
	}
}
