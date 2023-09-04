package alphabetspatterns;

public class U {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0&&i<n-1||j==n&&i<n-1||i==n&&j>2&&j<9||i==n-1&&j==1||(i==n-1&&j==10))

				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

	}

	}

}
