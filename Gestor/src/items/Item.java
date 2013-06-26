package items;

/**
 * @author jedabero
 *
 */
public class Item {

	private int id;
	private double valor;
	private String nombre;
	private Categoria categoria;
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
		
		this.id = ((id>10000)&&(id<100000))?id:0;
		
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
		this.valor =(valor>=0)?valor:0;
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
		this.nombre = (nombre!=null)?nombre:"nn";
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
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
		this.descripcion = (descripcion!=null)?descripcion:"N/A";
	}

	public Item (){
		this(0, "nn", 0d, Categoria.NA, "N/A");
	}
	
	public Item (int id, String nombre, double valor){
		this(id, nombre, valor, Categoria.NA, "N/A");
		
	}
	
	public Item (int id, String nombre, double valor, Categoria categ, String descrip){
		this.setId(id);
		this.setValor(valor);
		this.setNombre(nombre);
		this.setCategoria(categ);
		this.setDescripcion(descrip);
	}
	
}
