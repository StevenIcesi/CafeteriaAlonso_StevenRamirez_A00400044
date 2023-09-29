public class Cafe {

	private CafeType cafeType;
	private MilkType milkType;
	private boolean cream;
	private SuggarLevel suggarLevel;
	private double price;

	public CafeType getCafeType() {
		return this.cafeType;
	}

	/**
	 * 
	 * @param cafeType
	 */
	public void setCafeType(CafeType cafeType) {
		this.cafeType = cafeType;
	}

	public MilkType getMilkType() {
		return this.milkType;
	}

	/**
	 * 
	 * @param milkType
	 */
	public void setMilkType(MilkType milkType) {
		this.milkType = milkType;
	}

	public boolean getCream() {
		return this.cream;
	}

	/**
	 * 
	 * @param cream
	 */
	public void setCream(boolean cream) {
		this.cream = cream;
	}

	/**
	 * 
	 * @param cafeType
	 * @param milkType
	 * @param cream
	 */
	public Cafe(CafeType cafeType, MilkType milkType, boolean cream) {
		// TODO - implement Cafe.Cafe
		throw new UnsupportedOperationException();
	}

	public SuggarLevel getSuggarLevel() {
		return this.suggarLevel;
	}

	/**
	 * 
	 * @param suggarLevel
	 */
	public void setSuggarLevel(SuggarLevel suggarLevel) {
		this.suggarLevel = suggarLevel;
	}

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}