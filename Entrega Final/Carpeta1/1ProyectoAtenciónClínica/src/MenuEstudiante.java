import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MenuEstudiante extends JFrame {
	//ImageIcon fondo = new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\ProyectoAtenciónClínica\\resources\\vocacion.jpg");
	ImageIcon fondo = new ImageIcon(getClass().getClassLoader().getResource("vocacion.jpg"));
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuEstudiante frame = new MenuEstudiante(null);
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

	public MenuEstudiante(String cod) {
		// TODO Auto-generated constructor stub
		setTitle("PsicoEvaluaci\u00F3n - Menú");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.darkGray);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver(cod);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton.setBounds(499, 11, 105, 23);
		btnNewButton.setBackground(Color.white);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tomar prueba");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tomarprueba(cod);
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_1.setBounds(21, 11, 153, 23);
		btnNewButton_1.setBackground(Color.white);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("FAQ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pregfreq(cod);
			}
		});
		btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_4.setBounds(197, 11, 147, 23);
		btnNewButton_4.setBackground(Color.white);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Contacto");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contacto(cod);
			}
		});
		btnNewButton_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_5.setBounds(361, 11, 117, 23);
		btnNewButton_5.setBackground(Color.white);
		contentPane.add(btnNewButton_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 45, 583, 3);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(21, 59, 583, 354);
		lblNewLabel.setIcon(fondo);
		contentPane.add(lblNewLabel);
	}
	void volver(String cod) {
		try {
			this.setVisible(false);
			Login frame = new Login();
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	void pregfreq(String cod) {
		try {
			this.setVisible(false);
			FAQ frame = new FAQ(cod);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	void contacto(String cod) {
		try {
			this.setVisible(false);
			Contacto frame = new Contacto(cod);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	void tomarprueba(String cod) {
		try {
			this.setVisible(false);
			Preguntas1 frame = new Preguntas1(cod);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
