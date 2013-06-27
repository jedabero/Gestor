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
	
	/**
	 * Crea un item sin identificación (0), sin nombre especifico(nn), con valor 0,
	 * ninguna categoria(NA) ni descripcion(N/A).
	 */
	public Item (){
		this(0, "nn", 0d, Categoria.NA, "N/A");
	}
	
	/**
	 * Crea un item con un numero de identificacion, un nombre y un valor.
	 * La categoria y la descripcion pueden ser agregadas luego con los respectivos setters.  
	 * @param id numero de identificación del item desde 10001 hasta 99999
	 * @param nombre el nombre para identificar el item.
	 * @param valor el valor que tiene el item
	 */
	public Item (int id, String nombre, double valor){
		this(id, nombre, valor, Categoria.NA, "N/A");
		
	}
	
	/**
	 * Crea un item con un numero de identificacion, un nombre, un valor en una categoria y con una descripcion.
	 * @param id numero de identificación del item desde 10001 hasta 99999
	 * @param nombre el nombre para identificar el item.
	 * @param valor el valor que tiene el item
	 * @param categ la categoria a la que pretece el item
	 * @param descrip una descripcion con más detalles del item 
	 */
	public Item (int id, String nombre, double valor, Categoria categ, String descrip){
		this.setId(id);
		this.setValor(valor);
		this.setNombre(nombre);
		this.setCategoria(categ);
		this.setDescripcion(descrip);
	}
	
	/**
	 * Crea un item con todas las caracteristicas, cada una debe estar incluida
	 * en el vector split.
	 * Los siguientes campos se deben encontrar en los respectivos indices del vector:
	 * <ul>
	 * 	<li>0: Numero de identificacion</li>
	 * 	<li>1: Nombre para identificar el item</li>
	 * 	<li>2: Valor del item</li>
	 * 	<li>3: Categoria a la que pertenece el item</li>
	 * 	<ul>La categoria tiene que ser una de estas:
	 * 		<li>PAN</li>
	 * 		<li>FRITO</li>
	 * 		<li>BEBIDA</li>
	 * 		<li>POSTRE</li>
	 * 		<li>HOJALDRA</li>
	 * 		<li>OTROS</li>
	 * 		<li>NA</li>
	 * 	</ul>
	 * 	<li>4: Descripcion del item</li>
	 * </ul>
	 * @param split
	 */
	public Item (String[] split){
		this(
				Integer.parseInt(split[0]),
				split[1],
				Double.parseDouble(split[2]),
				Enum.valueOf(Categoria.class, split[3]),
				split[4]);
	}
	
	/**
	 * Crea un item a partir de una cadena que debe contener la información del
	 * item separada por una expresion especifica y diferente que no esté dentro
	 * de cada uno de los campos del item.
	 * Así, por ejemplo, la cadena "10001|Croassan|2000.0|PAN|Delicioso pan"
	 * daria los siguientes resultados con 
	 * <table cellpadding=1 cellspacing=0 summary="Ejemplos">
     * <tr>
     *  <th>Regex</th>
     *  <th>Resultado</th>
     * </tr>
     * <tr><td align=center>|</td>
     *     <td><tt>{ "10001", "Croassan", "2000.0", "PAN", "Delicioso pan" }</tt></td></tr>
     * <tr><td align=center>e</td>
     *     <td><tt>{ "10001|Croassan|2000.0|PAN|D", "licioso pan"}</tt></td></tr>
     * <tr><td align=center>a</td>
     *     <td><tt>{ "10001|Cro", "ss", "n|2000.0|PAN|Delicioso p", "n" }</tt></td></tr>
     * </table>
	 * @param s la cadena con la informacion del item
	 * @param regex la expresion unica que separa los campos 
	 */
	public Item (String s, String regex){
		this(s.split(regex));
	}
	
	public String toString(){
		return id+"|"+nombre+"|"+valor+"|"+categoria+"|"+descripcion;
	}
	
}
