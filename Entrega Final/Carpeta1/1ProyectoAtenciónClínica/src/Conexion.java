import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conexion {
	private String usuario= "root";
	private String pass = "root";
	private String host = "localhost";
	private String bdname = "servicio_clinico";
	private Connection con = null;
	
	@SuppressWarnings("deprecation")
	public Connection getConexionMYSQL() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String servidor = "jdbc:mysql://"+host+"/"+bdname;
			con = (Connection)DriverManager.getConnection(servidor,usuario,pass);
			//System.out.println("Conexion correcta");
			return con;
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se pudo conectar con MySql");
			return con;
		}
	}
}