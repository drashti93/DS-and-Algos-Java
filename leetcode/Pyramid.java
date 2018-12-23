package leetcode;


public class Pyramid {

	public static void main(String[] args) {
		
		for(int i=0; i<15; i++) {
			if(i<9) {
			for(int j=1; j<=36;j++) {
				if(i%2 == 0 && j<=6) {
					System.out.print("*");
					System.out.print(" ");
				}
				else if(i%2!=0 && j<=6) {
					System.out.print(" ");
					if(j != 6) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
						continue;
					}
				}
				else {
					if(i%2 != 0 && j==6) {
					System.out.print("  ");
					}
					System.out.print("=");
				}
			}
			}
			else {
				for(int j=0; j<42;j++)
				System.out.print("=");
			}
			System.out.print("\n"); 
		}
		
		
		
	}

}
