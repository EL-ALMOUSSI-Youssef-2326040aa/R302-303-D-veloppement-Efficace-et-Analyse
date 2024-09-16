package test;

public class LinkedList {
	private Node head;
	private int size;

	public LinkedList(){
		head=null;
		size=0;
	}

	public void ajouter(int name) {
		if (head == null) {
			head = new Node(name,null); 
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext(); 
			}
			Node next=new Node(name,null); 
			current.setNext(next);
		}
	}

	public void afficher() {
		Node nouveau=head;
		while(nouveau.getNext()!=null) {
			System.out.println(nouveau.getElement());
			nouveau=nouveau.getNext();
		}
		System.out.println(nouveau.getElement());
	}

	public void Insertion_en_tete(int name) {
		if (head == null) {
			head = new Node(name,null); 
		} else {
			Node ancien_head=head;
			head = new Node(name,ancien_head);
		}
	}

	public void trouve_avant_dernier() {
		Node nouveau=head;
		while(nouveau.getNext().getNext()!=null) {
			nouveau=nouveau.getNext();
		}
		System.out.println(nouveau.getElement());
	}

	public void reverse() {
		Node previous = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.getNext(); 
			current.setNext(previous); 
			previous = current; 
			current = next; 
			head = previous;
		}
	}

	public void Update(int changerNoeud,int nouvelleValeur) {
		Node nouveau=head;
		while(nouveau.getNext()!=null) {
			if(nouveau.getNext().getElement()==(changerNoeud)) {
				Node next=nouveau.getNext();
				nouveau.getNext().setElement(nouvelleValeur);
				nouveau.setNext(next);
			}
			nouveau=nouveau.getNext();
		}
	}

	public void Delete (int supprimeNoeud) {
		Node nouveau=head;
		while(nouveau.getNext()!=null) {
			if(nouveau.getNext().getElement()==supprimeNoeud) {
				Node next=nouveau.getNext();
				nouveau.setNext(next.getNext());
			}
			nouveau=nouveau.getNext();
		}
	}

	public void Echanger(int echange1,int echange2) {
		Node nouveau=head;
		while(nouveau.getNext() != null) {
			if(nouveau.getElement() == echange1) {
				nouveau.setElement(echange2);
				nouveau=nouveau.getNext();
				continue;
			}
			if(nouveau.getElement() == echange2) {
				nouveau.setElement(echange1);
				nouveau=nouveau.getNext();
				continue;
			}
			nouveau=nouveau.getNext();
		}
	}
}

