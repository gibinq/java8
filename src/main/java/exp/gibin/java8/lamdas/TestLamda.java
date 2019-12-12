package exp.gibin.java8.lamdas;
/*
 * Java lambda expressions are Java's first step into functional programming. 
 * A Java lambda expression is thus a function which can be created without belonging to any class.
 * A Java lambda expression can be passed around as if it was an object and executed on demand.
 * 
 */

/*
 * Matching lamda to the interface
 * Does the interface have only one abstract (unimplemented) method?
	Does the parameters of the lambda expression match the parameters of the single method?
	Does the return type of the lambda expression match the return type of the single method?
 * @author WIIS
 *
 */

public class TestLamda {

	public static void main(String[] args) {
		System.out.println("Testing lamda");
		lamdaIface lmdf = (int x)-> {System.out.println(2*x);};
		lmdf.lamdaFun(5);
	}

}
