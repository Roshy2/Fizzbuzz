package swpuebungen2018_19;

import java.util.ArrayList;

public class QuickSort2 {
	public static ArrayList<Integer> random(int b){
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for (int i = 0; i < b; i++){
			a.add((int)((Math.random())*100 +1));
		}
		return a;
	}
	
public static ArrayList<Integer> qs(ArrayList<Integer> a){
	
	int vz = a.get((int)((Math.random())*(a.size()-1)));
	int s = a.size();
	
	
	
	for(int j = 0; j < s; j++){
		if(a.get(vz) < a.get(j)){
		int swap1 = a.get(vz);
		a.set(vz,a.get(j));
		a.set(j,swap1);

		} 
	}
		
	return a;
	
}

	public static void main(String[] args) {
		int b = 5;
		ArrayList<Integer> zahl = random(b);
		System.out.println(zahl);
		System.out.print("Sortierte Liste:");
		System.out.println(qs(zahl));
	}

}
