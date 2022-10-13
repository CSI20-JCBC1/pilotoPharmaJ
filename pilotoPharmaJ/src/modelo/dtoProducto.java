package modelo;

public class dtoProducto {
	
	

	//Constructor
	public dtoProducto(String md_uuid, int id_producto, String cod_producto, String nombre_producto,
			String tipo_producto_origen, String tipo_producto_clase, String des_producto) {
		this.md_uuid = md_uuid;
		this.id_producto = id_producto;
		this.cod_producto = cod_producto;
		this.nombre_producto = nombre_producto;
		this.tipo_producto_origen = tipo_producto_origen;
		this.tipo_producto_clase = tipo_producto_clase;
		this.des_producto = des_producto;
	}
	
	public String md_uuid ;
    public int id_producto ;
    public String cod_producto ;
    public String nombre_producto ;
    public String tipo_producto_origen;
    public String tipo_producto_clase ;
    public String des_producto;
    
 // Getters Setters
	public String getMd_uuid() {
		return md_uuid;
	}
	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getCod_producto() {
		return cod_producto;
	}
	public void setCod_producto(String cod_producto) {
		this.cod_producto = cod_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public String getTipo_producto_origen() {
		return tipo_producto_origen;
	}
	public void setTipo_producto_origen(String tipo_producto_origen) {
		this.tipo_producto_origen = tipo_producto_origen;
	}
	public String getTipo_producto_clase() {
		return tipo_producto_clase;
	}
	public void setTipo_producto_clase(String tipo_producto_clase) {
		this.tipo_producto_clase = tipo_producto_clase;
	}
	public String getDes_producto() {
		return des_producto;
	}
	public void setDes_producto(String des_producto) {
		this.des_producto = des_producto;
	}
}
