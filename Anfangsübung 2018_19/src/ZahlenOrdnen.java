import java.util.ArrayList;

public class ZahlenOrdnen {

	public static void main(String[] args) {
		int pos = 0;
		ArrayList<Integer> z = new ArrayList<Integer>();

		for (int zl = 0; zl < 10; zl++) {
			z.add((int) ((Math.random()) * 100 + 1));

			for (int j = 0; j < zl; j++) {
				for (int i = 0; i < z.size() - 1; i++) {
					if (z.get(i) > z.get(i + 1)) {
						z.set(i, z.get(i + 1));
						z.set(i + 1, z.get(i));
					}
				}
			}
		}
		System.out.println(z);
	}
}
