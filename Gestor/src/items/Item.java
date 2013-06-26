package items;

/**
 * @author jedabero
 *
 */
public class Item {

	private int id;
	private double valor;
	private String nombre;
	private String categoria;
	private String descripcion;
	
	/**
	 * @return el numero de identificacion
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id la nueva id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return el valor del item
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor el nuevo valor del item
	 */
	public void setValor(double valor) {
		this.valor = valor;
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
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Item (){
		this(0, null, 0d, null, null);
	}
	
	public Item (int id, String nombre, double valor){
		this(id, nombre, valor, "N/A", "N/A");
		
	}
	
	public Item (int id, String nombre, double valor, String categ, String descrip){
		 this.setId(id);
		 this.setValor(valor);
		 this.setNombre(nombre);
		 this.setCategoria(categ);
		 this.setDescripcion(descrip);
	}
	
}
