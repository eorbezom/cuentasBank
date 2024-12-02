package com.pe.certus.model;

public class CuentaResponse {
	
	private String codigoCuenta;
	private String moneda;
	private String sucursal;
	private String empleado;
	private String cliente;
	private Double saldo;
	private String fecha;
	private String tipoMovimientos;
	private String estado;
	public CuentaResponse() {
		super();
	}
	public CuentaResponse(String codigoCuenta, String moneda, String sucursal, String empleado, String cliente,
			Double saldo, String fecha, String tipoMovimientos, String estado) {
		super();
		this.codigoCuenta = codigoCuenta;
		this.moneda = moneda;
		this.sucursal = sucursal;
		this.empleado = empleado;
		this.cliente = cliente;
		this.saldo = saldo;
		this.fecha = fecha;
		this.tipoMovimientos = tipoMovimientos;
		this.estado = estado;
	}
	public String getCodigoCuenta() {
		return codigoCuenta;
	}
	public void setCodigoCuenta(String codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getEmpleado() {
		return empleado;
	}
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTipoMovimientos() {
		return tipoMovimientos;
	}
	public void setTipoMovimientos(String tipoMovimientos) {
		this.tipoMovimientos = tipoMovimientos;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "CuentaResponse [codigoCuenta=" + codigoCuenta + ", moneda=" + moneda + ", sucursal=" + sucursal
				+ ", empleado=" + empleado + ", cliente=" + cliente + ", saldo=" + saldo + ", fecha=" + fecha
				+ ", tipoMovimientos=" + tipoMovimientos + ", estado=" + estado + "]";
	}
	
	

}
