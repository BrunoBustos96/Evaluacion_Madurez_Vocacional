import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Clases.Prueba;

//import Caso0.Conexion;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Descripcion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Descripcion frame = new Descripcion(null);
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
	public Descripcion(String cod) {
		setTitle("PsicoEvaluaci\u00F3n - Prueba");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.darkGray);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 49, 964, 590);
		String descr = "";
		try {
			descr = lectura();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		textArea.append(descr);
		
		contentPane.add(textArea);
		
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver(cod);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.setBounds(432, 11, 89, 23);
		btnNewButton.setBackground(Color.white);
		contentPane.add(btnNewButton);
	}
	
	String lectura() throws SQLException {
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
		return pr.mostrarPreguntas();
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
