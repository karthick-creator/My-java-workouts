package tamilnadu.chennai;

public class Pattern_1 {

	public static void main(String[] args) {
		Pattern_1 pat1 = new Pattern_1();
		pat1.star_plus();
		pat1.star_parallal_lines();
		pat1.star_Hallow_square();
		pat1.star_Parallalogram();
		pat1.star_triangle(5);

	}

	private void star_triangle(int no) {
		for(int i=1;i<=no;i++) {
			for(int j=1;j<=no-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*"+" ");
			}
		System.out.println();
		}
		
	}

	private void star_Parallalogram() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=5;j++) {
				System.out.print("*"+" ");
			}
		System.out.println();
		}
		
	}

	private void star_Hallow_square() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1||i==5||j==1||j==5)
					System.out.print("*"+" ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
		
	}

	private void star_parallal_lines() {
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1||j==5)             //if(i==1||i==5)
					System.out.print("*"+" ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
		
	}

	private void star_plus() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				int n = 5;
				if(i==(n/2)+1||j==(n/2)+1)
					System.out.print("*"+" ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
	}

}
