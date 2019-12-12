package exp.gibin.java8.lamdas;

public class TestLamda {

	public static void main(String[] args) {
		System.out.println("Testing lamda");
		lamdaIface lmdf = (int x)-> {System.out.println(2*x);};
		lmdf.lamdaFun(5);
	}

}
