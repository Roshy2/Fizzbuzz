package LinkedList;

public class Main {
	
	public static void main(String[] args) {
		int a = 10;
		LinkedList ll = new LinkedList();
		for(int i = 0;i < a;i++){
		ll.add(i);
		}
		for(int i = 0; i<a;i++){
			System.out.println(ll.getValueFor(i));
			
		}
		System.out.println("----");
		System.out.println(ll.getSize());
	}
	
}
