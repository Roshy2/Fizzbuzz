
public class Fibonacci {

	public static int Fibu(int a) {
		if (a == 0) {
			return 0;
		}
		if (a == 1) {
			return 1;
		}
		if (a == 2) {
			return 1;
		}
		return Fibu(a - 1) + Fibu(a - 2);
	}

	public static void main(String[] args) {
			System.out.println(Fibu(17));
	}

}
