import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FAQ extends JFrame {
	//ImageIcon interrogacion = new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\ProyectoAtenciónClínica\\resources\\interrogacion.jpg");
	ImageIcon interrogacion = new ImageIcon(getClass().getClassLoader().getResource("interrogacion.jpg"));
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAQ frame = new FAQ(null);
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
	public FAQ(String cod) {
		setTitle("PsicoEvaluaci\u00F3n - FAQ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.darkGray);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 51, 605, 227);
		lblNewLabel.setIcon(interrogacion);
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
		btnNewButton.setBounds(255, 11, 89, 23);
		btnNewButton.setBackground(Color.white);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("¿Que se hace con mis resultados?");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 275, 277, 32);
		lblNewLabel_1.setForeground(Color.white);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Todos los resultados son procesados con fines estadísticos.");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(34, 311, 484, 14);
		lblNewLabel_2.setForeground(Color.white);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("¿Se mantiene mi anonimato y privacidad?");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 336, 334, 14);
		lblNewLabel_3.setForeground(Color.white);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Todos los datos se mantienen de forma anónima y segura en nuestra base de datos.");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(34, 361, 569, 14);
		lblNewLabel_4.setForeground(Color.white);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("¿Como puedo acceder a mis resultados?");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 386, 343, 14);
		lblNewLabel_5.setForeground(Color.white);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Para toda entrega de resultados se recomienda de una cita con un profesional del instituto.");
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(34, 411, 581, 14);
		lblNewLabel_6.setForeground(Color.white);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("¿Son fiables los resultados?");
		lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 432, 381, 14);
		lblNewLabel_7.setForeground(Color.white);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Todas nuestras pruebas han sido validades por profesionales. Aun así, el diagnostico");
		lblNewLabel_8.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(34, 457, 569, 14);
		lblNewLabel_8.setForeground(Color.white);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("psicológico es un proceso mas complejo y requiere mas variables a tomar en cuenta");
		lblNewLabel_9.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(34, 483, 569, 14);
		lblNewLabel_9.setForeground(Color.white);
		contentPane.add(lblNewLabel_9);
		
		
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
