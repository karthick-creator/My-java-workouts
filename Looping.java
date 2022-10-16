package tamilnadu.chennai;

public class Looping {

	public static void main(String[] args) {
		Looping loop = new Looping();
		loop.repeat_numbers();
		loop.multiples_of_numbers();
		loop.Odd_even_numbers();

	}

	private void Odd_even_numbers() {
		for(int no =1; no<=10;no++) {
			System.out.print((no*2)+" ");
		}
		System.out.println("");
		
		for(int no=1;no<=10;) {
			System.out.print(no+" ");
			no+=2;
		}
		System.out.println("");
		
		for(int no=2;no<=10;) {
			System.out.print(no+" ");
			no+=2;
  		}
		System.out.println("");
		
		//int no=1;
		//while(no<=13) {
		//	System.out.print(no+" ");
		//	no+=3; 
		//}
		System.out.println("");
		
		for(int no=1;no<=10;) {
			System.out.print(no+" ");
			if(no==9) {
				no=0;
			}
			no+=2;
			
		}
		
		
	}

	private void multiples_of_numbers() {
		for(int no=1;no<=6;no++) {
			System.out.print(no*11+" ");
		}
		System.out.println("");
		
		int no=1;
		for(int i=1;i<=6;i++) {
			System.out.print((no)+" ");
			no*=4;
		}
		
	}

	private void repeat_numbers() {
		for(int i=1;i<=5;i++)
		System.out.print(1+" ");

		System.out.println("");

		for(int i=1;i<=5;i++)
		System.out.print(i+" ");
		
		System.out.println("");
		
		for(int i=1;i<=5;i++)
			System.out.print("Hi"+" ");

			
	}

}
