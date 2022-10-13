package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class dtoADTO {
public static ArrayList<dtoProducto> resultsetAdtoProducto(ResultSet resultadoConsulta){
		
		System.out.println("[INFORMACIÓN-resultsetAdtoAlumno-resultsetAdtoAlumno] Entrando en resultsetAdtoProducto");
		ArrayList<dtoProducto> listAlumnos = new ArrayList<>();
		
		//Leemos el resultado de la consulta hasta que no queden filas
		try {
			while ( resultadoConsulta.next() ) {	
				listAlumnos.add(new dtoProducto(resultadoConsulta.getString("md_uuid"),
						resultadoConsulta.getInt("id_producto"),
						resultadoConsulta.getString("cod_producto"),
						resultadoConsulta.getString("nombre_producto"),
						resultadoConsulta.getString("tipo_producto_origen"),
						resultadoConsulta.getString("tipo_producto_clase"),
						resultadoConsulta.getString("des_producto"))
						);
			}
			
			int i = listAlumnos.size();
			System.out.println("[INFORMACIÓN-resultsetAdtoPrducto-resultsetAdtoPrducto] Número Prductos: "+i);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listAlumnos;
		
	}
}
