package cadena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaTest {
	Cadena cadena = new Cadena();

	@Test
	void testLongitud() {
		String palabra = "pato";
		int longitud = palabra.length();
		assertEquals(longitud, cadena.longitud(palabra));
	}
	
	@Test
	void testVocales() {
		String palabra = "pato";
		int numeroVocales = 2;
		assertEquals(numeroVocales, cadena.vocales(palabra));
	}
	
	@Test
	void testInvertir() {
		String palabra = "pato";
		String palabraInvertida = "otap";
		assertEquals(palabraInvertida, cadena.invertir(palabra));
	}
	
	@Test
	void testContarLetra() {
		String palabra = "pato";
		char caracter = 'p';
		int numeroCaracter = 1;
		assertEquals(numeroCaracter, cadena.contarLetra(palabra, caracter));
	}

}
