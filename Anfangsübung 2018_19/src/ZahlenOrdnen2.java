import java.util.ArrayList;

public class ZahlenOrdnen2 {

	public static long gettime()                             
	{
			  return System.currentTimeMillis();
	}
	
	public static void main(String[] args) {
		long time = gettime();
		int j = 111111;
		int pos = 0;
		ArrayList<Integer> z = new ArrayList<Integer>();
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for(int zl = 0;zl < 100000; zl ++ ){
		z.add((int)((Math.random())* 100 + 1));
		}
		
		while (z.size() > 0) {
			j = 111111;
			pos = 0;
			for (int i = 0; i < z.size(); i++) {
				while (z.get(i) < j && pos < z.size()) {
					j = z.get(i);
					pos = i;
				}
			}
			

			z.remove(pos);
			l.add(j);
		}
		
		System.out.println(l);
		long newtime = gettime() - time;
		System.out.println(newtime);
	}

}
