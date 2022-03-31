//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

//import Caso0.Conexion;
import Clases.Prueba;

//import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Edicion extends JFrame {

	private JPanel contentPane;
	int num;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edicion frame = new Edicion(null);
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
	public Edicion(String cod) {
		setTitle("PsicoEvaluaci\u00F3n - Edici\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.darkGray);
		contentPane.setLayout(null);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(39, 137, 985, 23);
		textArea.setEditable(false);
		textArea.setText("Selecciona el numero de pregunta a editar...");
		contentPane.add(textArea);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 30, 1));
		spinner.setBounds(273, 53, 48, 20);
		contentPane.add(spinner);
		spinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				num = (int) spinner.getValue();
				
				
				try {
					String texto = "";
					texto = pregunta(num);
					textArea.setText(texto);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		
		});
		
		JLabel lblNewLabel = new JLabel("Editar las preguntas del cuestionario.");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel.setBounds(341, 11, 282, 14);
		lblNewLabel.setForeground(Color.white);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero de pregunta a modificar");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(39, 55, 224, 14);
		lblNewLabel_1.setForeground(Color.white);
		contentPane.add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Pregunta a reemplazar:");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(39, 98, 173, 14);
		lblNewLabel_2.setForeground(Color.white);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					actualizar();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.setBounds(341, 259, 106, 23);
		btnNewButton.setBackground(Color.white);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver(cod);
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_1.setBounds(534, 259, 89, 23);
		btnNewButton_1.setBackground(Color.white);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Nueva pregunta:");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(39, 178, 199, 14);
		lblNewLabel_3.setForeground(Color.white);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(39, 217, 985, 23);
		contentPane.add(textField);
		textField.setColumns(10);
	}

	private String pregunta(int num) throws SQLException {
		// TODO Auto-generated method stub
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
		return pr.mostrarPregunta(num);
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
	void actualizar()throws SQLException{
		Conexion con=new Conexion();
		Connection conexion = (Connection) con.getConexionMYSQL();
		//int cod = Integer.parseInt(JOptionPane.showInputDialog("Codigo del cliente a actualizar"));
		
		/*
		JOptionPane.showMessageDialog(null, "Para mantener un dato, escribalo de la misma manera de antes");
		String nnombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
		String nnzona = JOptionPane.showInputDialog("Ingrese la nueva zona");
		*/
		PreparedStatement s;
		String query= "update preguntas set preg"+num+"='"+ textField.getText() + "'";		
		
		try {
			s=(PreparedStatement) conexion.prepareStatement(query);
			
			s.executeUpdate();
			JOptionPane.showMessageDialog(null, "Pregunta "+num+" modificada correctamente");
		} catch (SQLException e) {
			System.err.println(e);
		}
		conexion.close();
	}
}
