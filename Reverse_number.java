
public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 34556755;
		int count = 0;
		while (no>0) {
			System.out.print(no%10);
			no = no/10;
			count = count+1;
		}
		System.out.println(" ");
		System.out.println("count of digits"+ count);
	}

}
