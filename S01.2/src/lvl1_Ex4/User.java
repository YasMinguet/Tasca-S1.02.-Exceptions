package lvl1_Ex4;

public class User {
	String name;
	
	User(String name) throws NameInvalidCharacter {
		this.name = name;
		
		if (this.name==null || this.name.length()<2) {
			throw new NameInvalidCharacter(2);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws NameInvalidCharacter {
		this.name = name;
		
		if (this.name==null || this.name.length()<2) {
			throw new NameInvalidCharacter(2);
		}
	}
	

}
