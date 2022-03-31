//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Clases.Profesional;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
//import javax.swing.UIManager;
import javax.swing.JPasswordField;
//import javax.swing.JRootPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
//import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	//ImageIcon psicoicono = new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\ProyectoAtenciónClínica\\resources\\psi-simbolo.png");
	ImageIcon psicoicono = new ImageIcon(getClass().getClassLoader().getResource("psi-simbolo.png"));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		setUndecorated( true );
		//getRootPane().setBackground(getForeground());
		
		setTitle("PsicoEvaluaci\u00F3n - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.darkGray);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Bienvenido al programa de pruebas del Servicio de Atenci\u00F3n en Psicolog\u00EDa Cl\u00EDnica");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel.setBounds(75, 245, 540, 16);
		lblNewLabel.setForeground(Color.white);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(242, 322, 67, 14);
		lblNewLabel_1.setForeground(Color.white);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(319, 320, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(229, 370, 80, 14);
		lblNewLabel_2.setForeground(Color.white);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(319, 368, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Estudiante");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call_me(textField.getText());
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.white);
		btnNewButton.setBounds(21, 365, 125, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ingresar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ingresar();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_1.setBounds(497, 318, 89, 23);
		btnNewButton_1.setBackground(Color.white);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_2.setBounds(497, 366, 89, 23);
		btnNewButton_2.setBackground(Color.white);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Acceso Profesional");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(265, 287, 140, 14);
		lblNewLabel_3.setForeground(Color.white);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(177, 11, 280, 232);
		lblNewLabel_4.setIcon(psicoicono);
		contentPane.add(lblNewLabel_4);
	}
	
	@SuppressWarnings("deprecation")
	void ingresar() throws SQLException {
		try {
			Conexion con=new Conexion();
			Connection conexion = (Connection) con.getConexionMYSQL();
			Statement s=(Statement)conexion.createStatement();
			ResultSet rs= (ResultSet) s.executeQuery("select * from profesional");
			
			boolean in = false;
			//textField_1.getText().equals(rs.getString(1))
			
			while (rs.next()) {
				
				Profesional p = new Profesional(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				
				if (textField.getText().equals(p.getCodigo()) && passwordField.getText().equals(p.getContrasena())) {
					
					System.out.println("Ingreso Correcto");
					in = true;
					
					//System.out.println(textField.getText());
					call_m(p.getCodigo());
					limpiarCampos();
				}
				
				
			}
			if (!in) {
				JOptionPane.showMessageDialog(null,"Usuario o pin incorrectos");
				limpiarCampos();
			}
			conexion.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	void limpiarCampos() {
		textField.setText("");
		passwordField.setText("");
		
	}
	void call_m(String cod) {
		try {
			this.setVisible(false);
			Menu frame = new Menu(cod);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	void call_me(String cod) {
		try {
			this.setVisible(false);
			MenuEstudiante frame = new MenuEstudiante(cod);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
