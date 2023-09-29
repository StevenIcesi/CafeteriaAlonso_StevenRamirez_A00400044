public class Order {

	private Cafe[] order;
	private int cantOrder;

	public Cafe[] getOrder() {
		return this.order;
	}

	/**
	 * 
	 * @param order
	 */
	public void setOrder(Cafe[] order) {
		this.order = order;
	}

	public int getCantOrder() {
		return this.cantOrder;
	}

	/**
	 * 
	 * @param cantOrder
	 */
	public void setCantOrder(int cantOrder) {
		this.cantOrder = cantOrder;
	}

	/**
	 * 
	 * @param cantBebidas
	 */
	public Order(int cantBebidas) {
		// TODO - implement Order.Order
		throw new UnsupportedOperationException();
	}

	/**
	 * En caso de que el arreglo este lleno retorna false
	 * @param cafeType
	 * @param milkType
	 * @param cream
	 * @param suggarLevel
	 */
	public boolean addOrder(int cafeType, int milkType, boolean cream, int suggarLevel) {
		// TODO - implement Order.addOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cafeType
	 * @param milkType
	 * @param cream
	 * @param suggarLevel
	 */
	public double calcPrice(int cafeType, int milkType, boolean cream, int suggarLevel) {
		// TODO - implement Order.calcPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * En caso de que el arreglo de order este vacio, retorna false
	 */
	public boolean showOrder() {
		// TODO - implement Order.showOrder
		throw new UnsupportedOperationException();
	}

}