package com.pe.certus.dao;

import java.sql.Connection;//libreria conexion de mysql
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexionDB {
	
	private static final String usuario ="root";
	private static final String password ="orbezo";
	private static final String url="jdbc:mysql://localhost:3306/sysventa";
	private static final String driver="com.mysql.cj.jdbc.Driver";
	
	//metodo de conexion
	//cuando se utilisa el selec * fro em worbench
	public static Connection getConexion() {
		Connection cn = null;// que la variable cn inicialice con null
		try {
			Class.forName(driver).newInstance();//metodo antiguo
			cn = DriverManager.getConnection(url, usuario, password);
			
			
		} catch (Exception e) {
			e.printStackTrace();//metodo que visualice en la consola
			cn = null;
		}
		return cn;// se retorna el dato que esta en  la variable cn
	}
	
	
	
	//meto para cerrar la conexion
	public static void cerrarConexion(Connection cn) {
		try {
			cn.close();// cierra la memoria con la conexion
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	//metodo para cerrar el resultado
	//CIERRA LOS OBJETOS
	//cerrar la clase resulet que se almacena en memoria
	public static void cerrarResulset(ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	//cerrar preparStament que se almacena en memoria
	//SOLO LOS RESLTADOS QUE VIEN DE LA CONSULTA
	public static void cerrarPreparedStatement(PreparedStatement ps) {
		try {
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
