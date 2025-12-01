import java.util.ArrayList;

public class CoModifier 
{
	public static void main(String[] args) 
	{
		ArrayList<Double> data = new ArrayList<Double>();	
		data.add(1.0);
		data.add(2.0);
		data.add(3.0);
		data.add(4.0);
		
		CoModifier cm = new CoModifier();
		cm.listModifier(data, 1.0);	
	}
	
	public void listModifier(ArrayList<Double> numbers, Double threshold)
	{
		int i = 0;
		
		for (Double d : numbers)
		{
			if (d >= threshold)
			{
				System.out.println("Removing value " + d);
				numbers.remove(i);
			}
			i = i + 1;
		}
	}
	
}
