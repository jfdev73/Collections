package course.list;

public class Node {
	
	private Object data;
	
	private Node next;
	
	public Node(Object dato){
		this.data = dato;
		
	}
	//Devuelve el valor del nodo
	public Object value() {
		return this.data;
	}
	
	//Devuleve el nodo con el que esta enlazado
	public Node next() {
		return this.next;
	}
	//Establece con que nodo estara relacionado
	public void setNext(Node next) {
		this.next = next;
		
	}
	
	//valor del nodo
	
	public void showContent() {
		System.out.println("Value -> "+data);
		
	}

}
