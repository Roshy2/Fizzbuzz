package Person_interface;

public class Person implements IBiggerThan<Person> {
	private String firstname;
	private String lastname;
	private int age;
	
	public Person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [ lastname:" + lastname + "]";
	}


	public boolean isBiggerThan(Person p) {
		Person pe = (Person)p;
		int shortestNameLength = 0;			
		if(this.lastname.length() < pe.getLastname().length()){
			shortestNameLength = this.lastname.length();
		}else{
			shortestNameLength = pe.getLastname().length();
		}
		for(int i = 0; i< shortestNameLength;i++){
			if(this.lastname.charAt(i) > pe.getLastname().charAt(i)){
				return true;
			}else if(this.lastname.charAt(i) < pe.getLastname().charAt(i)){
				return false;
			}
		}
		return true;
	}
	
}
