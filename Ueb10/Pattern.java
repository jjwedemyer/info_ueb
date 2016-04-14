public class Pattern {
	public static void main(String args[])
	{
		int       i = 1;
		double    price;
		DayTrader trader = null;

//Man könnte ja auch nen falsch eingabe abfangen.... So mit nem error output und so... und mit System.exit(1);
		while (!StdIn.isEmpty())
		{
			price = StdIn.readDouble();
			if (trader == null)
			{
				trader = new DayTrader(price);
			}
			else
			{
				trader.setPrice(price);
			}
			System.out.printf("%5d  %8.2f    %s\n", i, price, trader);
			i++;
		}
	}
}
