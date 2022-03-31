import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Clases.Alumno;
import Clases.Prueba;

import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.JRadioButton;

//import Caso0.Conexion;

@SuppressWarnings("serial")
public class Preguntas1 extends JFrame {
	private String codigo = "";
	private String nombre;
	private String correo;
	private int edad;
	private char sexo;
	private ArrayList <String> respuestas = new ArrayList <String>();
	private String eleccionProfesional;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Preguntas1 frame = new Preguntas1(null);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Preguntas1(String cod) throws SQLException {
		setTitle("PsicoEvaluaci\u00F3n - Preguntas 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.darkGray);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel.setForeground(Color.white);
		lblNewLabel.setBounds(23, 57, 89, 23);
	
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volverestudiante(cod);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.setBounds(394, 11, 89, 23);
		btnNewButton.setBackground(Color.white);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("Correo");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(23, 91, 68, 31);
		lblNewLabel_1.setForeground(Color.white);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Edad");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(348, 99, 89, 14);
		lblNewLabel_2.setForeground(Color.white);
		contentPane.add(lblNewLabel_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(17, 5, 100, 1));
		spinner.setBounds(401, 97, 48, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(475, 99, 58, 14);
		lblNewLabel_3.setForeground(Color.white);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Elecci\u00F3n vocacional");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(594, 99, 135, 14);
		lblNewLabel_4.setForeground(Color.white);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5;
		try {
			lblNewLabel_5 = new JLabel(lectura(1));
			lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblNewLabel_5.setBounds(33, 139, 906, 14);
			lblNewLabel_5.setForeground(Color.white);
			contentPane.add(lblNewLabel_5);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JLabel lblNewLabel_6;
		try {
			lblNewLabel_6 = new JLabel(lectura(2));
			lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblNewLabel_6.setBounds(33, 198, 857, 14);
			lblNewLabel_6.setForeground(Color.white);
			contentPane.add(lblNewLabel_6);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JLabel lblNewLabel_7;
		try {
			lblNewLabel_7 = new JLabel(lectura(3));
			lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblNewLabel_7.setBounds(33, 255, 857, 14);
			lblNewLabel_7.setForeground(Color.white);
			contentPane.add(lblNewLabel_7);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JLabel lblNewLabel_8;
		try {
			lblNewLabel_8 = new JLabel(lectura(4));
			lblNewLabel_8.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblNewLabel_8.setBounds(33, 311, 857, 14);
			lblNewLabel_8.setForeground(Color.white);
			contentPane.add(lblNewLabel_8);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JLabel lblNewLabel_9 = new JLabel(lectura(5));
		lblNewLabel_9.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(33, 365, 857, 14);
		lblNewLabel_9.setForeground(Color.white);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(lectura(6));
		lblNewLabel_10.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_10.setForeground(Color.white);
		lblNewLabel_10.setBounds(35, 416, 758, 23);
		
		contentPane.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setBounds(98, 59, 831, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 97, 223, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerListModel(new String[] {"F", "M"}));
		spinner_1.setBounds(525, 97, 40, 20);
		contentPane.add(spinner_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(724, 97, 202, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		//PRIMEROS BOTONES
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Estoy de acuerdo");
		
		rdbtnNewRadioButton.setBounds(115, 163, 135, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.setBounds(357, 165, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2.setBounds(639, 163, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		
		//SEGUNDOS BOTONES
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Estoy de acuerdo");
		
		rdbtnNewRadioButton_3.setBounds(115, 222, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1.isSelected()) {
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1.setBounds(357, 224, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2_1.isSelected()) {
					rdbtnNewRadioButton_3.setSelected(false);
					rdbtnNewRadioButton_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2_1.setBounds(639, 222, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1);
		
		
		
		
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3.isSelected()) {
					rdbtnNewRadioButton_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1.isSelected()) {
					rdbtnNewRadioButton_3.setSelected(false);
					rdbtnNewRadioButton_2_1.setSelected(false);
				}
			}
		});
		
		
		//TERCEROS BOTONES
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("Estoy de acuerdo");
		rdbtnNewRadioButton_3_1.setBounds(115, 281, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1.setBounds(357, 283, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2_1_1.setBounds(639, 281, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1_1);
		
		
		
		rdbtnNewRadioButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3_1.isSelected()) {
					rdbtnNewRadioButton_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1.setSelected(false);
				}
			}
		});
		
		
		//CUARTOS BOTONES
		JRadioButton rdbtnNewRadioButton_3_1_1 = new JRadioButton("Estoy de acuerdo");
		rdbtnNewRadioButton_3_1_1.setBounds(115, 335, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1.setBounds(357, 337, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1.setBounds(639, 335, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1_1_1);
		
		
		
		rdbtnNewRadioButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3_1_1.isSelected()) {
					rdbtnNewRadioButton_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1_1.setSelected(false);
				}
			}
		});
		
		//QUINTOS BOTONES
		JRadioButton rdbtnNewRadioButton_3_1_1_1 = new JRadioButton("Estoy de acuerdo");
		rdbtnNewRadioButton_3_1_1_1.setBounds(115, 386, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1_1.setBounds(357, 388, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1_1.setBounds(639, 386, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1_1_1_1);
		
		
		
		rdbtnNewRadioButton_3_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3_1_1_1.isSelected()) {
					rdbtnNewRadioButton_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1_1_1.setSelected(false);
				}
			}
		});
		
		//SEXTOS BOTONES
		JRadioButton rdbtnNewRadioButton_3_1_1_1_1 = new JRadioButton("Estoy de acuerdo");
		rdbtnNewRadioButton_3_1_1_1_1.setBounds(115, 446, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1_1_1.setBounds(357, 448, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1_1_1.setBounds(639, 446, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1_1_1_1_1);
		
	
		
		rdbtnNewRadioButton_3_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		
		
		
		//DIALOGO INICIAL
		try {
			do {
				codigo = JOptionPane.showInputDialog("Ingresa un codigo de 4 dígitos. (Ej: 9999)\nSi el codigo existe o no ingresas nada se solicitará de nuevo");
			}while(busqueda(codigo));
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//SIGUIENTE VENTANA
		JButton btnNewButton_1 = new JButton("Siguiente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//PREG1 *NEGATIVA
				if(rdbtnNewRadioButton.isSelected()) {
					respuestas.add("N");
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					respuestas.add("A");
				}else if(rdbtnNewRadioButton_2.isSelected()) {
					respuestas.add("O");
				}else {
					respuestas.add("E");
				}
				
				//PREG2 *NEGATIVA
				if(rdbtnNewRadioButton_3.isSelected()) {
					respuestas.add("N");
				}else if(rdbtnNewRadioButton_1_1.isSelected()) {
					respuestas.add("A");
				}else if(rdbtnNewRadioButton_2_1.isSelected()) {
					respuestas.add("O");
				}else {
					respuestas.add("E");
				}
				
				//PREG3 *NEGATIVA
				if(rdbtnNewRadioButton_3_1.isSelected()) {
					respuestas.add("N");
				}else if(rdbtnNewRadioButton_1_1_1.isSelected()) {
					respuestas.add("A");
				}else if(rdbtnNewRadioButton_2_1_1.isSelected()) {
					respuestas.add("O");
				}else {
					respuestas.add("E");
				}
				
				//PREG4 *NEGATIVA
				if(rdbtnNewRadioButton_3_1_1.isSelected()) {
					respuestas.add("N");
				}else if(rdbtnNewRadioButton_1_1_1_1.isSelected()) {
					respuestas.add("A");
				}else if(rdbtnNewRadioButton_2_1_1_1.isSelected()) {
					respuestas.add("O");
				}else {
					respuestas.add("E");
				}
				
				//PREG5 *NEGATIVA
				if(rdbtnNewRadioButton_3_1_1_1.isSelected()) {
					respuestas.add("N");
				}else if(rdbtnNewRadioButton_1_1_1_1_1.isSelected()) {
					respuestas.add("A");
				}else if(rdbtnNewRadioButton_2_1_1_1_1.isSelected()) {
					respuestas.add("O");
				}else {
					respuestas.add("E");
				}
				
				//PREG6 *NEGATIVA
				if(rdbtnNewRadioButton_3_1_1_1_1.isSelected()) {
					respuestas.add("N");
				}else if(rdbtnNewRadioButton_1_1_1_1_1_1.isSelected()) {
					respuestas.add("A");
				}else if(rdbtnNewRadioButton_2_1_1_1_1_1.isSelected()) {
					respuestas.add("O");
				}else {
					respuestas.add("E");
				}
				
				nombre = textField.getText();
				correo = textField_1.getText();
				edad = (int) spinner.getValue();
				
				String aux = (String) spinner_1.getValue();
				sexo = aux.charAt(0);
				eleccionProfesional = textField_2.getText();
				
				System.out.println(respuestas);
				Alumno a = new Alumno(codigo,nombre,correo,edad,sexo,respuestas,null,eleccionProfesional);
				call_preg2(a);
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_1.setBounds(819, 499, 120, 23);
		btnNewButton_1.setBackground(Color.white);
		contentPane.add(btnNewButton_1);
	}
	
	
	
	
	
	void volver(String cod) {
		try {
			this.setVisible(false);
			Menu frame = new Menu(cod);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	void volverestudiante(String cod) {
		try {
			this.setVisible(false);
			MenuEstudiante frame = new MenuEstudiante(cod);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	boolean busqueda(String cod) throws SQLException {
		if(cod ==null || cod.equals("")) {
			//System.out.println("aqui"+cod);
			return true;
		}
		Conexion con=new Conexion();
		Connection conexion = (Connection) con.getConexionMYSQL();
		Statement s=(Statement)conexion.createStatement();
		//String cod = JOptionPane.showInputDialog("Codigo del cliente a buscar");
		ResultSet rs= (ResultSet) s.executeQuery("select * from alumno where codigo = '"+cod+"'");
		
		
		if(rs.next()==true ) {
			conexion.close();
			return true;
		}
		else {
			conexion.close();
			return false;
		}
	}
	boolean comprobacion(String cod) throws SQLException {
		if(cod.equals(null)) {
			return true;
		}
		Conexion con=new Conexion();
		Connection conexion = (Connection) con.getConexionMYSQL();
		Statement s=(Statement)conexion.createStatement();
		//String cod = JOptionPane.showInputDialog("Codigo del cliente a buscar");
		ResultSet rs= (ResultSet) s.executeQuery("select * from profesional where codigo = '"+cod+"'");
		if(rs.next()==true) {
			conexion.close();
			return false;
		}
		else {
			conexion.close();
			return true;
		}
	}
	String lectura(int nump) throws SQLException {
		Conexion con=new Conexion();
		Connection conexion = (Connection) con.getConexionMYSQL();
		Statement s=(Statement)conexion.createStatement();
		ResultSet rs= (ResultSet) s.executeQuery("select * from preguntas");
		//String texto = "Esta prueba evalua el nivel de madurez vocacional tomando en cuenta 5 categorías: Planificación, exploración, información, realismo, toma de decisiones.\n\nPreguntas:\n\n";
		ArrayList<String> pregs = new ArrayList<String>();
		while (rs.next()) {
			pregs.add(rs.getString(1));pregs.add(rs.getString(2));pregs.add(rs.getString(3));pregs.add(rs.getString(4));pregs.add(rs.getString(5));
			pregs.add(rs.getString(6));pregs.add(rs.getString(7));pregs.add(rs.getString(8));pregs.add(rs.getString(9));pregs.add(rs.getString(10));
			pregs.add(rs.getString(11));pregs.add(rs.getString(12));pregs.add(rs.getString(13));pregs.add(rs.getString(14));pregs.add(rs.getString(15));
			pregs.add(rs.getString(16));pregs.add(rs.getString(17));pregs.add(rs.getString(18));pregs.add(rs.getString(19));pregs.add(rs.getString(20));
			pregs.add(rs.getString(21));pregs.add(rs.getString(22));pregs.add(rs.getString(23));pregs.add(rs.getString(24));pregs.add(rs.getString(25));
			pregs.add(rs.getString(26));pregs.add(rs.getString(27));pregs.add(rs.getString(28));pregs.add(rs.getString(29));pregs.add(rs.getString(30));
			//System.out.println(rs.getString(1)+"\n "+rs.getString(2)+"\n "+rs.getString(3));
			//texto += rs.getString(1)+"\n "+rs.getString(2)+"\n "+rs.getString(3)+"\n "+rs.getString(4)+"\n "+rs.getString(5)+"\n "+rs.getString(6)+"\n "+rs.getString(7)+"\n "+rs.getString(8)+"\n "+rs.getString(9)+"\n "+rs.getString(10)+"\n "+rs.getString(11)+"\n "+rs.getString(12)+"\n "+rs.getString(13)+"\n "+rs.getString(14)+"\n "+rs.getString(15)+"\n "+rs.getString(16)+"\n "+rs.getString(17)+"\n "+rs.getString(18)+"\n "+rs.getString(19)+"\n "+rs.getString(20)+"\n "+rs.getString(21)+"\n "+rs.getString(22)+"\n "+rs.getString(23)+"\n "+rs.getString(24)+"\n "+rs.getString(25)+"\n "+rs.getString(26)+"\n "+rs.getString(27)+"\n "+rs.getString(28)+"\n "+rs.getString(29)+"\n "+rs.getString(30);
		}
		Prueba pr = new Prueba(pregs, "Selección multiple.", null);
		conexion.close();
		return pr.mostrarPregunta(nump);
	}
	
	void call_preg2(Alumno a) {
		try {
			
			this.setVisible(false);
			Preguntas2 frame = new Preguntas2(a);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
