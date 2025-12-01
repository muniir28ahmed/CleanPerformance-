public class Equality 
{	
	public static void main(String [] args)
	{
		String h1 = new String("hello");
		String h2 = new String("hello");
		
		String h3 = "hello";
		String h4 = "hello";
				
		System.out.println(h1==h2);
		
		System.out.println(h1.equals(h2));
		System.out.println(h3.equals(h4));
		System.out.println(h1.equals(h4));		

		System.out.println(h3==h4);
	}
}
