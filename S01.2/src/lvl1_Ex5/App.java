package lvl1_Ex5;

import java.util.*;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean esNum=false;
		while(esNum==false){
			try {		
				System.out.println("Introduce un número:");
				int num=sc.nextInt();
				if (num>0) {
					System.out.println("El número es correcto.");
					esNum=true;
				}else {
					System.out.println("El número no puede ser menor o igual que cero.");
				}
			}catch(InputMismatchException e){
				System.err.println(e.getClass());
				System.err.println("¡Error! Debes ingresar solamente números.");
				sc.nextLine();
			}
				
		}
	}
}
