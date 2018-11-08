package LinkedList;

public class LinkedList {

	private Node head = null;

	public void add(int value) {
		Node n = new Node(value);

		// if list is empty to first element
		if (head == null) {
			head = n;
		} else {
			Node tmp = head;
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(n);
		}
	}
// geht nicht ganz
//	public int getValue(int index){
//		Node tmp = head;
//		int i = 0;
//		while (tmp.getNext() != null){
//			if(i == index){
//				return tmp.getValue();
//			}
//			tmp = tmp.getNext();
//			i++;
//	}
//		return -1;
//}
	
	public int getValueFor(int index){
		Node tmp = head;
		for(int i = 0; i < index; i++){
		if(tmp.getNext() == null){
			throw new IndexOutOfBoundsException();
		}else{
			tmp = tmp.getNext();
		}
		
		}
		return tmp.getValue();
}
	
	public int getSize(){
		Node tmp = head;
		int i = 1;
		while (tmp.getNext() != null){
			tmp = tmp.getNext();
			i++;
	}
		
		return i;
	}
	
}
