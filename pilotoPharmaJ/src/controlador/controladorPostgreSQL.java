package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.conexionPostgreSQL;
import modelo.dtoProducto;
import util.variablesConexionPostgreSQL;

public class controladorPostgreSQL {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//CONSTANTES
		final String HOST = variablesConexionPostgreSQL.getHost();
		final String PORT = variablesConexionPostgreSQL.getPort();
		final String DB = variablesConexionPostgreSQL.getDb();
		final String USER = variablesConexionPostgreSQL.getUser();
		final String PASS = variablesConexionPostgreSQL.getPass();
		ArrayList<dtoProducto> listProductos = new ArrayList<>();
		

		
		/*Se crea una instancia de la clase en la que estamos para poder generar la conexión a PostgreSQL
		*utilizando el método generaConexion
		*/
		System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Lamada generaConexion");
		conexionPostgreSQL conexionPostgresql = new conexionPostgreSQL();
		Connection conexionGenerada = conexionPostgresql.generaConexion(HOST,PORT,DB,USER,PASS);
	}

}
