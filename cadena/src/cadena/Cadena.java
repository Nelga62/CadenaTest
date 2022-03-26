package cadena;

public class Cadena {

	public int longitud(String cadena) {
		return cadena.length();
	}

	public int vocales(String cadena) {
		int longitud = longitud(cadena);
		int i = 0;
		int contadorVocales = 0;
		while (i < longitud) {
			char letra = cadena.charAt(i);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á'
					|| letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
				contadorVocales++;
			}
			i++;
		}
		return contadorVocales;
	}

	public String invertir(String cadena) {
		int longitud = longitud(cadena);
		int i = longitud - 1;
		String cadenaInvertida = "";
		while (i >= 0) {
			cadenaInvertida += cadena.charAt(i);
			i--;
		}
		return cadenaInvertida;
	}

	public int contarLetra(String cadena, char caracter) {
		int longitud = longitud(cadena);
		int i = 0;
		int contadorCaracter = 0;
		while (i < longitud) {
			char letra = cadena.charAt(i);
			if (letra == caracter) {
				contadorCaracter++;
			}
			i++;
		}
		return contadorCaracter;
	}

}
