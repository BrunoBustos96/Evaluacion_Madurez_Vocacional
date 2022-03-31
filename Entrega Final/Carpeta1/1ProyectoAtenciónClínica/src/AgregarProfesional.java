import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.awt.Font;

@SuppressWarnings("serial")
public class AgregarProfesional extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarProfesional frame = new AgregarProfesional(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AgregarProfesional(String cod) {
		setTitle("PsicoEvaluaci\u00F3n - Agregar profesional");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.darkGray);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AGREGAR NUEVO PROFESIONAL");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel.setBounds(209, 11, 231, 14);
		lblNewLabel.setForeground(Color.white);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo cuenta (4 digitos):");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(46, 57, 182, 14);
		lblNewLabel_1.setForeground(Color.white);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(225, 54, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre (50 caracteres):");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(46, 102, 169, 14);
		lblNewLabel_3.setForeground(Color.white);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 99, 432, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Correo (30 caracteres):");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(46, 141, 169, 14);
		lblNewLabel_4.setForeground(Color.white);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(225, 138, 432, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Contrase\u00F1a (20 caracteres):");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(46, 179, 329, 14);
		lblNewLabel_5.setForeground(Color.white);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					agrega(cod);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(525, 213, 89, 23);
		btnNewButton.setBackground(Color.white);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(241, 177, 199, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver(cod);
			}
		});
		btnNewButton_1.setBounds(525, 179, 89, 23);
		btnNewButton_1.setBackground(Color.white);
		contentPane.add(btnNewButton_1);
	}
	
	@SuppressWarnings("deprecation")
	void agrega(String cod)throws SQLException{
		Conexion con=new Conexion();
		Connection conexion = (Connection) con.getConexionMYSQL();
		PreparedStatement s;
		
		
		String codigo= textField.getText();
		
		String nombre = textField_2.getText();
		String correo = textField_3.getText();
		String pass = passwordField.getText();
		
		String query="insert into profesional"
				+ "(codigo,nombre,correo,contrasena) values "
				+ "(?,?,?,?)";
		//String query2 = "insert into login"+"(pin,cod) values" + "(?,?)";
		
		try {
			s=(PreparedStatement) conexion.prepareStatement(query);
			
			s.setString(1, codigo);
			s.setString(2, nombre);
			s.setString(3, correo);
			s.setString(4, pass);
			s.executeUpdate();
			
			JOptionPane.showMessageDialog(null,"Profesional agregado correctamente.");
			volver(cod);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		conexion.close();
		System.out.println("Datos ingresados correctamente");
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
}
