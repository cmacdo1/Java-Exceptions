// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************

public class MathUtils
{
	//-------------------------------------------------------------
	// Returns the factorial of the argument given
	//-------------------------------------------------------------
	public static int factorial(int n) throws IllegalArgumentException
	{
		if( n < 0)
			throw new IllegalArgumentException("Negative numbers are not allowed.");
		
		if( n > 12)
			throw new IllegalArgumentException("Must be 12 or less.");
		
		int fac = 1;
		for (int i=n; i>0; i--)
			fac *= i;
		return fac;
	}
}
