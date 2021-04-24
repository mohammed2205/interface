interface fun{
	String x ="no";
	
	void lol();
	
}


public class Test implements fun {

	public static void main(String[] args) {
	System.out.println(x);
	
	Test t =new Test();
	t.lol();
		
	}

public void lol() {
	System.out.println("yeah");
}
}
