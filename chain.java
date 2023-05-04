package classwork_collection;

public class chain {
	    chain()
	    {
	    	this(5);
	    	System.out.println("default constructor");
	    }
	    chain(int x)
	    {
	    	this(3,15);
	    	System.out.println(x);
	    }
	    chain(int x,int y)
	    {
	    	System.out.println(x+y);
	    }
	    public static void main(String args[])
	    {
	    	new chain();
	    }

}
