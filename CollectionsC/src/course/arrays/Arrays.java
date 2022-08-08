package course.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arrays {

	public static void main(String[] args) {
		
		List<String> arr = new ArrayList<>(10);
		
		arr.add("Azul");
		arr.add("Amarillo");
		arr.add("Rosa");
		
		ListIterator<String> list = arr.listIterator();
		
		while(list.hasNext()) {
			
			if(list.next().equals("Amarillo")) {
				list.remove();
			}
			
		}
		
		for(ListIterator<String> iter = arr.listIterator(); iter.hasNext();) {
			
			System.out.println("Color: -> "+iter.next());
			
		}

	}

}
