package alphabetspatterns;

public class S {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if((j==0&&i<n/2)||i==0||(i==n/2&&j<=n-1)||(j==n&&i>=n/2&&i<=n)||(i==n&&j<=n))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
