package course.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Iterator;

public class DeleteProductos {
	public static void main(String[] args) {
		String [] marcas = {"H&M", "Lacoste"};
		Producto [] pro =Producto.getProductos() ;
		
		List<Producto> productos = new ArrayList<>(Arrays.asList(pro));
		System.out.println("Antes del delete");
		for (Producto producto : productos) {
			System.out.println("Producto->: "+producto);
			
		}
		//eliminarMarcas(productos, Arrays.asList(marcas));
		eliminarMarcasStream(productos, Arrays.asList(marcas));
		
		System.out.println("Despues de delete");
		
		for (Producto producto : productos) {
			System.out.println("Producto->: "+producto);
			
		}
		
	}
	
	private static void eliminarMarcasStream(List<Producto> productos,List <String> marcas ) {
		productos.removeIf((producto)-> marcas.contains(producto.getMarca()));
		
		
		
	}
	
	private static void eliminarMarcas(List<Producto> productos,List <String> marcas ) {
		/*Para este ejercicio se debe usar el iterator ya que con el for each tradicional no permite
		 * modificar el arreglo mientras se va iterando*/
		for(Iterator<Producto> iterator = productos.listIterator(); iterator.hasNext();) {
			
			if(marcas.contains(iterator.next().getMarca())) {
				iterator.remove();
				
			}
			
		}
		/*
		for (Producto producto : productos) {
			if(marcas.contains(producto.getMarca())) {
				System.out.println("producto a eliminar: "+producto);
			
				productos.remove(producto);
			
				
			}*/
			
			
		
		
	}
	
	
	
	
	

	
}
