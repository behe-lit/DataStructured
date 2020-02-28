package Àç±Í;

public class Recursion {
	
	public static int recursion(int a) {
		
		if(a>0) {
		System.out.print(a+" ");
		return recursion(a-1);
		} else
			return a;
	}
	
	
	public static void main(String[] args) {
		System.out.print(recursion(30));
	}

}
