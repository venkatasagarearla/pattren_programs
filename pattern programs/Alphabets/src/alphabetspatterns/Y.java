package alphabetspatterns;

public class Y {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if((i+j==11&&i<=n)||(i==j&&i<=n/2))

				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

	}		

	}

}
