package Clases;

import java.util.ArrayList;

public class Prueba {
	ArrayList <String> preguntas = new ArrayList <String>();
	String tipoRespuesta;
	//String modoEvaluacion;
	private ArrayList <Alumno> tabulacionG = new ArrayList <Alumno>();
	
	public Prueba(ArrayList<String> preguntas, String tipoRespuesta, ArrayList<Alumno> tabulacionG) {
		super();
		this.preguntas = preguntas;
		this.tipoRespuesta = tipoRespuesta;
		this.tabulacionG = tabulacionG;
	}

	public ArrayList<String> getPreguntas() {
		return preguntas;
	}

	public String getTipoRespuesta() {
		return tipoRespuesta;
	}

	public ArrayList<Alumno> getTabulacionG() {
		return tabulacionG;
	}
	
	public String mostrarPregunta(int indice) {
		return preguntas.get(indice-1);
	}
	public String mostrarPreguntas() {
		String texto = "Esta prueba evalua el nivel de madurez vocacional tomando en cuenta 5 categorías: Planificación, exploración, información, realismo, toma de decisiones.\n\nTipo de respuestas: "+getTipoRespuesta()+"\n\nPreguntas:\n\n";
		for(int i = 0; i < preguntas.size(); i++) {
			texto += i+1+".-  "+preguntas.get(i)+"\n";
		}
		return texto;
	}
	
	public void evaluarRespuestas(ArrayList<String> respuestas) {
		
	}
	
	public void mostrarResultadoAlumno(String cod) {
		
	}
	
	public void mostrarTabulacionGeneral() {
		
	}
}
