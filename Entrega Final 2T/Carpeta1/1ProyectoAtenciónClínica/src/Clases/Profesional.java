package Clases;

public class Profesional extends Usuario {
	private String contrasena;
	public Profesional(String codigo, String nombre, String correo,String contrasena) {
		super(codigo, nombre, correo);
		// TODO Auto-generated constructor stub
		this.contrasena = contrasena;
	}
	
	
	public String getContrasena() {
		return contrasena;
	}


	@Override
	public String mostrarUsuario() {
		// TODO Auto-generated method stub
		return "Profesional: "+getNombre()+"\nCódigo: "+getCodigo()+"\nCorreo: "+getCorreo();
	}
	

}
