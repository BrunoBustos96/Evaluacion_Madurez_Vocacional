package Clases;

import java.util.ArrayList;

public class Alumno extends Usuario {
	private int edad;
	private char sexo;
	private ArrayList <String> respuestas = new ArrayList <String>();
	private String nivelMadurez;
	private String eleccionVocacional;
	public Alumno(String codigo, String nombre, String correo, int edad, char sexo, ArrayList<String> respuestas,
			String nivelMadurez, String eleccionVocacional) {
		super(codigo, nombre, correo);
		this.edad = edad;
		this.sexo = sexo;
		this.respuestas = respuestas;
		this.nivelMadurez = nivelMadurez;
		this.eleccionVocacional = eleccionVocacional;
	}
	public int getEdad() {
		return edad;
	}
	public char getSexo() {
		return sexo;
	}
	public ArrayList<String> getRespuestas() {
		return respuestas;
	}
	public String getNivelMadurez() {
		return nivelMadurez;
	}
	public String getEleccionVocacional() {
		return eleccionVocacional;
	}
	@Override
	public String mostrarUsuario() {
		// TODO Auto-generated method stub
		
		return "Estudiante: "+getNombre()+"\nCódigo: "+getCodigo()+"\nCorreo: "+getCorreo()+"\nEdad: "+getEdad()+"\nSexo: "+getSexo()+"\nRespuestas: "+getRespuestas()+"\nNivel de madurez vocacional: "+getNivelMadurez()+"\nEleccion vocacional: "+getEleccionVocacional();
	}
	
	
	public void tomarPrueba() {
		int puntuacion = 30;
		for(int i = 0; i < getRespuestas().size(); i++) {
			if(getRespuestas().get(i).equals("A")) {
				puntuacion += 1;
			}else if (getRespuestas().get(i).equals("N")) {
				puntuacion -= 1;
			}else if (getRespuestas().get(i).equals("O")) {
				continue; //La puntuacion no sube ni baja
			}else if(getRespuestas().get(i).equals("E")) {
				puntuacion -= 100; //La prueba debe repetirse porque hay preguntas sin respuesta
			}else
				System.out.println("ERROR EN LAS EQUIVALENCIAS DE LAS PREGUNTAS");
			//System.out.println();
		}
		
		if (puntuacion >= 40) {
			nivelMadurez = "Alto";
		}else if(puntuacion >= 20) {
			nivelMadurez = "Medio";
		}else if(puntuacion >= 0) {
			nivelMadurez = "Bajo";
		}else
			nivelMadurez = "DebeRepetirPr";
	}
	/*
	void tabla() throws SQLException {
			
			Conexion con=new Conexion();
			Connection conexion = (Connection) con.getConexionMYSQL();
			Statement s=(Statement)conexion.createStatement();
			ResultSet rs= (ResultSet) s.executeQuery("select * from cliente");
			
			
			
			DefaultTableModel modelo = new DefaultTableModel();
			JTable table = new JTable(modelo);
			table.setBounds(27, 36, 381, 198);
			
			modelo.addColumn("Cuenta");
			modelo.addColumn("CI o NIT");
			modelo.addColumn("Nombre");
			modelo.addColumn("Saldo");
			
			Object [] noms = new Object[4];
			noms[0] = "Cuenta";
			noms[1] = "CI o NIT";
			noms[2] = "Nombre";
			noms[3] = "Saldo";
			modelo.addRow(noms);
			
			while (rs.next()) {
				Object [] fila = new Object[4];
				
				
				for (int i=0;i<4;i++)
				      fila[i] = rs.getObject(i+1);
				modelo.addRow(fila);
				
			}
			conexion.close();
			contentPane.add(table);
			
			JButton btnNewButton = new JButton("Volver");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					volver();
				}
			});
			btnNewButton.setBounds(319, 245, 89, 23);
			contentPane.add(btnNewButton);
		}
	*/
}
