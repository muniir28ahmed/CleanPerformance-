import java.util.ArrayList;

public class Cloning 
{
	public static void main(String[] args) 
	{
		Cloning c = new Cloning();
		
		c.shallowCopyString();
		c.shallowCopyStringBuffer();
		c.deepCopyStringBuffer();
	}

	public void shallowCopyString()
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("x");
		a.add("y");
		a.add("z");
		
		// We can create a new reference 'b' that just points to the same object as 'a'.
		ArrayList<String> b = a;	
	
		// This creates a new list but it shares the same set of references as 'a'.
		ArrayList<String> c = (ArrayList<String>)a.clone();	

		System.out.println("\nShallow Copy - String");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		System.out.println();
		
		// If the objects that are pointed to are immutable, this will not matter.
		// The following call will set the 3rd item in c to point to a new String object "p".
		// 'a' and 'b' should be unaffected
		c.set(2, "p");
		
		System.out.println("c.set(2, \"p\")");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
	}
	
	public void shallowCopyStringBuffer()
	{
		ArrayList<StringBuffer> a = new ArrayList<StringBuffer>();
		ArrayList<StringBuffer> b;
		ArrayList<StringBuffer> c;
		
		a.add(new StringBuffer("x")); 
		a.add(new StringBuffer("y")); 
		a.add(new StringBuffer("z"));

		// We can create a new reference 'b' that just points to the same object as 'a'.
		b = a;
		
		// This creates a new list that shares the same references as the objects in 'a'.
		c = (ArrayList<StringBuffer>)a.clone();

		System.out.println("\nShallow Copy - StringBuffer");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		System.out.println();

		// If we change a value for a mutable object that is pointed to by all 3 list
		// references, then the value in that position will change for all 3 cases (note
		// that 'a' and 'b' are the same list and 'c' is a new list but with references to
		// the same objects held in 'a'.
		c.get(2).replace(0, 1, "p");

		System.out.println("c.get(2).replace(0, 1, \"p\")");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
	}

	/**
	 * This is currently the same code as shallowCopyStringBuffer. You
	 * should modify it so that it makes a completely new version of the
	 * ArrayList c such that the line c.get(2).replace(0, 1, "p"); only
	 * affects c and not the lists a and b.
	 */
	public void deepCopyStringBuffer()
	{
		ArrayList<StringBuffer> a = new ArrayList<StringBuffer>();
		ArrayList<StringBuffer> b;
		ArrayList<StringBuffer> c;
		
		a.add(new StringBuffer("x")); 
		a.add(new StringBuffer("y")); 
		a.add(new StringBuffer("z"));

		// We can create a new reference 'b' that just points to the same object as 'a'.
		b = a;
		
		// This creates a new list that shares the same references as the objects in 'a'.
		c = (ArrayList<StringBuffer>)a.clone();

        StringBuffer sba;
        for (int i=0; i<a.size(); i++)
        {
            sba = a.get(i);
            c.set(i, new StringBuffer(sba));
        }

		System.out.println("\\Deep Copy - StringBuffer");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		System.out.println();

		// If we change a value for a mutable object that is pointed to by all 3 list
		// references, then the value in that position will change for all 3 cases (note
		// that 'a' and 'b' are the same list and 'c' is a new list but with references to
		// the same objects held in 'a'.
		c.get(2).replace(0, 1, "p");

		System.out.println("c.get(2).replace(0, 1, \"p\")");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
	}


	
}
