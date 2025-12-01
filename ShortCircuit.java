import java.lang.reflect.Array;

public class ShortCircuit {

	public static void main(String[] args) 
	{
		ShortCircuit c = new ShortCircuit();
		int value = -3;
		c.shortAndCircuit(value);
		c.shortOrCircuit(value);
		
		String letters[] = {"a","b","c"};
		String empty[] = {};
		// c.isFirstItem("a", letters);
		// c.isFirstItem("a", empty);
	}

	public String shortAndCircuit(int x)
	{
		if (isNegative(x) && isLow(x))
			return "low";
		else
			return "high";
	}
	
	public String shortOrCircuit(int x)
	{
		if (isNegative(x) || isLow(x))
			return "low";
		else
			return "high";
	}
	
	public boolean isNegative(int v)
	{
		return (v < 0);
	}

	public boolean isLow(int v)
	{
		return (v < 10);
	}
	
	public boolean isFirstItem(String word, String[] items)
	{
		return (items[0].equals(word));
	}
	
	public boolean isNotEmpty(String[] a)
	{
		return (a != null && a.length > 0);
	}
}
