package com.pe.certus.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexionDB {
	
	private static final String usuario = "root";
	private static final String password = "orbezo";
	private static final String url = "jdbc:mysql://localhost:3306/eurekabank";
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	
	public static Connection getConexion() {
		Connection cn = null;
		try {
			Class.forName(driver).newInstance();
			cn = DriverManager.getConnection(url, usuario, password);
		} catch (Exception e) {
			e.printStackTrace();
			cn = null;
		}
		return cn;
	}
	
	public static void cerrarConexion(Connection cn) {
		try {
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void cerrarResultset(ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void cerrarPreparedStatement(PreparedStatement ps) {
		try {
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void cerrarCallableStatement(CallableStatement cs) {
		try {
			cs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
