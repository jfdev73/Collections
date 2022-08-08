package course.list;

import java.util.LinkedList;

public class SimpleLinkedList {

	private Node first; // Referencia al primer nodo de la lista enlazad

	public SimpleLinkedList() {
		this.first = null;
	}

	public void push(Object object) {
		// Este nuevo nodo sera la cabeza de la lista enlazada simple

		Node newNode = new Node(object);
		newNode.setNext(this.first);
		this.first = newNode;

	}

	public Node pop() {
		Node temp = this.first; // Guarda referencia al primer nodo en la variable temp
		this.first = this.first.next();
		return temp;
	}

	public Node delete(Object val) {
		Node currentNode = this.first;

		Node previusNode = this.first;

		while (!currentNode.value().equals(val)) {
			if (currentNode.next() == null) {
				return null;

			} else {
				previusNode = currentNode;
				currentNode = currentNode.next();
			}

			if (currentNode == this.first) {
				this.first = this.first.next();

			} else {
				previusNode.setNext(currentNode.next());
			}

		}
		return currentNode;

	}

	public Boolean isEmpty() {
		return (this.first == null);

	}

	public Node contains(Object value) {
		Node currentNode = this.first;
		while (currentNode.value() .equals(value)) {
			
			if(currentNode.next()==null) {
				return null;
				
			}else {
				currentNode = currentNode.next();
			}

			currentNode.showContent();
			currentNode = currentNode.next();

		}
		return currentNode;

	}

	public void printContent() {
		Node currentNode = first;
		System.out.println("Mostrar elementos de la lista enlazada");
		while (currentNode != null) {

			currentNode.showContent();
			currentNode = currentNode.next();

		}
	}
}
