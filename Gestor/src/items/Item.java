package items;

/**
 * @author jedabero
 *
 */
public class Item {
	
	private double precio;
	private String nombre;
	private long id;
	
	public Item (){
		this.precio = 0d;
		this.nombre = "";
		this.id = 0L;
	}
	
	public Item (double precio, String nombre, long id){
		this.precio = precio;
		this.nombre = nombre;
		this.id = id;
	}
	
	
}
