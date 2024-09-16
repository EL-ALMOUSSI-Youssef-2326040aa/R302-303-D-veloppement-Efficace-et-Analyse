package test;

public class DNode {

	private int element;
	private DNode next, prev;
	
	
	public DNode(int e, DNode p, DNode n) {
		element = e;
		prev = p;
		next = n;
	}
	
	public int getElement() {
		
		return element;
	}
	
	public DNode getNext() {
		return next;
	}
	
	public void setElement(int newElem) {
		element = newElem;
	}
	
	public void setNext(DNode newNext) {
		next = newNext;
	}
}
