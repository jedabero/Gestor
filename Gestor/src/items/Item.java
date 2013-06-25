package items;

/**
 * @author jedabero
 *
 */
public class Item {
	
	private double precio;
	private String nombre;
	private long id;
	
	/**
	 * @return el valor del item
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio el nuevo valor del item
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el numero de identificacion
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id la nueva id
	 */
	public void setId(long id) {
		this.id = id;
	}

	public Item (){
		this.setPrecio(0d);
		this.setNombre("");
		this.setId(0L);
	}
	
	public Item (double precio, String nombre, long id){
		this.setPrecio(precio);
		this.setNombre(nombre);
		this.setId(id);
	}
	
	
}
