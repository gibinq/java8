package exp.gibin.java8.lamdas;

public interface lamdaIface {
	
	public abstract void lamdaFun(int x);
	
	default void normalFun()
	{
		System.out.println("Hello Lamda");
	}
	
	

}
