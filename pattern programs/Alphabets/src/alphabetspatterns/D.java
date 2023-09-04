package alphabetspatterns;

public class D {

	public static void main(String[] args) {
		int n=11;
		for(int i=0; i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||(j==n&&i>=2&&i<=9)||(i==1&&j==n-1)||(i==0&&j<=n-2)||(i==n&&j<=n-2)||(i==n-1&&j==n-1))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		

	}

}
