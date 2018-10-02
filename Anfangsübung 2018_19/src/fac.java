
public class fac {
	
		public static int fac(int z){
			int z2 = 1;
		
			for(int i = 1;i <= z; i++){
				z2= z2 * i;
			}
			return z2;
		}
		
		public static void main(String[] args) {
			System.out.println(fac(6));
	}

}
