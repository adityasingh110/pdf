import java.util.*;
public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eg=new Scanner(System.in);
		System.out.println("How may eggs do you want");
		int eggs=eg.nextInt();
		float d_price=0;
		float IndividualEggPrice=0;
		int dozens=eggs/12;
		int individual=eggs%12;
		d_price=(float) (dozens*56.3);
		IndividualEggPrice=(float) (individual*9.7);
		System.out.println("You have ordered"+eggs+"eggs");
		System.out.println("thats"+dozens+"dozens at Rs"+ d_price+"per_dozen");
}
}
		
		
		
		

