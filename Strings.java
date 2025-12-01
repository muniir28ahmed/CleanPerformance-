import java.util.ArrayList;
import java.util.function.Function;

public class Strings {
	
	String val;

	public static void main(String[] args) 
	{	
		Strings s = new Strings();
		int repetitions = 10;
		int appends = 100000;
		s.timeTest("stringLoop",s::stringLoop, repetitions, appends);
//		s.timeTest("stringBufferLoop",s::stringBufferLoop, reps, appends);
	}
	
	public String stringLoop(int loops)
	{
		String s = "";		
		for (int l=0; l<loops; l++)
		{
			s = s + ".";
		}
		return s;
	}
		
	public String stringBufferLoop(int loops)
	{
		// Modify the following to use a StringBuffer instead
		// instead of a String to add up all the dots.
		String s = "";		
		for (int l=0; l<loops; l++)
		{
			s = s + ".";
		}
		return s;
	}

	public void timeTest(String name, Function<Integer,String> func,int repeats, int appends)
	{
		long start,end,runtime; 
		double avgTime = 0;	// We will calculate the average time for the calculation
		String result;
		long hashSum = 0;
	
		System.out.printf("Method: %s\nRepetitions: %d\nAppends: %d\n",name,repeats,appends);
		for (int r=0; r<repeats; r++)
		{
			start = System.currentTimeMillis();
			result = func.apply(appends);
			end = System.currentTimeMillis();
			runtime = end-start;
			avgTime = avgTime + runtime;
			// If you don't use the result of a calculation, the compiler
			// may remove all use of it and the method calls involved. Let's
			// calculate a hash and print it to make sure it's used.
			hashSum = hashSum + result.hashCode();
			System.out.printf("%d ",runtime);
		}
		System.out.printf("\nMean of %d runs: %.2fms\t%d\n\n",repeats,avgTime/(double)repeats,hashSum);
	}		
}
