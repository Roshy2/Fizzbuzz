package Person_interface;

import java.util.ArrayList;

public class Main {
//public static void bubbleSort(ArrayList<IBiggerThan> p){}


public static ArrayList<IBiggerThan> bubbleSort(ArrayList<IBiggerThan> p){
	IBiggerThan zw;

		for (int j = 0; j < p.size(); j++) {
			for (int i = 0; i < p.size() - 1; i++) {
				if (p.get(i).isBiggerThan(p.get(i + 1))) {
					zw=p.get(i);
					p.set(i, p.get(i + 1));
					p.set(i + 1, zw);
				}
			}
		}
		return p;
}


	public static void main(String[] args) {
		ArrayList<IBiggerThan> p = new ArrayList<>();

		p.add(new Person("Seb", "Schoepf", 17));
		p.add(new Person("Mario", "Pilz", 16));
		p.add(new Person("Alex", "Moon", 18));
		p.add(new Person("Simon", "Bernardi",16));
		p.add(new Person("Mario", "Heber", 16));
		p.add(new Person("Alex", "Widerin", 18));
		p.add(new Person("Simon", "Neuner",16));
		
		bubbleSort(p);

//		for (int i = 0; i < p.size() - 1; i++) {
//			if (p.get(i).biggerthan(p.get(i + 1))) {
//				System.out.println("is kleiner");
//			} else if (p.get(i + 1).biggerthan(p.get(i))) {
//				System.out.println("is größer");
//			}
//		}
		System.out.println(p);
	}

}
