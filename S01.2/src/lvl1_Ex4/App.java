package lvl1_Ex4;

public class App {

	public static void main(String[] args) {
		try {
			User u1=new User("P");
		}catch (NameInvalidCharacter e) {
			System.err.println(e.toString());
		}

	}

}
