package ar.edu.unju.edm;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class Tp00VelasquezKarenApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00VelasquezKarenApplication.class, args);
	
		String nombre=" Karen ";
		System.out.println("Hola" + nombre+ "" +darnombre());
		Estudiante unEstudiante = new Estudiante ();
		unEstudiante.setDni("45172184");
		unEstudiante.setNombre("Karen");
		System.out.println("el estudainte "+ unEstudiante.getNombre()+ " dice hola");
	}

	private static String darnombre() {
		String darnombre="Karen";
		return darnombre;
	}
}