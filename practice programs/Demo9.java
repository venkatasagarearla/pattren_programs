package p2;

public class Demo9 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=5;a>=1;a--) {
			for(int b=1;b<=a;b++) {
				System.out.print(" ");
				
			}
			for(int c=1;c<=5;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
