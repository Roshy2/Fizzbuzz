package Person_interface;

public class Haus implements IBiggerThan<Haus>{

	private int age;
	
	@Override
	public boolean isBiggerThan(Haus o) {
		if(this.age > o.age){
			return true;
		}else{
			return false;
		}
	}	
}
