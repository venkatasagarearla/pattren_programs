package alphabetspatterns;

public class J {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||j==n/2||(j==2&&i==n-1)||(j==3&&i==n)) 
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();

	}


	}

}
