package lvl1_Ex2;

public class App {

	public static void main(String[] args) {
		String example=null;
		try{
			example.charAt(3);
		}catch(NullPointerException e){
			System.err.println("Excepción gestionada: "+e.toString());
		}

	}

}
