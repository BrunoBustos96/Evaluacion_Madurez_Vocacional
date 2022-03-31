import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Font;

@SuppressWarnings("serial")
public class Resultados extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultados frame = new Resultados(null);
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
	public Resultados(String cod) {
		setTitle("PsicoEvaluaci\u00F3n - Resultados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.darkGray);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESULTADOS PRUEBA VOCACIONAL");
		lblNewLabel.setBounds(455, 11, 208, 14);
		lblNewLabel.setForeground(Color.white);
		contentPane.add(lblNewLabel);
		
		try {
			tabla(cod);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	void tabla(String cod) throws SQLException {
			
			Conexion con=new Conexion();
			Connection conexion = (Connection) con.getConexionMYSQL();
			Statement s=(Statement)conexion.createStatement();
			ResultSet rs= (ResultSet) s.executeQuery("select * from alumno");
			
			
			
			DefaultTableModel modelo = new DefaultTableModel();
			JTable table = new JTable(modelo);
			table.setBounds(10, 62, 1064, 358);
			
			modelo.addColumn("Código");
			modelo.addColumn("Nombre");
			modelo.addColumn("Correo");
			modelo.addColumn("Edad");
			modelo.addColumn("Sexo");
			modelo.addColumn("Respuestas");
			modelo.addColumn("Nivel madurez");
			modelo.addColumn("Elección");
			
			Object [] noms = new Object[8];
			noms[0] = "Codigo";
			noms[1] = "Nombre";
			noms[2] = "Correo";
			noms[3] = "Edad";
			noms[4] = "Sexo";
			noms[5] = "Respuestas";
			noms[6] = "Nivel madurez";
			noms[7] = "Eleccion profesional";
			modelo.addRow(noms);
			
			while (rs.next()) {
				Object [] fila = new Object[8];
				
				
				for (int i=0;i<8;i++)
				      fila[i] = rs.getObject(i+1);
				modelo.addRow(fila);
				
			}
			conexion.close();
			contentPane.add(table);
			
			JButton btnNewButton = new JButton("Volver");
			btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					volver(cod);
				}
			});
			btnNewButton.setBounds(518, 431, 89, 23);
			btnNewButton.setBackground(Color.white);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Torta demogr\u00E1fica por sexo");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						grafSexo();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
			btnNewButton_1.setBounds(10, 28, 265, 23);
			btnNewButton_1.setBackground(Color.white);
			contentPane.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Torta demogr\u00E1fica por edad");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						grafEdad();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 12));
			btnNewButton_2.setBounds(825, 28, 249, 23);
			btnNewButton_2.setBackground(Color.white);
			contentPane.add(btnNewButton_2);
		}
	void grafSexo() throws SQLException {
		int contador=0,m=0,f=0;
		
		Conexion con=new Conexion();
		Connection conexion = (Connection) con.getConexionMYSQL();
		Statement s=(Statement)conexion.createStatement();
		ResultSet rs= (ResultSet) s.executeQuery("select * from alumno");
		
		while (rs.next()) {			
			contador++;
			if (rs.getObject(5).equals("F")) {
				System.out.print("muj");
				f++;
			}else if(rs.getObject(5).equals("M")) {
				m++;
			}
			
		}
		DefaultPieDataset data = new DefaultPieDataset();
        
		data.setValue("Masculino "+(100*m/contador)+"%", 100*m/contador);
        data.setValue("Femenino " +(100*f/contador)+"%", 100*f/contador);
        //data.setValue("Category 3", 79.5);
        // create a chart...
        
        JFreeChart chart = ChartFactory.createPieChart(
            "Torta demográfica por sexo",
            data,
            true, // legend?
            true, // tooltips?
            false // URLs?
        );
        // create and display a frame...
        ChartFrame frame = new ChartFrame("Torta demográfica", chart);
        frame.pack();
        
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
	}
	void grafEdad() throws SQLException {
		float contador=0;
		ArrayList <Integer> edades = new ArrayList <Integer>();
		//ArrayList <Double> porcentajes = new ArrayList <Double>();
		
		Conexion con=new Conexion();
		Connection conexion = (Connection) con.getConexionMYSQL();
		Statement s=(Statement)conexion.createStatement();
		ResultSet rs= (ResultSet) s.executeQuery("select * from alumno");
		
		while (rs.next()) {			
			contador++;
			edades.add((Integer) rs.getObject(4));
			/*
			if (rs.getObject(4).equals("F")) {
				System.out.print("muj");
				f++;
			}else if(rs.getObject(4).equals("M")) {
				m++;
			}
			*/
			
		}
		DefaultPieDataset data = new DefaultPieDataset();
        
		for(int i=0;i<edades.size();i++) {
			int frec = 0;
			//System.out.println(data.getIndex(edades.get(i)));
			
			for(int j=0;j<edades.size();j++) {
				if(edades.get(i)==edades.get(j)) {
					frec++;
				}
			}
			System.out.println(frec/contador);
			data.setValue(edades.get(i), 100*frec/contador);
		}
		
		//data.setValue("Masculino "+(100*m/contador)+"%", 100*m/contador);
        //data.setValue("Femenino " +(100*f/contador)+"%", 100*f/contador);
        //data.setValue("Category 3", 79.5);
        // create a chart...
        
        JFreeChart chart = ChartFactory.createPieChart(
            "Torta demográfica por edad",
            data,
            true, // legend?
            true, // tooltips?
            false // URLs?
        );
        // create and display a frame...
        ChartFrame frame = new ChartFrame("Torta demográfica", chart);
        frame.pack();
        
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
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
