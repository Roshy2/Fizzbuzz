import java.util.ArrayList;

public class ZahlenOrdnen {

	public static void main(String[] args) {
		ArrayList<Integer> l = new  ArrayList<Integer>();
		for(int ausgabe : l){
		System.out.println(ausgabe);
		}
		}
	
	public static void Sort(ArrayList<Integer> zahl ){
		ArrayList<Integer> zahl1 = new  ArrayList<Integer>();
		ArrayList<Integer> l = new  ArrayList<Integer>();
		zahl1.add(8);
		zahl1.add(4);
		zahl1.add(4);
		zahl1.add(3);
		zahl1.add(12);
		zahl1.add(6);
		zahl1.add(15);
		zahl1.add(7);
		
		
			for(int i=1;1<=100;i++){
				
					if(zahl1.size() % i == 0){
						l.add(zahl1);
					}
				
			}
		}
		
	

}
