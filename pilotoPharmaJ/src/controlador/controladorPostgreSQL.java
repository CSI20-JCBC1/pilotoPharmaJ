package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.conexionPostgreSQL;
import modelo.consultasPostgre;
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
		
		System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Llamada insertAllAlumnosAsignaturas");
		consultasPostgre.insertProductos(conexionGenerada);
		
		System.out.println();
		System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Lamada selectAllProductos");
		listProductos = consultasPostgre.selectAllAlumnos(conexionGenerada);
		int i = listProductos.size();
		System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Número productos: "+i);
		System.out.println("[INFORMACIÓN-HomeController-Index] Lista productos:");
        for (dtoProducto producto: listProductos)
        	System.out.println(producto.getMd_uuid() +" "+
        			producto.getId_producto() +" "+ producto.getId_producto()+" "+producto.getCod_producto()+" "
        			+producto.getNombre_producto()+" "+
        			producto.getTipo_producto_origen()+" "+producto.getTipo_producto_clase() + producto.getDes_producto());
        
        conexionGenerada.close();
	}

}
