package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.dtoProducto;

public class consultasPostgre {
	
	public static ArrayList<dtoProducto> selectAllAlumnos(Connection conexionGenerada) {

		System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllProductos] Entra en selectAllProductos");
		Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ArrayList<dtoProducto> listProductos = new ArrayList<>();

		try {

			// Se abre una declaración
			declaracionSQL = conexionGenerada.createStatement();
			// Se define la consulta de la declaración y se ejecuta
			resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"dlk_operacional_productos\".\"opr_cat_productos\"");

			// Llamada a la conversión a dtoAlumno
			listProductos = dtoADTO.resultsetAdtoProducto(resultadoConsulta);
			int i = listProductos.size();
			System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllProductos] Número productos: " + i);

			System.out.println(
					"[INFORMACIÓN-consultasPostgreSQL-selectAllProductos] Cierre conexión, declaración y resultado");
			resultadoConsulta.close();
			declaracionSQL.close();
			

		} catch (SQLException e) {

			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
			return listProductos;

		}
		return listProductos;
	}

	public static void insertProductos(Connection conexionGenerada) {

		System.out.println("[INFORMACIÓN-consultasPostgreSQL-insertAlumnos] Entra en insertAlumnosAsignaturas");
		Statement declaracionSQL = null;
		

		try {

			// Se abre una declaración
			declaracionSQL = conexionGenerada.createStatement();
			// Se define la consulta de la declaración y se ejecuta
			declaracionSQL.executeQuery("INSERT INTO \"dlk_operacional_productos\".\"opr_cat_productos\" ( md_uuid, cod_producto, nombre_producto, tipo_producto_origen, tipo_producto_clase, des_producto) VALUES ('adf131029022fch12345', 'hig_p_gelf_f', 'Gel de aceite de fresa, Farlane.', 'Propio', 'Higiene', 'Gel de aceite de fresa producido por marca propia Farlane.')");
			

			System.out.println("[INFORMACIÓN-consultasPostgreSQL-insertAlumnos] Cierre conexión, declaración y resultado");
			declaracionSQL.close();
			

		} catch (SQLException e) {

			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
			

		}
		
	}
}
