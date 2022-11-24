package unico;

public class Ej_03 {

	public static void main(String[] args) {
		/* Implementar un método que realice la multiplicación de dos números (sin utilizar el operador *)
3*5 = 3+3+3+3+3

Ayuda para el pensamiento recursivo: 3*5 = 3 + (3*4)

*/
		int n1;
		int n2;
		int res;
		n1=Util.leerInt("Escribe un número: ");
		n2=Util.leerInt("Escribe otro número: ");
		
	}

	public static int multiplicacion(int n1, int n2) {
		int res;
		if(n1 == 1) {
			res= n2;
		}else {
			res= n1 + multiplicacion(n1,n2-1);
		}
		return res;
	}
}
