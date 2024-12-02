package com.pe.certus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pe.certus.model.CuentaResponse;

// armando el metodo campo por campo
public class CuentaDao {
	public List<CuentaResponse> listarCuentas(){
		
		List<CuentaResponse>listaCuenta = new ArrayList<CuentaResponse>(); //LO LLAMAMOS EN LA LINEA 41
		try {
			String sql="select c.chr_cuencodigo,m.vch_monedescripcion,concat(s.vch_sucunombre,\"-\",s.vch_sucuciudad)as sucursal,"
					+ "e.vch_emplnombre,cl.vch_clienombre,c.dec_cuensaldo,c.dtt_cuenfechacreacion,t.vch_tipodescripcion,c.vch_cuenestado "
					+ "from cuenta c "
					+ "inner join moneda m on c.chr_monecodigo = m.chr_monecodigo "
					+ "inner join sucursal s on c.chr_sucucodigo = s.chr_sucucodigo "
					+ "inner join empleado e on c.chr_emplcreacuenta= e.chr_emplcodigo "
					+ "inner join  cliente cl on c.chr_cliecodigo= cl.chr_cliecodigo "
					+ "inner join tipomovimiento t on  c.int_cuencontmov= t.chr_tipocodigo;";
			Connection cn =ConexionDB.getConexion();
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {//AQUI SE RESCATA LO QUE VIENE DE RESULSET
				CuentaResponse cuenta = new CuentaResponse();
				cuenta.setCodigoCuenta(rs.getString("chr_cuencodigo"));
				cuenta.setMoneda(rs.getString("vch_monedescripcion"));
				cuenta.setSucursal(rs.getString("sucursal"));
				cuenta.setEmpleado(rs.getString("vch_emplnombre"));
				cuenta.setCliente(rs.getString("vch_clienombre"));
				cuenta.setSaldo(rs.getDouble("dec_cuensaldo"));
				cuenta.setFecha(rs.getString("dtt_cuenfechacreacion"));
				cuenta.setTipoMovimientos(rs.getString("vch_tipodescripcion"));
				cuenta.setEstado(rs.getString("vch_cuenestado"));
				
				listaCuenta.add(cuenta); //cada vez que recorre y obtine datos y agrega al variable cuenta
				//luego retorna al la listacuenta
				
			}
			 
			// se cierra la conexxion
			ConexionDB.cerrarConexion(cn);
			ConexionDB.cerrarPreparedStatement(ps);
			ConexionDB.cerrarResulset(rs);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaCuenta;//UNA VEZ QUE AGREGA TODO EL OBJETO DEVULEVE 
	}

}
