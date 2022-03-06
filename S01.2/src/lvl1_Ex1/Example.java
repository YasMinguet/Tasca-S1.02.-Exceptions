package lvl1_Ex1;

public class Example {
	
	Example(){
		System.out.println("Constructor");
		try {
			throw new Exception("demo");
		}catch(Exception ex) {
			System.err.println("Excepción gestionada: "+ex.getMessage());
		}finally {
			System.out.println("Finaliza");
		}
	}

}
