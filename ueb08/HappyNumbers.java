class HappyNumbers {
	public static void main(String[] args)
	{
		//argument test block
		if (args.length != 1)
		{
			System.out.println("Aufruf: HappyNumbers <zahl groesser 2>");
			return;
		}
		int n = Integer.parseInt(args[0]);
		if (n <= 2)
		{
			System.out.println("Wert nicht erlaubt!");
			return;
		}
		//argument test block ende
		boolean w[] = new boolean[n];
    w[0] = true;
		numbers(w);
		System.out.println("Returns: ");
		for (int i = 0; i < w.length; i++)
		{
			if (w[i] == false)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void numbers(boolean[] w)
	{
		for (int i = 2; i < w.length; i++)
		{
			int c = 0;
			for (int k = 1; k < w.length; k++)
			{
				if (w[k] == false)
				{
					if (++c == i)
					{
						w[k] = true;
						c    = 0;
					}
				}
			}
		}
	}
}
