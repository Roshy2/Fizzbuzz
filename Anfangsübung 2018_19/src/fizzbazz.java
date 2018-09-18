
public class fizzbazz {

	public static void main(String[] args) {

		int i;
		for(i=1; i<= 100;i++){
			if(i%3 == 0 && i%12 != 0){
				System.out.print("fizz\n");
			}
			
			if(i%4 == 0 && i%12 != 0){
				System.out.print("buzz\n");
			}
			
			if(i%12 == 0){
				System.out.println("fizzbuzz\n");
			}
			if(i%3 != 0 && i%4 != 0){
				System.out.println(i);
			}
			
		}
	}

}
