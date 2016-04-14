public class DayTrader {
	public static final boolean BUY;
	public static final boolean SELL;
	public static final boolean NONE;

	public DayTrader(double p, boolean buy, boolean sell, boolean none)
	{
    BUY = buy;
    SELL = sell;
    NONE = none;
		price = p;
	}

	// setter ----------------------------------------------
	public void setPrice(double p)
	{
		price = p;
	}

	// private ---------------------------------------------
	private double price;
  private Node current;

	//output------------------------------------------------
	@Override
	public String toString()
	{
		return "";
	}
}
