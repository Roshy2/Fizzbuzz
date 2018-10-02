
public class Paskalischesdreieck {

	public static int pd(int z, int i){
		if(i == 0){
			return 1;
		}
		if(z == i){
			return 1;
		}
		
		return pd(z-1,i-1) + pd(z-1, i);
	}
	
	public static void main(String[] args) {
		System.out.println(pd(5,2));

	}

}
