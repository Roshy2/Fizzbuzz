package swpuebungen2018_19;

import java.util.ArrayList;

public class QuickSort {

	public static ArrayList<Integer> random(int b) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < b; i++) {
			a.add((int) ((Math.random()) * 100 + 1));
		}

		return a;
	}

	public static ArrayList<Integer> qs(ArrayList<Integer> a) {
		ArrayList<Integer> k = new ArrayList<Integer>();
		ArrayList<Integer> g = new ArrayList<Integer>();

		if (a.size() == 1 || a.size() == 0) {
			return a;
		}
		
		int hallo = a.get(0);
		
		for (int j = 1; j <= a.size() - 1; j++) {
			if (hallo > a.get(j)) {
				k.add(a.get(j));
			} else if (hallo < a.get(j)){
				g.add(a.get(j));
			}
		}

		ArrayList<Integer> sort1 = qs(k);
		ArrayList<Integer> sort2 = qs(g);
		sort1.add(hallo);
		sort1.addAll(sort2);

		return sort1;

	}

	public static void main(String[] args) {
		int b = 10;
		ArrayList<Integer> zahl = random(b);
		System.out.println(zahl);
		System.out.print("Sortierte Liste:");
		System.out.println(qs(zahl));
	}

}
