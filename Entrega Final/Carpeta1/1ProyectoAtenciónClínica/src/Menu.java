//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Menu extends JFrame {
	//ImageIcon fondo = new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\ProyectoAtenciónClínica\\resources\\Why-Study-Psychology.jpg");
	ImageIcon fondo = new ImageIcon(getClass().getClassLoader().getResource("Why-Study-Psychology.jpg"));
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu(null);
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
	public Menu(String cod) {
		setTitle("PsicoEvaluaci\u00F3n - Menú");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.darkGray);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver(null);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton.setBounds(261, 42, 89, 23);
		btnNewButton.setBackground(Color.white);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Prueba");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descripcion(cod);
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_1.setBounds(21, 8, 89, 23);
		btnNewButton_1.setBackground(Color.white);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Edici\u00F3n");
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edicion(cod);
			}
		});
		btnNewButton_2.setBounds(120, 8, 80, 23);
		btnNewButton_2.setBackground(Color.white);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Resultados");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				results(cod);
			}
		});
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_3.setBounds(210, 8, 95, 23);
		btnNewButton_3.setBackground(Color.white);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("FAQ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pregfreq(cod);
			}
		});
		btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_4.setBounds(315, 8, 65, 23);
		btnNewButton_4.setBackground(Color.white);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Contacto");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contacto(cod);
			}
		});
		btnNewButton_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_5.setBounds(390, 8, 89, 23);
		btnNewButton_5.setBackground(Color.white);
		contentPane.add(btnNewButton_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 74, 623, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(21, 87, 623, 263);
		lblNewLabel.setIcon(fondo);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_5_1 = new JButton("Agregar Profesional");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarProfesional(cod);
			}
			
		});
		btnNewButton_5_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_5_1.setBackground(Color.WHITE);
		btnNewButton_5_1.setBounds(489, 8, 155, 23);
		contentPane.add(btnNewButton_5_1);
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
	
	void descripcion(String cod) {
		try {
			this.setVisible(false);
			Descripcion frame = new Descripcion(cod);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	void edicion(String cod) {
		try {
			this.setVisible(false);
			Edicion frame = new Edicion(cod);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	void results(String cod) {
		try {
			this.setVisible(false);
			Resultados frame = new Resultados(cod);
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
	
	void agregarProfesional(String cod) {
		try {
			this.setVisible(false);
			AgregarProfesional frame = new AgregarProfesional(cod);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
