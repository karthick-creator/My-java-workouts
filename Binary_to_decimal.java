
public class Binary_to_decimal {
	public static void main(String[] args) {
		int no = 1000;
		int decimal =0;
		int power = 0;
		while(no>0) {
			int rem = no%10;
			decimal+=rem*(Math.pow(2, power));
			no=no/10;
			power++;
		}
		System.out.println(decimal);
	}
}
