package test;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		System.out.println("Ajout d'éléments à la liste : ");
		list.ajouter(10);
		list.ajouter(20);
		list.ajouter(30);	
		list.afficher();
		
		System.out.println("\nInstertion d'un élément en tête ");
		list.Insertion_en_tete(5);
		list.afficher();
		
		System.out.println("\nL'avant-dernier élément de la liste est : ");
		list.trouve_avant_dernier();
		
		System.out.println("\nInversion de la liste : ");
		list.reverse();
		list.afficher();
		
		System.out.println("\nMise à jour (changer 20 en 25): ");
		list.Update(20, 25);
		list.afficher();
		
		System.out.println("\nEchange des éléments 10 et 30 :");
		list.Echanger(10, 30);
		list.afficher();
	}
	
	
}
