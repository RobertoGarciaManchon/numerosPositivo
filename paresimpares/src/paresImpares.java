import java.util.Scanner;
public class paresImpares {

	public static void main(String[] args) {
		int contador=0,par=0,impar=0,numero;
		Scanner S=new Scanner(System.in);
		while(contador<10) {
			contador=contador+1;
			System.out.println("Introduzca un n�mero");
			numero=S.nextInt();
			if (numero % 2 == 0) {
				par=par+1;
			} else {
				impar=impar+1;
			}
		}
System.out.println("la cantidad de n�meros pares es"+par+"la cantidad de n�meros impares es: "+impar);
	}

}
