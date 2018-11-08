package LinkedList;

public class Node {

	private Node next = null;
	private int Value;

	public Node(int Value) {
		this.Value = Value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getValue() {
		return Value;
	}

	public void setValue(int value) {
		Value = value;
	}
	
	
}