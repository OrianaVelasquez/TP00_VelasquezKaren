package ar.edu.unju.edm;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;
import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class Tp00VelasquezKarenApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00VelasquezKarenApplication.class, args);
	
		String nombre=" Karen ";
		System.out.println("Hola mundo, dice " + nombre+ "" +darnombre());
		Estudiante unEstudiante = new Estudiante ();
		unEstudiante.setDni("45172184");
		unEstudiante.setNombre("Karen");
		System.out.println("El estudainte "+ unEstudiante.getNombre()+ " " + unEstudiante.getApellido() + "dice HOLA" );

		Calculadora unCalculadora = new Calculadora ();
		unCalculadora.setN1(8);
		unCalculadora.setN2(5);
		System.out.println("El resultado de la suma es "+ unCalculadora.sumaNumero());
		System.out.println("El resultado de la resta es "+ unCalculadora.restaNumero());
		System.out.println("El resultado de la division es "+ unCalculadora.divisionNumero());
		System.out.println("El resultado de la multiplicacion es"+ unCalculadora.multiplicacionNumero());
		System.out.println("El resultado de la potencia es "+ unCalculadora.potenciaNumero());
		System.out.println("El resultado de la raiz es "+ unCalculadora.raizNumero());
	}

	private static String darnombre() {
		String darnombre="Karen";
		return darnombre;
	}
}