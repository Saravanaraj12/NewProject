package oops3Abstract_Interface1;

public abstract class Car implements Vehicle{
	String brand,color;
	
	public int showSpeed(int s)
	{
		return s;
	}
	public int getMileage(int m)
	{
		return m;
	}
		public abstract int showEngine(int cc);	
}
