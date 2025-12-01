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
		for (int i= 0; i < numbers.size(); i++)
        {
        System.out.println("Removing value " + numbers.get(i));
        numbers.remove(i);
        }

    /*    for (int i= 0; i < numbers.size(); i++)
		{
			if (numbers.get(i) >= threshold)
			{
				System.out.println("Removing value " + numbers.get(i));
				numbers.remove(i);
			}
			i = i + 1;
		}*/
	}
	
}
