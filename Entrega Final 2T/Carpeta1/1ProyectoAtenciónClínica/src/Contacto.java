//import java.awt.BorderLayout;
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
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Contacto extends JFrame {
	
	//ImageIcon umsa = new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\ProyectoAtenciónClínica\\resources\\Umsa.png");
	ImageIcon umsa = new ImageIcon(getClass().getClassLoader().getResource("Umsa.png"));
	//ImageIcon ucb = new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\ProyectoAtenciónClínica\\resources\\ucb.png");
	ImageIcon ucb = new ImageIcon(getClass().getClassLoader().getResource("ucb.png"));
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contacto frame = new Contacto(null);
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
	public Contacto(String cod) {
		setTitle("PsicoEvaluaci\u00F3n - Contacto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.darkGray);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 30, 188, 369);
		lblNewLabel.setIcon(umsa);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cod == null || cod.equals("")) {
					volverestudiante(cod);
				}else {
					volver(cod);
				}
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.setBounds(394, 11, 89, 23);
		btnNewButton.setBackground(Color.white);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("Servicio de Atenci\u00F3n en Psicolog\u00EDa Cl\u00EDnica - UMSA");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(202, 51, 356, 32);
		lblNewLabel_1.setForeground(Color.white);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(208, 87, 484, 14);
		lblNewLabel_2.setForeground(Color.white);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("C.B. Salinas N\u00B0516, Casa Rene Calder\u00F3n Soria");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(224, 112, 334, 14);
		lblNewLabel_3.setForeground(Color.white);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("P\u00E1gina Web");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(208, 137, 569, 14);
		lblNewLabel_4.setForeground(Color.white);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("www.iiipp.umsa.bo");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(224, 162, 188, 14);
		lblNewLabel_5.setForeground(Color.white);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Carrera de Ing. de Sistemas - UCB");
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(208, 206, 275, 14);
		lblNewLabel_6.setForeground(Color.white);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Direcci\u00F3n");
		lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(208, 231, 172, 14);
		lblNewLabel_7.setForeground(Color.white);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Av. 14 de Septiembre N\u00B04807 Esquina, La Paz");
		lblNewLabel_8.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(218, 256, 378, 14);
		lblNewLabel_8.setForeground(Color.white);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("P\u00E1gina Web");
		lblNewLabel_9.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(208, 281, 116, 14);
		lblNewLabel_9.setForeground(Color.white);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(595, 37, 334, 375);
		lblNewLabel_10.setIcon(ucb);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("https://lpz.ucb.edu.bo/pregrado/ingenieria-de-sistemas/");
		lblNewLabel_11.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(218, 306, 395, 14);
		lblNewLabel_11.setForeground(Color.white);
		contentPane.add(lblNewLabel_11);
		
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

}
