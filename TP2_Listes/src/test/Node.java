package test;
public class Node {
	
	private int element;
	private Node next;
	
	public Node(int nom, Node n) {
		element = nom;
		next = n;
	}
	
	

	public int getElement() {
		
		return element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node newNext) {
		this.next = newNext;
	}

	public void setElement(int newElem) {
		element = newElem;
	}
	
}