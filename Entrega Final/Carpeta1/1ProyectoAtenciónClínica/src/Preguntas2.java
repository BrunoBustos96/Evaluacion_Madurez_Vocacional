import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Clases.Alumno;
import Clases.Prueba;

@SuppressWarnings("serial")
public class Preguntas2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Preguntas2 frame = new Preguntas2(null);
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
	public Preguntas2(Alumno a) throws SQLException {
		//System.out.print(cod);
		setTitle("PsicoEvaluaci\u00F3n - Preguntas 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.darkGray);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(busqueda(a.getCodigo())  ) {
						volverestudiante(a.getCodigo());
					}else {
						volver(a.getCodigo());
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.setBounds(482, 11, 89, 23);
		btnNewButton.setBackground(Color.white);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5;
		try {
			lblNewLabel_5 = new JLabel(lectura(7));
			lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblNewLabel_5.setBounds(32, 41, 906, 14);
			lblNewLabel_5.setForeground(Color.white);
			contentPane.add(lblNewLabel_5);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JLabel lblNewLabel_6;
		try {
			lblNewLabel_6 = new JLabel(lectura(8));
			lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblNewLabel_6.setBounds(32, 100, 857, 14);
			lblNewLabel_6.setForeground(Color.white);
			contentPane.add(lblNewLabel_6);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JLabel lblNewLabel_7;
		try {
			lblNewLabel_7 = new JLabel(lectura(9));
			lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblNewLabel_7.setBounds(32, 157, 857, 14);
			lblNewLabel_7.setForeground(Color.white);
			contentPane.add(lblNewLabel_7);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JLabel lblNewLabel_8;
		try {
			lblNewLabel_8 = new JLabel(lectura(10));
			lblNewLabel_8.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblNewLabel_8.setBounds(32, 213, 857, 14);
			lblNewLabel_8.setForeground(Color.white);
			contentPane.add(lblNewLabel_8);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JLabel lblNewLabel_9 = new JLabel(lectura(11));
		lblNewLabel_9.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(32, 267, 906, 14);
		lblNewLabel_9.setForeground(Color.white);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(lectura(12));
		lblNewLabel_10.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_10.setForeground(Color.white);
		lblNewLabel_10.setBounds(34, 318, 1129, 23);
		
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel(lectura(13));
		lblNewLabel_10_1.setForeground(Color.WHITE);
		lblNewLabel_10_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_10_1.setBounds(32, 380, 1131, 23);
		contentPane.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel(lectura(14));
		lblNewLabel_10_1_1.setForeground(Color.WHITE);
		lblNewLabel_10_1_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_10_1_1.setBounds(32, 428, 1131, 23);
		contentPane.add(lblNewLabel_10_1_1);
		

		JLabel lblNewLabel_10_1_1_1 = new JLabel(lectura(15));
		lblNewLabel_10_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_10_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_10_1_1_1.setBounds(32, 475, 1131, 23);
		contentPane.add(lblNewLabel_10_1_1_1);
		
		JLabel lblNewLabel_10_1_1_1_1 = new JLabel(lectura(16));
		lblNewLabel_10_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_10_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_10_1_1_1_1.setBounds(32, 523, 1131, 23);
		contentPane.add(lblNewLabel_10_1_1_1_1);
		
		JLabel lblNewLabel_10_1_1_1_1_1 = new JLabel(lectura(17));
		lblNewLabel_10_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_10_1_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_10_1_1_1_1_1.setBounds(32, 571, 1131, 23);
		contentPane.add(lblNewLabel_10_1_1_1_1_1);
		
		JLabel lblNewLabel_10_1_1_1_1_1_1 = new JLabel(lectura(18));
		lblNewLabel_10_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_10_1_1_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_10_1_1_1_1_1_1.setBounds(32, 619, 1131, 23);
		contentPane.add(lblNewLabel_10_1_1_1_1_1_1);
		/*
		textField = new JTextField();
		textField.setBounds(98, 59, 831, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 97, 223, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(724, 97, 202, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		*/
		
		//PRIMEROS BOTONES
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Estoy de acuerdo");
		
		rdbtnNewRadioButton.setBounds(114, 65, 135, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.setBounds(356, 67, 172, 23);
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
		rdbtnNewRadioButton_2.setBounds(638, 65, 109, 23);
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
		
		rdbtnNewRadioButton_3.setBounds(114, 124, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1.isSelected()) {
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1.setBounds(356, 126, 172, 23);
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
		rdbtnNewRadioButton_2_1.setBounds(638, 124, 109, 23);
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
		rdbtnNewRadioButton_3_1.setBounds(114, 183, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1.setBounds(356, 185, 172, 23);
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
		rdbtnNewRadioButton_2_1_1.setBounds(638, 183, 109, 23);
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
		rdbtnNewRadioButton_3_1_1.setBounds(114, 237, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1.setBounds(356, 239, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1.setBounds(638, 237, 109, 23);
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
		rdbtnNewRadioButton_3_1_1_1.setBounds(114, 288, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1_1.setBounds(356, 290, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1_1.setBounds(638, 288, 109, 23);
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
		rdbtnNewRadioButton_3_1_1_1_1.setBounds(114, 348, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1_1_1.setBounds(356, 350, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1_1_1.setBounds(638, 348, 109, 23);
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
		
		//SEPTIMOS BOTONES
		JRadioButton rdbtnNewRadioButton_3_1_1_1_1_1 = new JRadioButton("Estoy de acuerdo");
		rdbtnNewRadioButton_3_1_1_1_1_1.setBounds(114, 402, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1_1_1_1.setBounds(356, 404, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1_1_1_1.setBounds(638, 402, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1_1_1_1_1_1);
		
		
		
		
		
		rdbtnNewRadioButton_3_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		
		//OCTAVOS BOTONES
		
		JRadioButton rdbtnNewRadioButton_3_1_1_1_1_1_1 = new JRadioButton("Estoy de acuerdo");
		rdbtnNewRadioButton_3_1_1_1_1_1_1.setBounds(114, 450, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1.setBounds(356, 452, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1_1_1_1_1.setBounds(638, 450, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1_1_1_1_1_1_1);
		
		
		
		
		rdbtnNewRadioButton_3_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_1_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		
		
		
		//NOVENOS BOTONES
		JRadioButton rdbtnNewRadioButton_3_1_1_1_1_1_1_1 = new JRadioButton("Estoy de acuerdo");
		rdbtnNewRadioButton_3_1_1_1_1_1_1_1.setBounds(114, 497, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1.setBounds(356, 499, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1.setBounds(638, 497, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1);
		
		
		
		
		
		rdbtnNewRadioButton_3_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		
		//DECIMOS BOTONES
		JRadioButton rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1 = new JRadioButton("Estoy de acuerdo");
		rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1.setBounds(114, 545, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1.setBounds(356, 547, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1.setBounds(638, 545, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1);
		
		
		
		
		
		rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		
		//ONCEAVOS BOTONES
		JRadioButton rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1 = new JRadioButton("Estoy de acuerdo");
		rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1.setBounds(114, 593, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1.setBounds(356, 595, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1.setBounds(638, 593, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1);
		
		
		
		
		
		rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		
		//DOCEAVOS BOTONES
		JRadioButton rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1_1 = new JRadioButton("Estoy de acuerdo");
		rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1_1.setBounds(114, 641, 135, 23);
		contentPane.add(rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1_1 = new JRadioButton("No estoy de acuerdo");
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(356, 643, 172, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1_1 = new JRadioButton("Sin respuesta");
		rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1_1.setBounds(638, 641, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1_1);
		
		rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1_1.setSelected(false);
					rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1_1.setSelected(false);
				}
			}
		});
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PREG7
				if(rdbtnNewRadioButton.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_2.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
				//PREG8
				if(rdbtnNewRadioButton_3.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_1_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_2_1.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
				//PREG9
				if(rdbtnNewRadioButton_3_1.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_1_1_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_2_1_1.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
				//PREG10
				if(rdbtnNewRadioButton_3_1_1.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_1_1_1_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_2_1_1_1.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
				//PREG11
				if(rdbtnNewRadioButton_3_1_1_1.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_2_1_1_1_1.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
				//PREG12
				if(rdbtnNewRadioButton_3_1_1_1_1.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_2_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
				//PREG13 *NEGATIVA
				   //rdbtnNewRadioButton_3_1_1_1_1_1
				if(rdbtnNewRadioButton_3_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_2_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
				//PREG14 *NEGATIVA
				if(rdbtnNewRadioButton_3_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_2_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
	
				//PREG15 
				if(rdbtnNewRadioButton_3_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
				//PREG16 *NEGATIVA
				if(rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
				//PREG17
				 
				if(rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
				//PREG18 *NEGATIVA
				   
				if(rdbtnNewRadioButton_3_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("N");
				}else if(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("A");
				}else if(rdbtnNewRadioButton_2_1_1_1_1_1_1_1_1_1_1_1.isSelected()) {
					a.getRespuestas().add("O");
				}else {
					a.getRespuestas().add("E");
				}
				
				System.out.println(a.getRespuestas());
				call_preg3(a);
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_1.setBounds(972, 662, 120, 23);
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
	

	void call_preg3(Alumno a) {
		try {
			this.setVisible(false);
			Preguntas3 frame = new Preguntas3(a);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
