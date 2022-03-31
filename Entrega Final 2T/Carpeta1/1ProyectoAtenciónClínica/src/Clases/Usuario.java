package Clases;

public abstract class Usuario {
	String codigo = "";
	String nombre;
	String correo;
	
	public Usuario(String codigo, String nombre, String correo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.correo = correo;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}
	
	public abstract String mostrarUsuario();
}
